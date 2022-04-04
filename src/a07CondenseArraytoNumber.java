import java.util.Scanner;
import java.util.Arrays;
public class a07CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
         while (firstArray.length >1){
             int [] condenced = new int[firstArray.length - 1];
             for (int i = 0; i <firstArray.length - 1 ; i++) {
                 condenced[i] = firstArray[i] + firstArray[i + 1];
             }
             firstArray = condenced;
         }
        System.out.println(firstArray[0]);




    }
}
