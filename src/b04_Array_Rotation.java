import java.util.Scanner;

public class b04_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n % input.length ; i++) {
            String temp = input[0];
            for (int j = 0; j < input.length - 1 ; j++) {
                input[j] = input[j + 1];

            }
            input[input.length - 1] = temp;

        }
        System.out.println(String.join(" ", input));





    }
}
