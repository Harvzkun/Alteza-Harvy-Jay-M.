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