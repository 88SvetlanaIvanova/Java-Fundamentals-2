import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b04_List_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = readListInteger(scanner);
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "Add":
                    int number = Integer.parseInt(tokens[1]) ;
                    numbers.add(number);
                    break;
                case "Insert":
                    number = Integer.parseInt(tokens[1]) ;
                    int index = Integer.parseInt(tokens[2]) ;
                    if (isValid(numbers, index)){
                        numbers.add(index, number);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]) ;
                    if (isValid(numbers,index)){
                        numbers.remove(index);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    if ("left".equals(tokens[1])){
                        for (int i = 0; i < count ; i++) {
                            int temp = numbers.remove(0);
                            numbers.add(temp);
                        }
                    }else if("right".equals(tokens[1])){
                        for (int i = 0; i < count ; i++) {
                            int temp = numbers.remove(numbers.size() - 1);
                            numbers.add(0, temp);
                        }

                    }
                        break;

            }
            input = scanner.nextLine();
        }
        printList(numbers);

    }

    private static boolean isValid(List<Integer> numbers, int index) {
        boolean result = index >= 0 && index < numbers.size();
        return result;
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


