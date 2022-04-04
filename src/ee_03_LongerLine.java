import java.util.Scanner;

public class ee_03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first line
        double x1 = readDouble(scanner);
        double y1 = readDouble(scanner);
        double x2 = readDouble(scanner);
        double y2 = readDouble(scanner);
        //second line
        double x3 = readDouble(scanner);
        double y3 = readDouble(scanner);
        double x4 = readDouble(scanner);
        double y4 = readDouble(scanner);
        longestLines(x1,y1,x2,y2,x3,y3,x4,y4);


    }
    public static  double readDouble(Scanner scanner){
        double number = scanner.nextDouble();
        return  number;
    }


    public static void longestLines (double x1,double y1, double x2, double y2,double x3,double y3, double x4, double y4){

        double lineLength1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double lineLength2 = Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        if(lineLength1 >= lineLength2){
            boolean isFirstCloser = findCloserPoint(x1,y1,x2,y2);
            if (isFirstCloser){
                System.out.println(String.format("(%.0f, %.0f)(%.0f, %.0f)",x1,y1,x2,y2));
            }else{
                System.out.println(String.format("(%.0f, %.0f)(%.0f, %.0f)",x2,y2,x1,y1));
            }
        }else{
            boolean isFirstCloser = findCloserPoint(x3,y3,x4,y4);

            if (isFirstCloser){
                System.out.println(String.format("(%.0f, %.0f)(%.0f, %.0f)",x3,y3,x4,y4));
            }else{
                System.out.println(String.format("(%.0f, %.0f)(%.0f, %.0f)",x4,y4,x3,y3));
            }

        }
    }
    public static boolean findCloserPoint (double x1, double y1, double x2, double y2){
        double firstPoint = Math.sqrt(x1*x1 + y1*y1);
        double secondPoint = Math.sqrt(x2*x2 + y2*y2);
        boolean isFirstCloser = true;
        if (firstPoint <= secondPoint){
            isFirstCloser = true;
        }else{
            isFirstCloser = false;
        }
        return isFirstCloser;
    }
}
