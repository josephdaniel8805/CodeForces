import java.util.*;
public class A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),ans=0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ind=0;ind<n;ind++){
                int temp=sc.nextInt();
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getKey()<entry.getValue()){
                    ans+=(entry.getValue()-entry.getKey());
                }else if(entry.getKey()!=entry.getValue()){
                    ans+=(entry.getValue());
                }
            }
            System.out.println(ans);
        }
    }
}