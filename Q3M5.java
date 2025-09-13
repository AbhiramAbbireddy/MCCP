import java.util.Arrays;
import java.util.Scanner;

public class Q3M5 {
    static int findRepeatedQ3M3(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2) {
            if(arr[i]!=arr[i+1])
                return arr[i];
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: (odd)");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int rep = findRepeatedQ3M3(arr);
        if (rep == -1)
            System.err.println("There is no repeated element in the array");
        else
            System.out.println("The repeated element in the array is " + rep);
    }
}
