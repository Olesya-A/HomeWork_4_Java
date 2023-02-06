import java.util.LinkedList;
import java.util.Random;

/**
 * Задание 1.
 * Создать LinkedList целых чисел (заполнить случайными числами).
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linlist = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            linlist.add(random.nextInt(20));
        }
        System.out.println(linlist);
        System.out.println(reverseList(linlist));
    }


    static LinkedList<Integer> reverseList(LinkedList<Integer> listInput) {
        LinkedList<Integer> listOutput = new LinkedList<>();
        for (int j = listInput.size() - 1; j >= 0; j--) {
            listOutput.add(listInput.remove(j));
        }
        return listOutput;
    }
}