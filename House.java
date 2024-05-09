/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
  boolean hasElevator;
  boolean hasDiningRoom;
  ArrayList <String> residents;


  /**
   * 
   * @param name name of house
   * @param address address of house
   * @param nFloors numbers of floor in house
   * @param hasElevator confirms if house has elevator
   * @param hasDiningRoom confirms if house has dining room
   */
  public House(String name, String address, int nFloors, boolean hasElevator, boolean hasDiningRoom) {
   // this is what "extends building" is refering to
    super(name, address, nFloors); // this is a Building
    //... with:
    this.hasElevator= hasElevator;
    this.hasDiningRoom= hasDiningRoom;
    this.residents= new ArrayList<String>();
  }

  /* Overloaded constructor with address only */
  public House(String address) {
    this(); // Call default constructor
    this.address = address; // Override address
  }

  /* Overloaded constructor with name, address */
  public House(String name, String address) {
      super(name, address); // Call full constructor with hard-coded # floors
  }


// moveIn and moveOut methods
  /**
   * 
   * @param name name of house
   */
  public void moveIn(String name){
    this.residents.add(name); //adding resident to the house 

  }
  public String moveOut(String name){
    this.residents.remove(name); //removing resident from the house 
    return name;
  }


  // Checking if resident is in 'House'
  /**
   * 
   * @param person addressing the person that lives in the house
   * @return whether this 'person' lives in the house or not
   */
  public boolean isResident(String person){
    if(this.residents.contains(name)){
      System.out.println(name + "is a resident in this house.");
      return true;}
    else{
      System.out.println(name + "is not a resident in this house.");
      return false;
    }
  }

  // if the house has an elevator 
  public void goToFloor(int floorNum) {
    super.goToFloor(floorNum);
    if (this.hasElevator == true){
        System.out.println("You are now on " + floorNum + ".");
    }
    else{
        System.out.println("Cannot go to " + floorNum + " without an elevator. Sorry.");
    }
  }


// special case
  public void showOptions() {
      System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
  }
  
  
  public String toString(){
    String description = super.toString();
    description = "There are currently " + this.nResidents() + " people living in this house.";

    if (this.hasDiningRoom == true){
    description = "This house has an active dining room.";
    }
    else{
    description = "This house does not have an active dining room";
    }

    return description;
  }

//main
  public static void main(String[] args) {
   House myHouse= new House("Comstock House", "1 Manning Rd", 3, true, true);
    myHouse.moveIn("Jo"); 
    myHouse.moveIn("Jade"); 
    myHouse.moveIn("Em"); 
  }

}