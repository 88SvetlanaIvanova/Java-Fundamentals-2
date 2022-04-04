import java.util.Scanner;

public class e_03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first>second){
            printSCII_Gap(second,first);
        }else{
            printSCII_Gap(first ,second);
        }


    }
    public static void printSCII_Gap(char first, char second){
        for (int i = first +1; i < second ; i++) {
            System.out.print(String.format("%c ",i));

        }
    }
}
