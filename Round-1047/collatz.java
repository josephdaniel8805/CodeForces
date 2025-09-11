import java.util.*;
/* import java.util.*;

public class CollatzConjecture{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int x = sc.nextInt();
            long ans = x*(1L<<k); 
            System.out.println(ans);
        }
    }
}*/
public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            int x=sc.nextInt();
            for(int ind=0;ind<k;ind++){
                if((x-1)%3==0){
                    int y=(x-1)/3;
                    if(y%2==1){
                        x=y;
                    }else{
                        x=x*2;
                    }
                }else{
                    x*=2;
                }
            }
            System.out.println(x);
        }
        sc.close();
    }
} 