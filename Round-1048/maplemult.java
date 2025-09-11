import java.util.Scanner;
 
public class maplemult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==b){
                System.out.println(0);
                continue;
            }
            if(a<b){
                if(b%a!=0){
                    System.out.println(2);
                }else{
                    System.out.println(1);
                }
            }else{
                if(a%b!=0){
                    System.out.println(2);
                }else{
                    System.out.println(1);
                }
            }
        }
        sc.close();
    }
}
