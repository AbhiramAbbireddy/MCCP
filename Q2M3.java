import java.util.*;

public class Q2M3 {
    static int[] findTargetM3(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: arr) {
            if(num==0) {
                if(set.contains(0))
                    return new int[]{0,0};
            } 
            else if(set.contains(-num)) 
                return new int[]{num,-num};
            set.add(num);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] sol=findTargetM3(arr);
        if(sol[0]==-1)
        System.out.println(" There is no pair exists with sum equal to target");
    else    
        System.out.println(" The pair exists with sum equal to target: (" + sol[0] + "," + sol[1] + ")");
    }
}