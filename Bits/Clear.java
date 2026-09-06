package Bits;
import java.util.*;
public class Clear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = sc.nextInt();
        System.out.println(clearr(s, i));

    }
    public static String clearr(String s,int i){
        int num = Integer.parseInt(s,2);
        int bitmask = ~(1<<i);
        int res = num & (bitmask);
        String ans = Integer.toBinaryString(res);
        return ans;
    }
    public static String set(String s,int i){
        int num = Integer.parseInt(s,2);
        int bitmask = 1<<i;
        int res = num | bitmask;
        return Integer.toBinaryString(res);
    }
    
}
