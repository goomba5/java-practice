import java.util.Objects;
import java.util.Scanner;

public class VowelOrConsApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer = "y";

        while(answer.equalsIgnoreCase("y")){
            String letter = checkLetter(scan, "Enter a letter: ");

            System.out.println(letter);

            System.out.println("Continue? (y/n): ");
            answer = scan.next();
        }
        System.out.println();
        System.out.println("Thank you for using this Aperture Science application. Goodbye!");

    }

    public static String checkLetter(Scanner sc, String prompt){
        boolean isLetter = false;
        String letters = "";
        String input = "";
        String[] vowels = {"a", "e", "i", "o", "u"};

        while(!isLetter){
            System.out.print(prompt);
            input = sc.next();
            if(input.length() > 1){
                letters = "Error. Please enter a letter";
                break;
            }
            else{
                for(String l : vowels){
                    if(Objects.equals(input, l)){
                        letters = "The letter is a vowel.";
                        isLetter = true;
                        break;
                    }
                    else{
                        letters = "The letter is a consonant.";
                        isLetter = true;
                    }
                }
            }
            sc.nextLine();
        }
        return letters;
    }
}
