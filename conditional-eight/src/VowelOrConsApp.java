import java.util.Objects;

public class VowelOrConsApp {
    public static void main(String[] args) {
        //if not a letter OR string is > 1, then print an error msg
        // print vowel or consonant

        String letter = checkLetter("u");

        System.out.println(letter);

    }

    public static String checkLetter(String input){
        boolean isLetter = false;
        String test = "";
        String letters = "";
        String[] vowels = {"a", "e", "i", "o", "u"};


        while(!isLetter){
            if(input.length() > 1){
                letters = "Error. Please enter a letter";
                isLetter = false;
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
        }
        return letters;
    }
}
