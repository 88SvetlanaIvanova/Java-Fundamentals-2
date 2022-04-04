import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_011_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String calculate = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0").format(calculate(a,calculate,b)));
        //        System.out.println(new DecimalFormat("0.####").format(mathPower(n1,nPower)));
    }
    public static double calculate(int a, String calculate, int b){
        double result = 0.0;

        switch (calculate){
            case "/": result = a/b;
                break;
            case "*":result = a * b;
                break;
            case "+":result = a+b;
                break;
            case "-": result = a-b;
                break;
        }
        return result;
    }
}
