import java.util.Scanner;

public class e_04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isPasswordCorrect = isValidPassword(password);
        if(isPasswordCorrect){
            System.out.println("Password is valid");
        }
    }
    public static boolean isValidPassword(String password){
        boolean isEnough = isLengthCorrect(password);
        boolean containsOnlyDigitsAndLetters  = containsDigitsAndLetters(password);
        boolean containdEnoughDigits = containsAtLeastTwoDigits(password);
        boolean isValid = isEnough && containdEnoughDigits && containsOnlyDigitsAndLetters;
        return isValid;
    }
    public static boolean isLengthCorrect(String password){
        if(password.length() >=6 && password.length() <=10){
            return  true;
        }else{
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }
    public static boolean containsDigitsAndLetters(String password){
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }

        }
        return true;
    }
    public static boolean containsAtLeastTwoDigits(String password){
        int counter =0;
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            if(Character.isDigit(symbol)){
                counter++;
                if (counter >=2){
                    break;
                }
            }
        }
        if (counter<2){
            System.out.println("Password must have at least 2 digits");
            return  false;
        }else{
            return  true;
        }
    }
}
