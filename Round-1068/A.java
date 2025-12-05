import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();sc.nextLine();
            String s=sc.nextLine();
            int count=0,sleep=0;
            for(char ch : s.toCharArray()){
                if(ch=='1'){
                    count=k;
                }else if(ch=='0'){
                    if(count!=0){
                        count--;
                        continue;
                    }else{
                        sleep++;
                    }
                }
            }
            System.out.println(sleep);
        }
    }
}
