import java.util.*;
public class B {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
        int n=sc.nextInt();sc.nextLine();
        String s1=sc.next();
        String s2=sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : s2.toCharArray()){
            if(map.getOrDefault(ch,0)==0){
                map.remove(ch);
            }else{
                map.put(ch,map.get(ch)-1);
                if(map.getOrDefault(ch,0)==0){
                    map.remove(ch);
                }
            }
        }
        if(map.size()==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
       }
   } 
}