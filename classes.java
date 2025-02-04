// Definiton of bike interface method
interface Bike {

     // Method to start the bike
    void start();

    // Method to stop the bike
    void stop();
}

class TBike implements Bike {
    //start method
    public void start() {
        System.out.println("START TBike.");
    }

    //stop method
    public void stop() {
        System.out.println("STOP TBike.");
    }
}

// Testing the implementation
public class biketest {
    public static void main(String[] args) {
        
        TBike myBike = new TBike();

        // Start method calling
        myBike.start();

        // Stop method calling
        myBike.stop();
    }
}
