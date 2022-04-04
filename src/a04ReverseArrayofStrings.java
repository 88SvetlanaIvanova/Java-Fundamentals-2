import java.util.Scanner;
import java.util.Arrays;

public class a04ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        String[] items = values.split(" ");
        for (int i = 0; i < items.length/2 ; i++) {
            int swapIndex = items.length - i -1;
            String tmp = items[i];
            items[i] = items[items.length - i -1];
            items[swapIndex] = tmp;
        }
        System.out.println(String.join(" ", items));

    }
}
