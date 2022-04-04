import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = readListInteger(scanner);
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while(!"end".equals(input)){
            String[] tokens = input.split(" ");
            if("Add".equals(tokens[0])){
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            }else {
                int peopleToAdd = Integer.parseInt(tokens[0]);
                for (int waggon = 0; waggon < train.size() ; waggon++) {
                    int sum = train.get(waggon)+peopleToAdd;
                    if (sum<=maxCapacity){
                        train.set(waggon, sum);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        printList(train);




    }
    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
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
