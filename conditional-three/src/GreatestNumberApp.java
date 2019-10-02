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
            numOne = checkInt(scan, "Enter an integer: ");

            numTwo = checkInt(scan, "Enter a second integer: ");

            numThree = checkInt(scan, "Enter a third integer: ");

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

    public static int checkInt(Scanner sc, String prompt){
        boolean isInteger = false;
        int anInteger = 0;

        while(!isInteger){
            System.out.print(prompt);
            if(sc.hasNextInt()){
                anInteger = sc.nextInt();
                isInteger = true;
            }
            else{
                System.out.println("Please enter an integer.");
            }
            sc.nextLine();
        }
        return anInteger;
    }
}
