
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Alekhya Gandra
 */
public class AnimalRides {
    
    int animalName;
    int noOfMembers;

    @Override
    public String toString() {
        return "AnimalRides{" + "animalName=" + animalName + ", noOfMembers=" + noOfMembers + ", speed=" + speed + '}';
    }

    public int getAnimalName() {
        return animalName;
    }

    public void setAnimalName(int animalName) {
        this.animalName = animalName;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    double speed;
    
      
   
    /**
     * method noofseats
     */
    
    public void noofseats()
    {
        
    }
    /**
     * method ticketPrice gives the ticketprice
     */
    public void  ticketPrice()
    {
        System.out.println("The ticketPrice is :" + 50.00);
    }
    
    /**
     * method  timeCalculation gives the time in hours
     */
    
    public void timeCalculation()
    {
        System.out.println("The amount of time spent is :" + "2 Hours ");
    }
     public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");                      
        System.out.println("Hey - look at the Elephant!"); }

}
