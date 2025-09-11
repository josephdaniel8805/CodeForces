import java.util.*; 
public class painttwo { 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        int t=sc.nextInt(); 
        while(t-- >0){ 
            long n=sc.nextLong(); 
            long a=sc.nextLong(); 
            long b=sc.nextLong(); 
            if(a<=b){
                if((n-b)%2==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if((n-a)%2==0 && (n-b)%2==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        } 
        sc.close();
    } 
}