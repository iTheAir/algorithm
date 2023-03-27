import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 쉬운 계단 수
// https://www.acmicpc.net/problem/10844
public class Bj10844 {
    private static final int DIVIDER = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] m = new long[n + 1][10];

        for (int i = 1; i <= 9 ; i++) {
            m[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j - 1 >= 0) {
                    m[i][j] += m[i-1][j-1];
                }
                if (j + 1 <= 9) {
                    m[i][j] += m[i-1][j + 1];
                }
                m[i][j] %= DIVIDER;
            }
        }
        long ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += m[n][i];
        }
        System.out.println(ans % DIVIDER);
    }
}
