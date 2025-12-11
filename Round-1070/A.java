import java.util.*;
 
public class A{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int ind=0;ind<n;ind++){
            arr[ind]=sc.nextInt();
        }
        int count=0;
        int i=0;
        int j=1;
        while(i<j&&i<n&j<n){
            if(arr[i]>arr[j]){
                count++;
            }
            else{
                i=j;
            } 
            j++;
        }
        System.out.println(count);
    }
}
}