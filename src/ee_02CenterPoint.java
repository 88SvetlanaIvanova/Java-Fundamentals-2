import java.util.Scanner;

public class ee_02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = readDouble(scanner);
        double y1 = readDouble(scanner);
        double x2 = readDouble(scanner);
        double y2 = readDouble(scanner);

        closestPoint(x1,y1,x2,y2);



    }
    public static  double readDouble(Scanner scanner){
        double number = scanner.nextDouble();
        return  number;
    }


    public static void closestPoint (double x1,double y1, double x2, double y2){
        double first =Math.sqrt(Math.pow(x1,2)+Math.pow(y1, 2));
        double second = Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
        if(first < second){
            System.out.println(String.format("(%.0f, %.0f)",x1,y1));
        }else{
            System.out.println(String.format("(%.0f, %.0f)",x2,y2));
        }
    }
}
