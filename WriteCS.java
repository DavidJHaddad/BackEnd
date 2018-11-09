import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write to central services file to make new central services file
 */
public class WriteCS {

    //Input number for having multiple numbered Central services files
    private static int inputNum;


    //Create the TSF file writer
    private File tsf = new File("CentralServicesFile" + inputNum + ".log");
    private FileWriter writer;

    //Create the writer with a try-catch
    public WriteCS(){
        try{
            writer = new FileWriter(tsf);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //Gets the input num from FrontEnd
    public static void setInt(int num){
        inputNum = num;
    }

    /**
     * Writer to the central services file
     * @param serviceNum service number
     * @param serviceCap capacity
     * @param numTickets # of tickets
     * @param name name
     * @param date date
     */
    public void CSwrite(String serviceNum, int serviceCap, int numTickets, String name, String date){
        //Output to write to Central services file
        String output = serviceNum+ " " + serviceCap + " " + numTickets + " " + name + " " + date;

        //each line is at most 63 characters (plus new line)
        if(output.length() > 63 ){
            System.out.println("Line more than 63 lines (with the addition of newline)");
            return;
        }

        //Write the output to the file
        try {
            writer.write(output);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Close the writer
    public void CSclose(){
        try{
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


}
