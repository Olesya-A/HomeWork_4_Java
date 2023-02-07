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
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
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
        iScanner.close();
        return listInput;
    }

    static int dequeue(Queue<Integer> listInput) {
        int item = listInput.poll(); // poll
        System.out.println(item);
        return item;
    }

    static int first(Queue<Integer> listInput) {
        int item = listInput.element(); // peek
        System.out.println(item);
        return item;
    }

}
