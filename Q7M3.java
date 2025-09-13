import java.util.*;

public class Q7M3 {
    static boolean isIsogramM3(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++) {
            if(arr[i] == arr[i-1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        if (isIsogramM3(str.toLowerCase()))
            System.out.println("The string is an Isogram");
        else
            System.out.println("The string is not an Isogram");
    }
}