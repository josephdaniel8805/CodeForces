import java.util.*;
public class lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int ind=0;ind<n;ind++){
                a[ind]=sc.nextInt();
            }
            for(int ind=0;ind<n;ind++){
                b[ind]=sc.nextInt();
            }
            boolean flag=false;
            int ans=0;
            while (!flag) {
                boolean step1done = false; 
                for (int ind = 0; ind < n; ind++) {
                    if (a[ind] > b[ind]) {
                        a[ind]--;
                        step1done = true;
                        break; 
                    }
                }
                for (int ind = 0; ind < n; ind++) {
                    if (a[ind] < b[ind]) {
                        a[ind]++;
                        break; 
                    }
                }
                ans++;
                if (!step1done) { 
                    flag = true;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}