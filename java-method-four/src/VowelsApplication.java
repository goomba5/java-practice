import java.util.Scanner;

public class VowelsApplication {
    public static void main(String[] args) {
        // write a java method to count all vowels in a string

        String input = "soccerball";

        int vowelNum = getVowels(input);

        System.out.println("There are " + vowelNum + " vowels in " + input);
    }

    public static int getVowels(String str){
        int vowelCount = 0;
        String[] vowelsArr = {"a", "e", "i", "o", "u"};

        for(int i = 0; i < str.length();i++){
            // referenced:
            // https://stackoverflow.com/questions/11229986/get-string-character-by-index-java
            String letter = Character.toString(str.charAt(i));


            for(int j = 0; j < vowelsArr.length; j++){
                String vowel = vowelsArr[j];

                if(letter.equalsIgnoreCase(vowel)){
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
}
