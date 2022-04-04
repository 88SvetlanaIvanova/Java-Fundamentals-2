import java.util.Scanner;

public class e_06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }
    public static void printMiddleCharacter(String text){
        if (text.length() %2 == 0){
            char firstSymbol=text.charAt(text.length() /2 -1);
            System.out.print(firstSymbol);
        }
        char secondSymbol = text.charAt(text.length() /2);
        System.out.println(secondSymbol);
    }
}
