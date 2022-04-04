import java.util.Scanner;

public class b08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read  array, convert it to int
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int [input.length];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int magNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <numbers.length ; i++) {
            int currentElement = numbers[i];

            for (int j = i+1; j <numbers.length; j++) {
                int nextElement = numbers[j];
                if (currentElement + nextElement == magNum){


                    System.out.print(currentElement+ " "+ nextElement);
                    System.out.println();
                }
            }



        }


    }
}
