import java.util.Scanner;

public class e_01SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInteger(scanner);
        int b =readInteger(scanner);
        int c = readInteger(scanner);
        System.out.println(getTheSmallestNum(a,b,c));


    }
    public static int getTheSmallestNum(int a, int b, int c){
        int theSmallest = Integer.MIN_VALUE;
        if (a > theSmallest) {
            theSmallest=a;


        }
        if (a>b){
            theSmallest=b;
        }
        if (b>c && a>c){
            theSmallest = c;
        }


        return theSmallest;
    }
    public static int readInteger(Scanner scanner){
        int number = scanner.nextInt();
        return  number;
    }
}
