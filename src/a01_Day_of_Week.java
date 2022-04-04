import java.util.Scanner;

public class a01_Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String [] days = {
              "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
      };
        int weekDay = Integer.parseInt(scanner.nextLine());
        if (weekDay>=1 && weekDay<=7){
            System.out.println(days[weekDay - 1]);
        }else System.out.println("Invalid day!");

    }
}
