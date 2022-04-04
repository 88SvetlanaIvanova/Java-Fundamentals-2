import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> deck1 = readListInteger(scanner);
        List<Integer> deck2 = readListInteger(scanner);
//Игрок, у которого есть карта побольше, берет обе карты и кладет их на тыльную сторону ладони - 
// карта второго игрока является последней - tempLast , а карта первого человека (выигравшая) находится перед
// ней (предпоследняя) - temp  , а игрок с меньшая карта должна удалить карту из его колоды. Если карты
// обоих игроков имеют одинаковые значения - никто не выигрывает, и две карты необходимо удалить из колоды. 
// Игра заканчивается, когда одна из колод остается без карт.
         int deckLength = deck1.size();

           for (int i = 0; i < deckLength-1; i++){

              if(isEmpty(deck1,deck2)){
                 break;
               }
               if (deck1.get(i) > deck2.get(i)){
                   int temp = deck1.remove(i);
                   int tempLast = deck2.remove(i);
                   deck1.add(temp);
                   deck1.add(tempLast);
                   i--;
               }else if(deck1.get(i) < deck2.get(i)){
                   int temp = deck2.remove(i);
                   int tempLast = deck1.remove(i);
                   deck2.add(temp);
                   deck2.add(tempLast);
                   i--;
               }else{
                   deck1.remove(i);
                   deck2.remove(i);
                   i--;
               }
           }

      //You have to print the winner on the console and the sum of the left cards: "Player {one/two} wins! Sum: {sum}".
        int sum =0;
        if (deck1.isEmpty()){
            for (Integer integer : deck2) {
                sum+=integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }else if (deck2.isEmpty()){
            for (Integer integer : deck1) {
                sum+=integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);

        }

    }

    private static boolean isEmpty(List<Integer>deck1,List<Integer>deck2) {
        boolean isEmpty = deck1.isEmpty()||deck2.isEmpty();
        return isEmpty;
    }

    private static List<Integer> readListInteger(Scanner scanner) {
        String[] split = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String s : split) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
