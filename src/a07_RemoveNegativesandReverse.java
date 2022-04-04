import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class a07_RemoveNegativesandReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readListInteger(scanner);
        numbers.removeIf(n->n <0);
        for (int i = 0; i <numbers.size() ; i++) {
            if (numbers.get(i) < 0){
                numbers.remove(i--);
            }
        }
        Collections.reverse(numbers);
        if (numbers.size() > 0){
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }else System.out.println("empty");

    }
    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            numbers.add(num);

        }
        return numbers;
    }
}
