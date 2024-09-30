import java.util.Scanner;

public class Clock {

    // Method of converting seconds to minutes
    public double SecondstoMinutes(int seconds) {
        return seconds / 60.0;
    }

    // Method of converting seconds to hours
    public double SecondstoHours(int seconds) {
        return seconds / 3600.0;
    }

    // Method of converting minutes to seconds
    public int MinutestoSeconds(int minutes) {
        return minutes * 60;
    }

    // Method of converting minutes to hours
    public double MinutestoHours(int minutes) {
        return minutes / 60.0;
    }

    // Method of converting hours to seconds
    public int HourstoSeconds(int hours) {
        return hours * 3600;
    }

    // Method of converting hours to minutes
    public int HourstoMinutes(int hours) {
        return hours * 60;
    }

    // Display menu and manage user's selection
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        boolean continueConversion = true;

        // Loop to continue asking for conversions until the user decides to quit
        while (continueConversion) {
            // Displaying the conversion menu
            System.out.println("1. Seconds to Minutes");
            System.out.println("2. Seconds to Hours");
            System.out.println("3. Minutes to Seconds");
            System.out.println("4. Minutes to Hours");
            System.out.println("5. Hours to Seconds");
            System.out.println("6. Hours to Minutes");

            // Get the user's choice
            System.out.print("Choose the conversion: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Convert seconds to minutes
                    System.out.print("Enter the value: ");
                    int secondsToMinutes = scanner.nextInt();
                    System.out.println("Seconds to Minutes: " + clock.SecondstoMinutes(secondsToMinutes) + " " );
                    break;

                case 2:
                    // Convert seconds to hours
                    System.out.print("Enter the value: ");
                    int secondsToHours = scanner.nextInt();
                    System.out.println("Seconds to Hours: " +  clock.SecondstoHours(secondsToHours) + " " );
                    break;

                case 3:
                    // Convert minutes to seconds
                    System.out.print("Enter the value: ");
                    int minutesToSeconds = scanner.nextInt();
                    System.out.println("Minutes to Seconds: " + clock.MinutestoSeconds(minutesToSeconds) + " " );
                    break;

                case 4:
                    // Convert minutes to hours
                    System.out.print("Enter the value: ");
                    int minutesToHours = scanner.nextInt();
                    System.out.println("Minutes to Hours: " + clock.MinutestoHours(minutesToHours) + " " );
                    break;

                case 5:
                    // Convert hours to seconds
                    System.out.print("Enter the value: ");
                    int hoursToSeconds = scanner.nextInt();
                    System.out.println("Hours to Seconds: " + clock.HourstoSeconds(hoursToSeconds) + " " );
                    break;

                case 6:
                    // Convert hours to minutes
                    System.out.print("Enter the value: ");
                    int hoursToMinutes = scanner.nextInt();
                    System.out.println("Hours to Minutes " + clock.HourstoMinutes(hoursToMinutes) + " " );
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Kindly choose a number from 1 to 6.");
                    break;
            }

            // Ask if the user want to do another conversion
            System.out.print("Do you want to convert time? (Y/N): ");
            String continueResponse = scanner.next();

            // Check if the user wants to continue or exit
            if (continueResponse.equalsIgnoreCase("N")) {
                continueConversion = false;  // Exit the loop
                System.out.println("Thank you for using the Clock Conversion program. Adieu!");
            }
        }
        scanner.close();  // Close the scanner
    }
}
