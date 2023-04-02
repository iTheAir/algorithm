import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9465
// 스티커
public class Bj9465 {
    private static final int range = 100001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] m = new int[n + 1][3];
            int[][] ans = new int[2][n];
            for (int i = 0; i <= 1; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < n; j++) {
                    ans[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            m[1][0] = 0;
            m[1][1] = ans[0][0];
            m[1][2] = ans[1][0];
            for (int i = 2; i <= n; i++) {
                m[i][0] = Math.max(Math.max(m[i-1][1], m[i-1][2]), m[i-1][0]);
                m[i][1] = Math.max(m[i-1][0], m[i-1][2]) + ans[0][i-1];
                m[i][2] = Math.max(m[i-1][0], m[i-1][1]) + ans[1][i-1];
            }
            int max = Math.max(Math.max(m[n][0], m[n][1]), m[n][2]);
            sb.append(max).append('\n');
        }
        System.out.println(sb);
    }
}
