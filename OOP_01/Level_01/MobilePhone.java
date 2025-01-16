/*
Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
 */
// Class to represent a Mobile Phone
public class MobilePhone {

   // Private attributes to store mobile phone details
   private String brand;  // Brand name of the mobile phone
   private String model;  // Model of the mobile phone
   private double price;  // Price of the mobile phone

   // Constructor to initialize the attributes of the MobilePhone
   MobilePhone(String brand, String model, double price) {
       this.brand = brand;   // Assign brand name
       this.model = model;   // Assign model
       this.price = price;   // Assign price
   }

   // Method to display the details of the mobile phone
   public void displayMobilePhone() {
       // Print mobile phone details using formatted output
       System.out.printf(
           "Brand name is %s, model is %s, and the price of the mobile is %.2f\n", 
           brand, model, price
       );
   }
}

// Main class to test the MobilePhone class
class MobilePhoneMain {
   public static void main(String[] args) {
       // Create a MobilePhone object with specific details
       MobilePhone mobilePhone = new MobilePhone("Realme", "13 Pro", 30000);

       // Display the details of the mobile phone
       mobilePhone.displayMobilePhone();
   }
}
