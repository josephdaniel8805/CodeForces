import java.util.*;
public class appletree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int ind=0;ind<n;ind++){
                set.add(sc.nextInt());
            }
            System.out.println(set.size());
        }
    }
}
