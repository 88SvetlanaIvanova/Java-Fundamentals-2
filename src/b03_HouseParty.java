import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();//readListString(scanner);

        int n = Integer.parseInt(scanner.nextLine());

      //  String input = scanner.nextLine();

        for (int i = 0; i < n ; i++) {

            String[] tokens = scanner.nextLine().split("\\s+",2);
            String name = tokens[0];
            if ("is going!".equals(tokens[1])){
                if (list.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else{
                    list.add(name);
                }

            }else if ("is not going!".equals(tokens[1])){
                if (list.contains(name)){
                    list.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        printList(list);















    }
    private static List<String> readListString(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<String> numbers = new ArrayList<>();

        for (String s : split) {
            numbers.add(scanner.nextLine());
        }
        return numbers;
    }
    private static void printList (List<String> lines){
        for (String item : lines){
            System.out.println(item);
        }
    }
}
