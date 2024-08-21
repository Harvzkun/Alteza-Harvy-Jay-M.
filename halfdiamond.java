import java.util.Scanner;

public class halfdiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

         System.out.println("*");

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {

             // print stars
         System.out.print("*");

            //print increasing numbers 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");

        }
            
          // Lower half of the diamond
          for (int i = n - 1; i >= 1; i--) {
          System.out.print("*"); 

          //print decreasing numbers 
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
      
        //print ending star 
        System.out.print("*");
        
        

        
    }
}
