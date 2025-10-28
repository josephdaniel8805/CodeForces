import java.util.*;
public class C {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]= new int[n];
            int even=0,odd=0;
            for(int ind=0;ind<n;ind++){
                arr[ind]=sc.nextInt();
                if(arr[ind]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(odd!=0 && even!=0){
                Arrays.sort(arr);
            }
            for(int ind=0;ind<n;ind++){
                System.out.print(arr[ind]+" ");
                
            }
            System.out.println();
        }
    }
}
