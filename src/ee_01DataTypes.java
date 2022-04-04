import java.util.Scanner;

public class ee_01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData =scanner.nextLine();

        switch (inputData){
            case "int":
                int number = Integer.parseInt(scanner.nextLine());
               wokingWithData(number);
               break;
            case"real":
                double numberD = Double.parseDouble(scanner.nextLine());
                workingWithData(numberD);
                break;
            case"string":
                String input = scanner.nextLine();
                wokingWithData(input);
                break;
        }



    }

    private static void workingWithData(double numberD) {
        double result = numberD*1.5;
                System.out.println(String.format("%.2f", result));
    }

    public static void wokingWithData (int a){
       int result = a*2;
        System.out.println(result);
    }

    public static void wokingWithData (String a){

        System.out.println(String.format("$%s$",a));
    }
}
