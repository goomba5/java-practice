import java.util.Scanner;

public class GreatestNumberApp {
    public static void main(String[] args) {
        // get the program working first! Worry about other methods
        // and features later

        Scanner scan = new Scanner(System.in);

        int numOne;
        int numTwo;
        int numThree;

        String answer = "y";

        while(answer.equalsIgnoreCase("y")){

            // retrieve user responses from the console
            System.out.print("Enter an integer: ");
            numOne = scan.nextInt();

            System.out.print("Enter a second integer: ");
            numTwo = scan.nextInt();

            System.out.print("Enter a third integer: ");
            numThree = scan.nextInt();

            // display the largest number
            int largestNumber = getLargestNumber(numOne,numTwo,numThree);
            System.out.println("The largest number is " + largestNumber);

            System.out.print("Continue? (y/n)");
            answer = scan.next();
        }
        System.out.println();
        System.out.print("Thank you for using this Aperture Science Application!");
    }

    public static int getLargestNumber(int x, int y, int z){
        if (x < y && y < z){
            return z;
        }
        else if(x < y && z < y){
            return y;
        }
        else{
            return x;
        }
    }
}
