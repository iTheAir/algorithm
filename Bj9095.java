import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9095 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] m = new int[n + 1];
            m[0] = 1;
            for (int i = 1; i <= n; i++) {
                m[i] = m[i-1];
                if (i - 2 >= 0) {
                    m[i] += m[i-2];
                }
                if (i - 3 >= 0) {
                    m[i] += m[i-3];
                }
            }
            sb.append(m[n]).append('\n');
        }
        System.out.println(sb);
    }
}
