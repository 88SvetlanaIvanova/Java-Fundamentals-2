import java.util.Scanner;

public class b09_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int lineCount =0;
        int bestStartIndex = Integer.MAX_VALUE;
        int[] bestLine = new int[dnaLength];
        int bestLineNum = 0;
        int bestOnes = 0;
        int bestSum = 0;
        int sum = 0;

        while (!"Clone them!".equals(input)){
            String [] data = input.split("!+");

            int[] sequenceDNA = new int[dnaLength];

            for (int i = 0; i <data.length ; i++) {
                sequenceDNA[i] = Integer.parseInt(data[i]);
            }
            lineCount++;//ъпдейтваме номера на текущия ред
            int longestOnesIn_A_Row = 0;//поредица 1-ци на текущия ред
            int startIndex= Integer.MIN_VALUE;

            for (int i = 0; i <sequenceDNA.length ; i++) {
                int onesIn_A_Row = 0;
                for (int j = i; j <sequenceDNA.length ; j++) {
                    if (sequenceDNA[i] == sequenceDNA[j] && sequenceDNA[i] == 1){
                        onesIn_A_Row++;
                        if (onesIn_A_Row > longestOnesIn_A_Row){
                            longestOnesIn_A_Row = onesIn_A_Row;
                            startIndex = i;//индекса на 1-ците на текщия ред
                        }
                    }else{
                        break;
                    }
                }


            }
            if (longestOnesIn_A_Row > bestOnes){
                bestOnes = longestOnesIn_A_Row;//ъпдейтваме най-добрата последователност от 1-ци от всички редове до момента
                bestLine = sequenceDNA;
                bestLineNum = lineCount;
                bestStartIndex = startIndex;
            }else if (longestOnesIn_A_Row == bestOnes){
                if (startIndex < bestStartIndex){
                    bestLine = sequenceDNA;
                    bestLineNum = lineCount;
                    bestStartIndex = startIndex;
                }else if (startIndex == bestStartIndex){//при равни посл. 1-ци и индекси проверяваме сумите на текущия и най-добрия до момента ред
                    for (int i = 0; i < bestLine.length ; i++) {
                        bestSum += bestLine[i];
                    }
                    for (int i = 0; i <sequenceDNA.length ; i++) {
                        sum += sequenceDNA[i];
                    }
                    if (sum > bestSum){
                        bestLine = sequenceDNA;
                        bestLineNum = lineCount;
                        bestSum = sum;
                    }


                }
            }
            input = scanner.nextLine();

        }
        bestSum = 0;// да се избегне евентуален ред с по-голяма сума, но по-лоша последователност
        for (int i = 0; i <bestLine.length ; i++) {
            bestSum += bestLine[i];
        }
        // проверка за само нулеви редове
        if (bestSum == 0){
            bestLineNum =1;
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestLineNum, bestSum));
        for (int i = 0; i < bestLine.length ; i++) {
            System.out.print(bestLine[i] + " ");
        }


    }
}
