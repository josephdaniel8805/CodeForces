
import java.util.*;
 
public class ondedigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- > 0){
            int temp=sc.nextInt();
            int min=Integer.MAX_VALUE;
            while(temp!=0){
                min=(min<(temp%10))?min:(temp%10);
                temp=temp/10;
            }
            System.out.println(min);
        }
       
        sc.close();
    }
}