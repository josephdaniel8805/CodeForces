import java.util.*;

public class Pacer {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int m=sc.nextInt();
             long[][] arr = new long[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong(); 
                arr[i][1] = sc.nextLong(); 
            }
            long prevTime = 0;
            int prevSide = 0; 
            long moves = 0;
            for (int i = 0; i < n; i++) {
                long curTime = arr[i][0];
                int curSide = (int) arr[i][1];
                long delta = curTime - prevTime; 
                int needParity = prevSide ^ curSide; 
                if (delta % 2 == needParity) {
                    moves += delta;
                } else {
                    moves += delta - 1;
                }
                prevTime = curTime;
                prevSide = curSide;
            }
            moves += (m - prevTime);
            System.out.println(moves);
        } 
        sc.close();
    }    
}
