import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] s1 = new char[n];
        int[] f = new int[256];
        for (int i = 0; i < n; i++) {
            s1[i] = s.charAt(n - 1 - i);
            f[s1[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (f[s1[i]] == 1) System.out.print(s1[i]);
        }
    }
}
