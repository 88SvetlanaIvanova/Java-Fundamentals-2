import java.util.Scanner;

public class Lab_06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        calcRectanglaArea(width, length);

    }
    public static void calcRectanglaArea(double width, double length){
        double rectangleArea = width * length;
        System.out.printf("%.0f", rectangleArea);
    }
}
