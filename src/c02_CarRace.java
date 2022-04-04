import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c02_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readListInteger(scanner);

        List[] lists = split(numbers);

        List <Integer> left = lists[0];
        List<Integer> right = lists[1];
       // right.remove(0);
      // System.out.println(lists[0]);
       //System.out.println(lists[1]);

        double leftRacer = calculateTimeRecord(left);
        double rightRacer = calculateTimeRecord(right);
        if (leftRacer > rightRacer){
            System.out.printf("The winner is right with total time: %.1f", rightRacer);
        }else if (leftRacer < rightRacer){
            System.out.printf("The winner is left with total time: %.1f", leftRacer);
        }


    }



    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }



    private static List[]split(List<Integer> numbers){
        int size = numbers.size();
        List<Integer> first = new ArrayList<>(numbers.subList(0, (size)/2));
        List<Integer> second = new ArrayList<>(numbers.subList(((size)/2) + 1, size));
        return new List[]{first, second};
    }


    private static double calculateTimeRecord (List<Integer> numbers){
        double result =0;

        for (int i = 0; i <numbers.size() ; i++) {

                result += numbers.get(i);
             if(numbers.get(i) == 0) {

                    result *= 0.8;

            }

        }



        return result;
    }

}
