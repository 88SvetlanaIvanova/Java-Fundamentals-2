import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> result = readStringList(scanner);
        String command = scanner.nextLine();

        while (!"3:1".equals(command)) {
            String[] tokens = command.split("\\s+");


            switch (tokens[0]) {
                case "merge":

                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
               //     int leftBound = Math.max(startIndex, 0);
               //     int rightBound = Math.min(endIndex, result.size() - 1);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > result.size() - 1) {
                        endIndex = result.size() - 1;
                    }
                    int counter = startIndex;

                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = result.get(counter) + result.get(counter + 1);
                        result.set(counter, concat);
                        result.remove(counter + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);

                    String element = result.get(index);

                    List<String> newList = new ArrayList<>();

                    if (element.length() % partitions == 0) {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            for (int j = 0; j < portionLength; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                            newList.add(concat);
                        }
                    } else {
                        int portionLength = element.length() / partitions;
                        int count = 0;
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            if (i == partitions - 1) {
                                for (int j = count; j < element.length(); j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            } else {
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }
                            newList.add(concat);
                        }
                    }
                    result.remove(index);
                    result.addAll(index, newList);  break;
            }


            command = scanner.nextLine();
        }
        for (String s : result) {
            System.out.print(s + " ");
        }


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
