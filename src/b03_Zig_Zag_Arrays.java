import java.util.Scanner;

public class b03_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split(" ");
            //int firstEl = Integer.parseInt(input[0]);
            //int secondtEl = Integer.parseInt(input[1]);
            String firstEl = input[0];
            String secondEl = input[1];

            if (i % 2 ==0){
                firstArray[i] =  firstEl;
                secondArray[i] = secondEl;
            }else{
                firstArray[i] = secondEl;
                secondArray[i]  = firstEl;
            }


        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));


    }
}
