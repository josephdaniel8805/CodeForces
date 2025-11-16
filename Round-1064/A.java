import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();sc.nextLine();
            String s=sc.nextLine();
            char spread='0';
            HashMap<Character,Integer> map= new HashMap<>();
            for(char ch : s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
                spread=ch;
            }
            int sub=map.get(spread);
            System.out.println(s.length()-sub);
        }
    }    
}
