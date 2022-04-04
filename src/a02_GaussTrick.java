import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <inputNumbers.length ; i++) {
            int current = Integer.parseInt(inputNumbers[i]);
            numbers.add(current);
        }



        // 1 2 3 4 5
        // 1 2 3 4
        // 6 2 3 4
        // 6 2 3
        // 6 6 3
        int iterationsCount = numbers.size()/2;
        for (int i = 0; i < iterationsCount ; i++) {
            int lastIndex = numbers.size() - 1;
            int currentSum = numbers.get(i) + numbers.get(lastIndex);

            numbers.remove(lastIndex);
            numbers.set(i,currentSum);
        }
        printNumList(numbers);
    }
    public static void printNumList(List<Integer> numbers){
        for (Integer number : numbers){
            System.out.print(number + " ");
        }
    }
}
