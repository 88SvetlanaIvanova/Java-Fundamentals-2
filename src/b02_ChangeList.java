import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readListInteger(scanner);
        String input = scanner.nextLine();
        while(!"end".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]) ;
            if ("Delete".equals(command)){
                while (numbers.contains(element)){
                    numbers.remove(Integer.valueOf(element));

                }

            }else if("Insert".equals(command)){
               int position = Integer.parseInt(tokens[2]);
               if (position >=0 && position < numbers.size()){
                   numbers.add(position, element);
               }

            }
            input = scanner.nextLine();

      }
        printList(numbers);

    }
    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
    private static void printList (List<Integer> lines){
        for (Integer item : lines){
            System.out.print(item + " ");
        }
    }
}
