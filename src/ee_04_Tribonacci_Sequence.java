import java.math.BigInteger;
import java.util.Scanner;

public class ee_04_Tribonacci_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printFibonachiSequence(number);

    }
    public static void printFibonachiSequence (int n){
       BigInteger a = new BigInteger("1");
       BigInteger b = new BigInteger("1");
       BigInteger c = new BigInteger("2");
       BigInteger d = new BigInteger("0");
       int i = 0;
        System.out.print(a + " " + b + " " + c);
        for ( i = 4; i <=n  ; i++) {
            d = a.add(b).add(c);
            System.out.print(" "+ d);
            a = b;
            b = c;
            c = d;
        }

    }
}
