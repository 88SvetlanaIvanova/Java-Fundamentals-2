import java.util.Scanner;

public class Lab_07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text, quantity));

    }
    private static String repeatString(String text, int quantity){
        String result ="";
        for (int i = 0; i < quantity ; i++) {
            result+=text;
        }
        return result;

    }
}
