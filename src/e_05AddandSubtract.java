import java.util.Scanner;

public class e_05AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInteger(scanner);
        int b  = readInteger(scanner);
        int c = readInteger(scanner);
        System.out.println(subtractThirdNum(a,b,c));
    }
    public static int readInteger(Scanner scanner){
        int number = scanner.nextInt();
        return  number;
    }
    public static int sumTwoNum (int a, int b){
        int sum = a + b;
        return  sum;
    }
    public static int subtractThirdNum(int a, int b, int c){
        int result =0;
        int sum = sumTwoNum(a,b);
        result  = sum - c;

        return result;
    }
}
