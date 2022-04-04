import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        List<String> result = new ArrayList<>();
       // List<String> products = readStringList(scanner);
        for (int i = input.length - 1; i >= 0  ; i--) {
            String[] temp = input[i].split("\\s+");
            for (String s : temp) {
                if (!"".equals(s)){
                    result.add(s);
                }

            }
        }
        System.out.println(String.join(" ", result));
    }

    private static List<String> readStringList(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<String > list = new ArrayList<>();

        for (String s : split) {
            list.add(s);
        }
        return list;
    }
}
