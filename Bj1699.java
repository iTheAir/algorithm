import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 제곱수의 합
// https://www.acmicpc.net/problem/1699
public class Bj1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] m = new int[n + 1];

        m[1] = 1;
        for (int i = 2; i <= n; i++) {
            m[i] = i;
            for (int j = 1; j * j <= i; j++) {
                int currentCase = m[i - j * j] + 1;
                if (m[i] > currentCase) {
                    m[i] = currentCase;
                }
            }
        }
        System.out.println(m[n]);
    }
}
