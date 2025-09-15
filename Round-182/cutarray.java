import java.util.*;
/* optimal approach
 import java.util.*;

public class cutarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // prefix sums
            int[] prefix = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + arr[i - 1];
            }

            boolean found = false;

            // try all (l, r)
            for (int l = 1; l < n && !found; l++) {
                for (int r = l + 1; r < n; r++) {
                    int s1 = prefix[l] % 3;
                    int s2 = (prefix[r] - prefix[l]) % 3;
                    int s3 = (prefix[n] - prefix[r]) % 3;

                    if ((s1 == s2 && s2 == s3) || 
                        (s1 != s2 && s2 != s3 && s1 != s3)) {
                        System.out.println(l + " " + r);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("0 0");
            }
        }
    }
}

 */
public class cutarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]= new int[n];
            for(int ind=0;ind<n;ind++){
                arr[ind]=sc.nextInt();
            }
            boolean flag=false;
            if(n<2){
                System.out.println(0+" "+0);
                continue;
            }
            for(int l=1;l<n && !flag ;l++){
                for(int r=l+1;r<n;r++){
                    int s1=0,s2=0,s3=0;
                    for(int i=0;i<l;i++){
                        s1+=arr[i];
                    }
                    for(int i=l;i<r;i++){
                        s2+=arr[i];
                    }
                    for(int i=r;i<n;i++){
                        s3+=arr[i];
                    }
                    s1%=3;s2%=3;s3%=3;
                    if((s1==s2 && s2==s3) || (s1!=s2 && s2!=s3 && s1!=s3)){
                        System.out.println(l+" "+r);
                        flag=true;
                        break;
                    }
                }
                
            }
            if(!flag){
                System.out.println(0+" "+0);
            }
        }
        sc.close();
    }
}
