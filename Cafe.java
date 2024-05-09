/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    
    
      /**
     * @param name Cafe name
     * @param address Cafe address
     * @param nFloors Number of floors in  cafe
     * @param nCoffeeOunces Ounces of coffee available
     * @param nSugarPackets Number of sugar packets available
     * @param nCreams Number of cream available
     * @param nCups Number of cups available
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors); 
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }


       /**
     * Restocks the ingredients in stock 
     * @param nCoffeeOunces Ounces of coffee
     * @param nSugarPackets Number of sugar packets
     * @param nCreams Amount of cream
     * @param nCups Number of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += 100;
        this.nSugarPackets += 100;
        this.nCreams += 100;
        this.nCups += 100;
    }



    // method that will lower values within the parameter meaning a cup of cofee was purchased
    /**
     * 
     * @param size size requested for drink
     * @param nSugarPackets number of sugar packets requested
     * @param nCreams number of creams requested
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(size > this.nCoffeeOunces||nSugarPackets > this.nSugarPackets|| nCreams > this.nCreams|| nCups > this.nCups){
          restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
          System.out.println("Items at Cafe have been restocked: Coffee = " + this.nCoffeeOunces + " oz, Sugar packets = " + this.nSugarPackets + " packets, Creams = " + this.nCreams + " splashes of cream, Cups = " + this.nCups + " cups.");
  
        }
        // values of Parameter (in this case all ints) decrease
          this.nCoffeeOunces -= size; 
          this.nSugarPackets -=  nSugarPackets;
          this.nCreams -= nCreams;
          this.nCups -= 1;
          System.out.println("Here is your order of" + size + " oz coffee with " + nSugarPackets + " sugar packets and " + nCreams + " pumps of cream. Have a great day!");
  
      }

  // sellCoffee overloaded
      public void sellCoffee(int size, int nSugarPackets, int nCreams, int cupsRequested){
        if(size > this.nCoffeeOunces||nSugarPackets > this.nSugarPackets|| nCreams > this.nCreams|| nCups > this.nCups){
          restock(this.nCoffeeOunces, this.nSugarPackets, this.nCreams, this.nCups);
          System.out.println("Items at Cafe have been restocked: Coffee = " + this.nCoffeeOunces + " oz, Sugar packets = " + this.nSugarPackets + " packets, Creams = " + this.nCreams + " splashes of cream, Cups = " + this.nCups + " cups.");
  
        }
        // values of Parameter (in this case all ints) decrease
          this.nCoffeeOunces -= size; 
          this.nSugarPackets -=  nSugarPackets;
          this.nCreams -= nCreams;
          this.nCups -= -cupsRequested;
          System.out.println("Here is your order of" + size + " oz coffee with " + nSugarPackets + " sugar packets and " + nCreams + " pumps of cream. Have a great day!");
     
          if (cupsRequested== 1){
            System.out.println("Here is your order of" + size + " oz coffee with " + nSugarPackets + " sugar packets and " + nCreams + " splashes of cream. Enjoy!");
        }
        else {
            System.out.println("Here are your orders of" + cupsRequested + " " + size + " oz coffees with " + nSugarPackets + " sugar packets and " + nCreams + " splashes of cream. Enjoy!");
        }
        }



        // if the house has an elevator 
        public void goToFloor(int floorNum) {
            super.goToFloor(activeFloor);
            if (floorNum == 1){
                System.out.println("You are now on " + floorNum + ".");
            }
            else{
                System.out.println("Cannot go to " + floorNum + " -- for employees only. Sorry.");
            }
        }

        public void showOptions() {
            super.showOptions();
            System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + sellCoffee(size, nSugarPackets, nCreams)");
        }
    


        public static void main(String[] args) {
            Cafe Compass=  new Cafe(12, 3, 4, 1, "Compass Cafe", "3 Bake St.", 2);
        }
        
    }

    