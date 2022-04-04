import java.util.Scanner;

public class Lab_09_GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("int")){
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum,secondNum));
        }
        else if (input.equals("char")){
            char first = scanner.next().charAt(0);
            char second = scanner.next().charAt(0);
            System.out.println(getMax(first,second));
        }
        else if (input.equals("string")){
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first,second));
        }

    }
    public static int getMax(int firstNum, int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }
        return  secondNum;
    }
    public static char getMax(char first, char second){
        if (first > second){
            return first;
        }
        return second;
    }
    public static String getMax (String first, String second){
        if (first.compareTo(second)>=0){
            return first;
        }
        return second;
    }
}
