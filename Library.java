/* This is a stub for the Library class */
import java.util.Enumeration;
import java.util.Hashtable;

public class Library extends Building{
boolean hasElevator;
private Hashtable<String, Boolean> collection; // 'collection' variable --> hastable


    public Library(String name, String address, int nFloors, boolean hasElevator) { // Constructor from extention: building
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>(); //owning 'collection' to memory + intiating "this.collection" to be a hastable holding a string and boolean
      System.out.println("You have built a library: 📖");
    }

    public Library(String address) {
      this(); // Call default constructor
      this.address = address; // Override address
  }
  
    /* Overloaded constructor with name, address */
    public Library(String name, String address) {
        super(name, address); // Call full constructor with hard-coded number of floors
    }

    // adding book to the library collection 
    public void addTitle(String title){ 
      this.collection.put(title, true);

    }

    // if the 'book' is in the library, it will remove it
    public String removeTitle(String title){
      if(this.collection.contains(name)){
        this.collection.remove(title);
        return title;
    }
// if the 'book' isn't in the collection, prints the string bellow
      else{
        System.out.println("This book is not in your collection.");
        return "";


      }

  }

  public void showOptions() {
    super.showOptions();
    System.out.println( " returnBook(title) \n + containsTitle(title) \n + isAvailable(name) \n + checkOut(name)\n + printCollection()");
}

// Check out a book in 'this.collection'
     public void checkOut(String name){
      if(this.collection.contains(name)){ // checking if this is in the Library
        if(this.collection.get(name)){ //gets the book from the Library
        System.out.println(name + "is availiable to rent out."); //prints book + ____
        }
      }


      // if the 'book' isn't in the collection, prints the string bellow
      else{
        System.out.println(name + "is not in your collection."); //prints book + ____
   
            }
    }

    // method for when a book is returned to the Library
    public void returnBook(String title){
      if(this.collection.contains(name)){  // checking if this is in the Library
        if(!this.collection.get(name)){ //gets the book from the Library
          this.collection.replace(name, false, true);
          System.out.println(name + "has been returned."); //prints book + ____
        }
      }

      else{
        System.out.println(name + "was never in your collection."); //prints book + ____
      }
      }

// true (yes) or false (no) if there is 'book' in Library
      public boolean containsTitle(String title){ 
        if(this.collection.contains(name)){ // checking if this is in the Library
          return true; // say yes
        }
        return false;
        }

        // returns true if the title appears as a key in the Libary's collection, false otherwise
      
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
  
// method that gets availiablity for checkout status
        public boolean isAvailable(String name){ 
          if(this.collection.contains(name)){ // checking if this is in the Library
            if(this.collection.get(name)){ //gets the book from the Library
              return true;
            }
          }
          return false;
      }
        // returns true if the title is currently available, false otherwise


  // prints out the entire collection in an easy-to-read way (including checkout status)
  public void printCollection(){
    Enumeration <String> collection = this.collection.keys();
    while (collection.hasMoreElements()){
      String books = collection.nextElement();
      System.out.println("Books:" + books +", Checkout status: "+ this.collection.get(collection)); // prints checkout status)
    }
  }







  
    public static void main(String[] args) {
     Library Neilson = new Library("Neilson", "1 Drive St.", 4, true);
    }
  
  }