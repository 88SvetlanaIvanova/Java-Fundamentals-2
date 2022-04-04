import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String[] inputNumbers = scanner.nextLine().split(" ");
        List<Integer> left = readList(scanner);
        List<Integer> right = readList(scanner);

        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i <left.size() && i< right.size()){
            result.add(left.get(i));
            result.add(right.get(i));

            i++;
        }
        // i...size - 1
        if (i < left.size()){
            addLeftovers(result, left, i);


        }else if(i < right.size()){
            addLeftovers(result, right, i);

        }
       // result.add(leftLeftovers);
       // result.add(rightLeftovers);


        for (Integer number : result){
            System.out.print(number + " ");
        }

//

    }

    private static void addLeftovers(List<Integer> result, List<Integer> left, int afterIndex) {
        for (int j = afterIndex; j <left.size() ; j++) {
            result.add(left.get(j));
        }
    }

    private static List<Integer> readList(Scanner scanner) {
        String [] split = scanner.nextLine().split(" ");
        List<Integer> result = Arrays.stream(split)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return  result;
    }


}
