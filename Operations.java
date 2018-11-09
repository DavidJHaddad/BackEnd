import java.util.ArrayList;

/**
 * Class that preforms most of the back office work
 * Receives 2 parameters - the parsed Central Services file, the parsed Merged TSF file
 */
public class Operations {

    String[] centralServices;
    String[] mergedTSF;
    ArrayList<Service> csList = new ArrayList<Service>();

    public Operations(String[] centralServices, String[] mergedTSF){
        this.centralServices = centralServices;
        this.mergedTSF = mergedTSF;

    }


}
