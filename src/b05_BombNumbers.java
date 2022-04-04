import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class b05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readListInteger(scanner);
        int[] bombInfo = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer :: parseInt).toArray();
        int bomb = bombInfo[0];
        int bombPower = bombInfo[1];

        while (numbers.contains(bomb)){
            int index = numbers.indexOf(bomb);

            int leftBound = Math.max(index - bombPower, 0);
            int rightBound = Math.min(index + bombPower, numbers.size() - 1);
            for (int i = rightBound; i >= leftBound ; i--) {
                numbers.remove(i);
            }
        }
        int sum = sumList(numbers);
        System.out.println(sum);
    }

    private static int sumList(List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return  result;
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
