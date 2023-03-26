import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이친수
// https://www.acmicpc.net/problem/2193
public class Bj2193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] m = new long[n + 1][2];
        m[1][0] = 0;
        m[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            m[i][0] = m[i-1][1] + m[i-1][0];
            m[i][1] = m[i-1][0];
        }
        System.out.println(m[n][0] + m[n][1]);
    }
}
