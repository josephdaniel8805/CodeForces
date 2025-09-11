import java.util.*;
 
public class samedream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
 
        int T = sc.nextInt();
        while(T-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
 
            String result = (isPossible(a, b) && isPossible(c-a, d-b)) ? "YES" : "NO";
            System.out.println(result);
        }
 
        sc.close();
    }
    private static boolean isPossible(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
 
        int streak = max - (min * 2);
 
        return streak < 3;
    }
}