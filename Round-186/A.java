import java.util.*;
 
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();sc.nextLine();
            String s=sc.nextLine();
            int ans=0;
            boolean found=false;
            for(int ind=0;ind<n-3;ind++){
                if(s.charAt(ind)=='2' && s.charAt(ind+1)=='0' && s.charAt(ind+2)=='2'){
                    if(s.charAt(ind+3)=='6'){
                        System.out.println(0);
                        found=true;
                        break;
                    }else if(s.charAt(ind+3)=='5'){
                        ans=1;
                    }else{
                        ind++;
                    }
                    
                }            
            }
            if(!found){
                System.out.println(ans);
            } 
        }
    }    
}