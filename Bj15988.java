import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

// 1, 2, 3 더하기 3
// https://www.acmicpc.net/problem/15988
public class Bj15988 {
    private static final int mod = 1000000009;
    private static final int range = 1000001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[] m = new long[range];
        m[0] = 1;
        for (int i = 1; i < range; i++) {
            m[i] += m[i - 1];
            if (i - 2 >= 0) {
                m[i] += m[i - 2];
            }
            if (i - 3 >= 0) {
                m[i] += m[i - 3];
            }
            m[i] %= mod;
        }
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(m[n]).append('\n');
        }
        System.out.println(sb);
    }
}
