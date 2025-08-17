import java.util.Scanner;
import java.util.Stack;

public class StackTech3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter no.of elements to be stored in stack: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++) 
            stack.add(sc.nextInt());
        System.out.println("The elements in the stack are: ");
        for(Integer x: stack)
            System.out.println(x);
        sc.close();
    }
}
