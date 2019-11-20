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

        String password = "cookies";

        passwordEvaluation(password);
    }

    public static void passwordEvaluation(String str){
        // str must have eight characters
        int totalChars = 8;

//            if (str.length() < totalChars) {
//                System.out.println("Invalid password. Must contain at least eight characters.");
            if(!hasLettersAndNumbers(str)){
                System.out.println("Invalid password. Must be only letters and numbers, with at least two digits.");
            } else {
                System.out.println("You have entered a valid password");
            }
    }

    public static boolean hasLettersAndNumbers(String str) {
//        boolean validCharacter = false;

        for (char ch : str.toCharArray()) {
            boolean isDigit = Character.isDigit(ch);
            boolean isLetter = Character.isLetter(ch);

            if(!isDigit || !isLetter){
                return false;
            }
        }
        return true;
    }
}
