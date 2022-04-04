import java.util.Arrays;
import java.util.Scanner;

public class Lab_010_MultiplyEvensbyOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int digit = Integer.parseInt(scanner.nextLine());
        digit = Math.abs(digit);
        System.out.println(evenByOdds(digit));


    }
    public static int evenByOdds(int digit){
        int evenSum =getSumOfEvenDigits(digit);
        int oddSum = getSumOfOddDigits(digit);
        return evenSum*oddSum;
    }
    public static int getSumOfEvenDigits(int digit){
        int evenSum =0;
        String numAsString = ""+ digit;
        String[] items = numAsString.split("");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        for (int i = 0; i < arr.length ; i++) {
            int current = arr[i];
            if (current % 2 == 0){
                evenSum+=current;
            }

        }
        
        return evenSum;
    }
    public  static int getSumOfOddDigits(int digit){
        int oddSum = 0;
        String numAsString = ""+ digit;
        String[] items = numAsString.split("");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();


        for (int i = 0; i < arr.length ; i++) {
            int current = arr[i];
            if (current %2 !=0){
                oddSum +=current;
            }
        }


        return oddSum;
    }
}
