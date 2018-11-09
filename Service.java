/**
 * A helper object that hold the information about a service.
 */
public class Service {

    private String serviceNumber;
    private String serviceName;
    private String date;
    private int numTickets;
    private int serviceCapacity;
    private int numCancelledTickets;

    public Service(String serviceNumber, String serviceName, String date, int numTickets, int serviceCapacity){
        this.serviceNumber = serviceNumber;
        this.serviceName = serviceName;
        this.date = date;
        this.numTickets = numTickets;
        this.serviceCapacity = serviceCapacity;
        numCancelledTickets = 0;
    }
    // the followings are all getter and setter methods
    public int getServiceCapacity(){
        return serviceCapacity;
    }
    public String getServiceNumber(){
        return serviceNumber;
    }
    public String getServiceName(){
        return serviceName;
    }
    public String getDate(){
        return date;
    }
    public int getNumTickets(){
        return numTickets;
    }
    public void setNumTickets(int numTickets){
        this.numTickets = numTickets;
    }
    public int getNumCancelledTickets() {
        return numCancelledTickets;
    }
    public void setNumCancelledTickets(int numCancelledTickets) {
        this.numCancelledTickets = numCancelledTickets;
    }

    // A simple but descriptive output of the service for testing
    @Override
    public String toString(){
        return "Service number: " + serviceNumber + " Service name: " + serviceName + " Date: " + date + " Number of tickets: " + numTickets + " Service Capacity: " + serviceCapacity + ".";
    }

}
