import java.util.Scanner;

public class b07_MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int [input.length];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int bestLength = 0;
        int digit = 0;

        int currentLenght = 1;

        for (int i = 0; i <numbers.length - 1 ; i++) {
            int currentElement = numbers[i];
            int nextElement = numbers[i + 1];
            if (currentElement == nextElement){
                currentLenght++;
                if(currentLenght > bestLength){
                    bestLength = currentLenght;
                    digit = currentElement;
                }
            }else{
                currentLenght = 1;
            }

        }
        for (int i = 0; i < bestLength ; i++) {
            System.out.print(digit + " ");
        }

    }
}
