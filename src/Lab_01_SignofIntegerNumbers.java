import java.util.Scanner;

public class Lab_01_SignofIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String text = "";
        if(number>0){
            text ="The number "+number+ " is positive.";
        }
        else if(number<0){
            text = "The number "+number+" is negative.";
        }
        else{
            text = "The number 0 is zero.";
        }
        printSign(text);
    }
    public static void printSign(String text){
        System.out.println(text);
    }

}
