import java.util.*;

public class Q5M1 {
    static List<List<Integer>> findPairsWithDuplicatesM1(int[] a,int n,int t) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]+a[j]==t) {
                    List<Integer> l=new ArrayList<>();
                    l.add(a[i]);
                    l.add(a[j]);
                    li.add(l);
                }
            }
        }
        return li;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        System.out.println("Enter a target element: ");
        int t=sc.nextInt();
        List<List<Integer>> al=findPairsWithDuplicatesM1(arr,n,t);
        if(al.isEmpty())
            System.out.println("There are no element pairs in the array equal to the target.");
        else {
            System.out.println("The pairs equal to the target in the array are: ");
            for(List<Integer> a : al)
                System.out.println(a.get(0)+" "+a.get(1));
        }
    }
}
