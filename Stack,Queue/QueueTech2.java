import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTech2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("Enter no. of elements to be stored in queue: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            queue.add(sc.nextInt());
        System.out.println("The elements in the queue are: ");
        for (Integer x : queue)
            System.out.println(x);
        sc.close();
    }
}