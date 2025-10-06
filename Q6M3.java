import java.util.*;

public class Q6M3 {
    static int[] findPairSortM4(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(num==0) {
                if(map.containsKey(0))
                    return new int[]{map.get(0),i};
            }
            else if(map.containsKey(-num))
                return new int[]{map.get(-num), i};
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++) 
            arr[i]=sc.nextInt();
        int[] sol = findPairSortM4(arr,n);
        if(sol[0]==-1) 
            System.out.println("No pair exists");
        else 
            System.out.println("Pair found: (" + sol[0] + ", " + sol[1] + ")");
    }
}
