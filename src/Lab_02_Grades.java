import java.util.Scanner;

public class Lab_02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        String text = "";
        if (grade >= 5.50 && grade<= 6.0){
            text = "Excellent";
        }
        else if (grade>=4.50 && grade<= 5.49){
            text = "Very good";
        }
        else if (grade>=3.50 && grade<=4.49){
            text = "Good";
        }
        else if (grade >=3.00 && grade <= 3.49){
            text = "Poor";
        }
        else if (grade>=2.00 && grade <= 2.99){
            text = "Fail";
        }
        printSign(text);
    }
    public static void printSign(String text){
        System.out.println(text);
    }
}
