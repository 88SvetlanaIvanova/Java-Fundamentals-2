import java.util.Scanner;

public class e_09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
            checkPalindrome(input);
            input = scanner.nextLine();
        }
    }
    public static void checkPalindrome (String input){
        int number = Integer.parseInt(input);
        int temp = number;
        int remainder = 0;
        int reversed = 0;
        while(number !=0){
            remainder = number % 10;
            reversed = (reversed*10)+remainder;
            number = number/10;
        }
        if (reversed == temp) {
            System.out.println(reversed == temp);;
        }else{
            System.out.println(reversed == temp);
        }
    }
}
