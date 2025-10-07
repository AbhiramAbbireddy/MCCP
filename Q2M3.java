import java.util.*;

public class Q2M3 {
    static List<List<Integer>> findParisSortedM3(int[] a,int n,int t) {
        List<List<Integer>> li=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) {
            int x=a[i];
            int y=t-a[i];
            if(map.containsKey(y)) {
                List<Integer> l=new ArrayList<>();
                l.add(y);
                l.add(x);
                li.add(l);
            } else  
                map.put(x,1);
        }
        return li;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the sorted array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter a target element: ");
        int t=sc.nextInt();
        List<List<Integer>> al=findParisSortedM3(arr,n,t);
        if(al.isEmpty())
            System.out.println("There are no element pairs in the array equal to the target.");
        else {
            System.out.println("The pairs equal to the target in the array are: ");
            for(List<Integer> a : al)
                System.out.println(a.get(0) + " " + a.get(1)); 
        }
    }
}
