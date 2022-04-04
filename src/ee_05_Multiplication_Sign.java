import java.util.Scanner;

public class ee_05_Multiplication_Sign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        printMultiplicationSign(number1, number2, number3);
    }
    public static void printMultiplicationSign (int a, int b, int c)
    {

        if (a==0||b==0||c==0){
            System.out.println("zero");
        } else  if (a > 0 && b >0  && c >0){
            System.out.println("positive");

        }else if (a<0 && b<0 && c>0||a<0 && c<0 && b >0|| b<0 && c<0 && a>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }

    }
}
