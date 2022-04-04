import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readListInteger(scanner);
        String text = scanner.nextLine();
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int index = CalculateIndex(currentNumber);

            char currentChar = getCharFromText(index, text);
            System.out.print(currentChar);

            int realIndex = CalculateRealIndex(index,text);

            String newText = charRemoveAt( text,  realIndex);

            text = newText;

        }
        System.out.println();




    }

    private static String charRemoveAt(String text, int realIndex) {
        return text.substring(0,realIndex)+text.substring(realIndex+1);
    }

    private static int CalculateRealIndex(int index, String text) {

        int countIndex = 0;

        for (int i = 0; i < index ; i++) {
            countIndex++;

            if (countIndex == text.length()){
                countIndex = 0;
            }
        }
        return countIndex;
    }

    private static char getCharFromText(int currentNumber, String text) {
        int countIndex = 0;

        for (int i = 0; i < currentNumber ; i++) {
            countIndex++;

            if (countIndex == text.length()){
                countIndex = 0;
            }
        }
        char currentChar = text.charAt(countIndex);
        return  currentChar;
    }

    private static int CalculateIndex(int number) {
        int index = 0;
        while(number > 0){
            int currentNumber = number % 10;
            index+=currentNumber;
            number /= 10;
        }
        return index;
    }

    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

}
