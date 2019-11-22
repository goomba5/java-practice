public class PasswordValidationApp {
    public static void main(String[] args) {
        // write a java method to check whether a string is a valid password
        /*
        1. Must contain at least 8 characters
        2. Must contain only letters and numbers
        3. Must contain at least two digits
         */

        // references
        /*
        1. https://stackoverflow.com/questions/8370873/java-isletterordigit-method-isdigit-isletter
         */

        String password = "CMND/CTRL";
        String password1 = "99problems";
        String password2 = "15step";

        System.out.println("Test 1");
        passwordEvaluation(password);

        System.out.println("Test 2");
        passwordEvaluation(password1);

        System.out.println("Test 3");
        passwordEvaluation(password2);
    }

    public static void passwordEvaluation(String str){

            if (hasValidNumOfCharacters(str) &&
                    hasLettersAndNumbers(str) &&
                    hasValidNumberOfDigits(str)) {
                System.out.println("You have entered a valid password! Good job!");
            } else {
                System.out.println("Invalid password. Must contain 8-10 characters" +
                        " that are letters and numbers, with at least two digits.");
            }
    }

    public static boolean hasLettersAndNumbers(String str) {
        boolean validCharacters = true;
        boolean foundDigit, foundLetter;

        for (char ch : str.toCharArray()) {
            boolean isDigit = Character.isDigit(ch);
            boolean isLetter = Character.isLetter(ch);
            boolean isNotLetterOrNumber = Character.isLetterOrDigit(ch);

            if(isDigit){
                foundDigit = true;
            } else if(isLetter){
                foundLetter = true;
            } else {
                validCharacters = false;
            }

        }
        return validCharacters;
    }

    public static boolean hasValidNumOfCharacters(String str){
        int minCharacters = 8;
        int maxCharacters = 10;

        if (str.length() < minCharacters || str.length() > maxCharacters){
            return false;
        }
        return true;
    }

    public static boolean hasValidNumberOfDigits(String str){
        int minDigits = 2;
        int maxDigits = 8;
        boolean validDigits = false;
        int numCount = 0;

        for(char ch: str.toCharArray()){
            if(Character.isDigit(ch)){
                numCount++;
            }
        }
        if(numCount >= minDigits && numCount <= maxDigits){
            validDigits = true;
        }
        return validDigits;
    }
}
