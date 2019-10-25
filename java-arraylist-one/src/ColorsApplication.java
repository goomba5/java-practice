import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColorsApplication {
    public static void main(String[] args) {
        // write a java program to create a new array list, add some colors
        // and print out the collection

        Scanner scan = new Scanner(System.in);
        List<String> colorList = new ArrayList<>();

        String answer = "y";

        while(answer.equalsIgnoreCase("y")){
            printMenu();
            int menuOption = getInt(scan, "Enter an option (1-3): ");

            if(menuOption == 1){
                printColorList(colorList);
            }
            else if(menuOption == 2){
                String entry = getString(scan, "Enter a color: ");
                addColor(colorList, entry);
            }
            else if(menuOption == 3){
                break;
            }


            answer = getString(scan, "Continue? (y/n)");
        }
        System.out.println();
        System.out.println("Thank you for using the colors application. Now get out. Shoo!");

    }
        public static String getString(Scanner sc, String prompt) {
            boolean isString = false;
            String color = "";

            while (!isString) {
                System.out.print(prompt);
                if (sc.hasNext()) {
                    color = sc.next();
                    isString = true;
                } else {
                    System.out.print("Please enter a valid color.");
                }
                sc.nextLine();
            }
            return color;
            }

        public static int getInt(Scanner sc, String prompt){
            boolean isInt = false;
            int input = 0;

            while(!isInt){
                System.out.print(prompt);
                if(sc.hasNextInt()){
                    input = sc.nextInt();
                    isInt = true;
                } else{
                    System.out.print("Please enter a valid number.");
                }
                sc.nextLine();
            }
            return input;
        }

        public static void printMenu(){
            System.out.println("LIST OF OPTIONS:");
            System.out.println("1 - View List");
            System.out.println("2 - Add Color to List");
            System.out.println("3 - Exit Application");
        }

        public static void addColor(List<String> list, String color){
            list.add(color);
            System.out.println(color + " has been added to the list!");
        }

        public static void printColorList(List<String> list){
            if(list.size() == 0){
                System.out.println("There are no colors in the list! Add some!");
            } else {
                for(String c: list) {
                System.out.println(c);
                }
            }
        }
    }
