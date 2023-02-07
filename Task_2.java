import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
Задание 2:
Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.
 */
public class Task_2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        enqueue(queue);
        enqueue(queue);
        enqueue(queue);
        enqueue(queue);
        System.out.println(queue);
        dequeue(queue);
        System.out.println(queue);
        first(queue);
        System.out.println(queue);
    }

    static Queue<Integer> enqueue(Queue<Integer> listInput) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        Integer input = iScanner.nextInt();
        listInput.add(input); // offer
        return listInput;
    }

    static int dequeue(Queue<Integer> listInput) {
        int item = listInput.poll(); //remove
        System.out.println(item);
        return item;
    }

    static int first(Queue<Integer> listInput) {
        int item = listInput.peek(); // element
        System.out.println(item);
        return item;
    }

}
