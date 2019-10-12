import java.util.Scanner;

public class ArrayValueCheckApp {
    public static void main(String[] args) {
        // create an array that holds specific values
        // create a method that checks if a user provided value matches a value
        // in the array
        Scanner scan = new Scanner(System.in);

        int[] intArray = {1, 2, 3, 4, 5};

        int userValue = getInt(scan, "Enter any integer: ");

        boolean isMatch = findValue(intArray, userValue);

        System.out.println(isMatch);

    }
    public static int getInt(Scanner sc, String prompt){
        boolean isInt = false;
        int x = 0;

        while(!isInt){
            System.out.print(prompt);
            if(sc.hasNextInt()){
                x = sc.nextInt();
                isInt = true;
            }
            else{
                System.out.println("Please enter a valid integer.");
            }
            sc.nextLine(); // clears the user's entry
        }
        return x;
    }

    public static boolean findValue(int[] arr, int userValue){
        boolean match = false;

        for(int value: arr){
            if(userValue == value){
                match = true;
            }
        }
        return match;
    }
}