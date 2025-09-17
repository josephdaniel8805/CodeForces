import java.util.*;

public class lensub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int left = 0, right = n, max = 0;
            int zero = 0;
            for (int ind = 0; ind < n; ind++) {
                arr[ind] = sc.nextInt();
                if (max < arr[ind]) {
                    max = arr[ind];
                    left = ind;
                    right = ind;
                }
            }
            if (arr[left] > 0) {
                arr[left]--;
                if (arr[left] == 0) zero++;
            }
            while (left <= right) {
                if (right == n - 1 && left > 0) {
                    left--;
                } else if (left == 0 && right < n - 1) {
                    right++;
                } else {
                    if (left > 0 && (right == n - 1 || arr[left - 1] > arr[right + 1])) {
                        left--;
                    } else if (right < n - 1) {
                        right++;
                    }
                }
                for (int i = left; i <= right; i++) {
                    if (arr[i] > 0) {
                        arr[i]--;
                        if (arr[i] == 0) zero++;
                    }
                }
                if (left == 0 && right == n - 1) {
                    if (zero == n) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                    break;
                }
            }
        }
        sc.close();
    }
}
