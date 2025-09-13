import java.util.*;

public class Lasers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int arr[]= new int[n];
            int arrm[]= new int[m];
            for(int ind=0;ind<n;ind++){
                arr[ind]=sc.nextInt();
            }
            for(int ind=0;ind<m;ind++){
                arrm[ind]=sc.nextInt();
            }
            System.out.println(n+m);
        }
        sc.close();
    }    
}
