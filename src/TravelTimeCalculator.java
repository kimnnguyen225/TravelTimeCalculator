import java.text.NumberFormat;
import java.util.Scanner;

public class TravelTimeCalculator {

    public static void main(String[] args) {
        /**
         * The application should accept decimal entries like 10.5 and 20.65.
         * The application should display the approximate travel time in hours and minutes.
         * Assume that the user will enter valid data.
         * The application should continue only if the user enters “y” or “Y” to continue.
         * Hint
         * Use integer arithmetic and the division and modulus operators to get hours and minutes.
         */

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // display welcome message
        System.out.println("Welcome to the Travel Time Calculator");
        System.out.println();

        // perform calculation until choice isn't y or Y
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            // get user input
            System.out.println("Enter miles: ");
            double miles = sc.nextDouble();
            System.out.println("Enter miles per hour: ");
            double mph = sc.nextDouble();

            // math
            double hours = miles / mph; //example user enters: 3.0769 = 200 / 65
            // get number of minutes as an int
            int minutes = (int) (hours * 60); // 3.0769x60 = 184.61538 mins

            // use integer arithmetic to get hours and minutes as int values
            int hoursInt = minutes / 60; // 3.0769 = 184.61538 / 60 -- int type, Java output 3
            minutes = minutes % 60; // 4.615 = 0.0769 x 60 -- because this is int type, Java output 4

            // display result
            System.out.println("Estimated travel time" + "\n" + "---------------------");
            System.out.println("Hours: " + hoursInt);
            System.out.println("Minutes: " + minutes);

            // see if user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();
    }
}
