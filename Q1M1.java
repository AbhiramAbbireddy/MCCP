import java.util.*;
public class Q1M1 {
    static void freqHash(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        for(Map.Entry<Character,Integer> e : map.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str=sc.next();
        freqHash(str.toLowerCase());
    }
}
