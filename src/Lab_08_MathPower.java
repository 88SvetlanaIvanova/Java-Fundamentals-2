import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double nPower = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(mathPower(n1,nPower)));

    }
    public static double mathPower(double n1, double nPower){
        double result =  (Math.pow(n1, nPower));
        return result;
    }
}
