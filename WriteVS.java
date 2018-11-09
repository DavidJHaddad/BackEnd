import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write to make new valid services file
 */
public class WriteVS {

    //Input number for having multiple numbered Valid services files
    private static int inputNum;


    //Create the TSF file writer
    private File tsf = new File("ValidServicesFile" + inputNum + ".log");
    private FileWriter writer;

    //Create the writer with a try-catch
    public WriteVS(){
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
     * Write to the valid services file
     * @param num service number
     */
    public void VSwrite(String num){
        //Each line is exactly 5 characters (plusnewline)
        if(num.length() != 5){
            System.out.println("Service number is not correct size");
            return;
        }
        try {
            writer.write(num);
            writer.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Close the writer
    public void VSclose(){
        try{
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
