import java.util.*;

public class Sublimeseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int sum=0;
            while(n-- >0){
                sum+=x;
                x*=-1;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
