import java.util.*;
public class B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            String s = sc.next();
 
            int eight = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '8') eight++;
            }
 
            long dx = Math.abs(x);
            long dy = Math.abs(y);
            int e = eight;
 
            long L = Math.max(0L, dx + dy - n);
            long R = Math.min(Math.min(dx, dy), (long)e);
 
            if (L <= R) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
