import com.sun.jdi.request.MethodEntryRequest;

import org.w3c.dom.ls.LSOutput;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().
                split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true){

            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]){
                case "Contains":
                    int numberToFind = Integer.parseInt(tokens[1]);
                    if (numbers.contains(numberToFind)){
                        System.out.println("Yes");
                        break;
                    }else {
                        System.out.println("No such number");
                        break;
                    }

                case "Print":
                    if (tokens[1].equals("even")){
                        for (Integer item :numbers) {
                            if (item % 2 == 0){
                                System.out.print(item + " ");
                            }
                        }
                    }else if (tokens[1].equals("odd")){
                        for (Integer item :numbers) {
                            if (item % 2 != 0){
                                System.out.print(item + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer item:numbers) {
                        sum+=item;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int filterNum = Integer.parseInt(tokens[2]);
                    switch (tokens[1]){
                        case"<":
                            for (Integer item:numbers) {
                                if (item < filterNum){
                                    System.out.print(item + " ");
                                }
                            }
                            break;
                        case">":
                            for (Integer item:numbers) {
                                if (item > filterNum){
                                    System.out.print(item + " ");
                                }
                            }
                            break;
                        case">=":
                            for (Integer item:numbers) {
                                if (item >= filterNum){
                                    System.out.print(item + " ");
                                }
                            }
                            break;
                        case"<=":
                            for (Integer item:numbers) {
                                if (item <= filterNum){

                                    System.out.print(item + " ");
                                }
                            }

                            break;

                    }
                    System.out.println();
                    break;
            }




        }

    }
}
