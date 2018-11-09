/**
 *  Back office class for assignment 4 in CISC 327
 *  This class contains the main function and will do some of the setup work to preform the back office functions
 *  Group #12 (February 31st)
 */

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class BackOffice {

    // main function for the back office classes - accepts in either 2 or 3 arguments depending on if it wants output written to a text file
    // argument order - Central Services, Merged TSF, Output(optional)
    public static void main(String[] args) {

        // Checks if the number of program arguments are correct
        if(args.length != 2 && args.length != 3){
            System.out.println("Error: Incorrect Number of program arguments.");
            System.exit(1);
        }

        // Sets the output stream to a file if the user provided one
        if(args.length == 3){
            File outputFile = new File(args[2]); // output file
            FileOutputStream fos;
            PrintStream ps;
            try{
                fos = new FileOutputStream(outputFile);
                ps = new PrintStream(fos);
                System.setOut(ps);
            }
            catch(FileNotFoundException e){
                System.out.println("Error: Output file does not exist.");
                System.exit(1);
            }
        }
        String[] centralServices;
        String[] mergedTSF;
        // Loads in the central Services and passes it off to be parsed
        try {
            Scanner centralServicesScanner = new Scanner(new File(args[0]));
            centralServices = parseFile(centralServicesScanner);

            Scanner mergedTSFSScanner = new Scanner(new File(args[1]));
            mergedTSF = parseFile(mergedTSFSScanner);

            // passes off the parsed central services and merged TSF to the operations class to work with
            Operations runBackOffice = new Operations(centralServices, mergedTSF);
        }
        catch(FileNotFoundException e){
            System.out.println("Error: Central Services file or Merged Transaction Summary file do not exist.");
            System.exit(1);
        }

    }

    // parses in the files into arrays of each line
    public static String[] parseFile(Scanner scanner){
        ArrayList<String> lines = new ArrayList<String>();

        while(scanner.hasNextLine()){
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }




}
