import java.util.*;
 
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int ind=0;ind<n;ind++){
                arr[ind]=sc.nextInt();
            }
            long total=0;
            for(int ind=1;ind<n;ind++){
                total+=Math.abs(arr[ind-1]-arr[ind]);
            }
            long ans=total;
            ans=Math.min(ans,total-Math.abs(arr[0]-arr[1]));
            ans=Math.min(ans,total-Math.abs(arr[n-1]-arr[n-2]));
            for(int ind=1;ind<n-1;ind++){
                long temp= total-Math.abs(arr[ind]-arr[ind-1])-Math.abs(arr[ind+1]-arr[ind])+Math.abs(arr[ind+1]-arr[ind-1]);
                ans=Math.min(ans,temp);
            }
            System.out.println(ans);
        }
    }    
}
