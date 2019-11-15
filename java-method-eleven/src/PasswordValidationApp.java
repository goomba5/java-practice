public class PasswordValidationApp {
    public static void main(String[] args) {
        // write a java method to check whether a string is a valid password
        /*
        1. Must contain at least 8 characters
        2. Must contain only letters and numbers
        3. Must contain at least two digits
         */

        String password = "BlackPanther";

        System.out.println(passwordEvaluation(password));
    }

    public static String passwordEvaluation(String str){
        // str must have eight characters
        int totalChars = 8;
        boolean isValid = false;
        String response = "";

            if (str.length() < totalChars) {
                System.out.println("Invalid password. Must contain at least eight characters.");
            } else {
                response = "You have entered a valid password";
            }
        return response;
    }
}
