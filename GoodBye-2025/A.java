import java.util.*;
 
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int n=s.length();
            boolean flag = false;
            char ch=s.charAt(0);
            for(int ind=1;ind<n;ind++){
                char ch1=s.charAt(ind);
                if(ch1==ch){
                    if(ch=='Y'){
                        System.out.println("NO");
                        flag=true;
                        break;
                    }
                    ch='N';
                }else{
                    ch='Y';
                }
            }
            if(flag) continue;
            System.out.println("YES"); 
        }
    }    
}