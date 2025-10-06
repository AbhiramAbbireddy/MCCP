import java.util.HashSet;
import java.util.Scanner;

public class Q1M3 {
    static boolean findTargetM4(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr) {
            if(num==0) {
                if(set.contains(0))
                    return true;
            } 
            else if(set.contains(-num)) 
                return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        if(findTargetM4(arr))
            System.out.println(" The pair exists with sum equal to zero");
        else    
            System.out.println(" There is no  pair exists with sum equal to zero");
    }
}
