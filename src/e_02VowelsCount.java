import java.util.Scanner;

public class e_02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(vowelsCount(input));

    }
    public static int vowelsCount(String input){
        int vowelsCount=0;
        for (int i = 0; i <input.length() ; i++) {
            char letter = input.toLowerCase().charAt(i);
            switch (letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
            }


        }

        return vowelsCount;
    }

}
