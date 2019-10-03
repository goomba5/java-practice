import java.util.Scanner;

public class WeekdayConversionApp {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String answer = "y";

    while(answer.equalsIgnoreCase("y")){
        System.out.print("Enter an integer between 1-7 to get the day: ");

        int entry = scan.nextInt();

        String day = getDay(entry);

        System.out.println("You chose " + day);

        System.out.println("Continue? (y/n): ");
        answer = scan.next();
    }
    System.out.println("Thank you for using this Aperture Science application. Goodbye!");
    }

    public static String getDay(int x){
        String day;

        switch(x){
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Must enter an integer between 1-7";
        }
        return day;
    }
}
