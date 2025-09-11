import java.util.*;
public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();sc.nextLine();
            String a=sc.nextLine();
            int m=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String str=sc.nextLine();
            StringBuilder sb=new StringBuilder(a);
            int ind=0;
            for(char ch:str.toCharArray()){
                if(ch=='D'){
                    sb.append(b.substring(ind,++ind));
                }else{
                    sb.insert(0,b.substring(ind,++ind));
                }
            }
            System.out.println(sb);
        }
        sc.close();
    }
}