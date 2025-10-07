import java.util.*;

public class Q5M2 {
    static List<List<Integer>> findPairsWithDuplicatesM2(int[] a,int n,int t) {
        List<List<Integer>> li=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) {
            int x=a[i];
            int y=t-x;
            if(map.containsKey(y) && map.get(y)>0) {
                int c=map.get(y);
                for(int j=0;j<c;j++) {
                    List<Integer> l=new ArrayList<>();
                    l.add(y);
                    l.add(x);
                    li.add(l);
                }
            }
            map.put(x,map.getOrDefault(x,0)+1);
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
        List<List<Integer>> al=findPairsWithDuplicatesM2(arr,n,t);
        if(al.isEmpty())
            System.out.println("There are no element pairs in the array equal to the target.");
        else {
            System.out.println("The pairs equal to the target in the array are: ");
            for(List<Integer> a : al)
                System.out.println(a.get(0)+" "+a.get(1));
        }
    }
}
