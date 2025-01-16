/*QUestion 4 
 * Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.

 */
// Class to represent a Movie Ticket booking system
public class MovieTicket {

  private String movieName;  // Name of the movie
  private int seatNumber;    // Seat number assigned to the ticket
  private double price = 100; // Price of a single ticket
  private static int seatCount = 10; // Total available seats

  // Constructor to initialize the movie name
  MovieTicket(String movieName) {
      this.movieName = movieName;
  }

  // Method to book a ticket
  public void bookTicket() {
      // Check if seats are available
      if (seatCount > 0) {
          seatNumber = seatCount; // Assign the current seat number
          seatCount--;            // Decrease the available seat count
          System.out.printf("Ticket successfully booked for movie: %s\n", movieName);
      } else {
          System.out.println("Housefull"); // Print message when no seats are available
      }
  }

  // Method to display ticket details
  public void ticketDetails() {
      if (seatNumber > 0) {
          // Display seat number and price if a ticket has been booked
          System.out.printf("Seat number is %d and ticket price is %.2f\n", seatNumber, price);
      } else {
          System.out.println("No ticket booked yet."); // Message if no ticket was booked
      }
  }
}

// Main class to test the MovieTicket class
class MainMovieTicket {
  public static void main(String[] args) {
      // Create a MovieTicket object for a movie
      MovieTicket movieTicket = new MovieTicket("Mufasa");

      // Attempt to book a ticket
      movieTicket.bookTicket();

      // Display the ticket details
      movieTicket.ticketDetails();

      // Example: Booking more tickets to test houseful scenario
      for (int i = 0; i < 11; i++) {
          MovieTicket newTicket = new MovieTicket("Mufasa");
          newTicket.bookTicket();
          newTicket.ticketDetails();
      }
  }
}
