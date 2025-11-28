import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),value=1,max=0;
            int arr[][] = new int[n][n];
            for(int row=0;row<n;row++){
                for(int col=0;col<n;col++){
                    arr[row][col]=value++;
                }
            }
            int dir[][]={{0,1},{1,0},{-1,0},{0,-1},{0,0}};
            for(int row=0;row<n;row++){
                for(int col=0;col<n;col++){
                    int sum=0;
                    for(int ind=0;ind<5;ind++){
                        int newrow=row+dir[ind][0];
                        int newcol=col+dir[ind][1];
                        if(newrow>=0 && newrow<n && newcol>=0 && newcol<n){
                            sum+=arr[newrow][newcol];
        
                        }
                    }
                    max=(max>sum)?max:sum;
                }
            }
            System.out.println(max);
        }
    }
}