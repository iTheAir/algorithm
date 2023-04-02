import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11055
// 가장 큰 증가하는 부분 수열
public class Bj11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[n + 1];
        int[] m = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n ; i++) {
            ans[i] = Integer.parseInt(st.nextToken());
        }
        m[1] = ans[1];
        for (int i = 2; i <= n; i++) {
            m[i] = ans[i];
            for (int j = 1; j < i; j++) {
                if (ans[i] > ans[j] && m[i] < m[j] + ans[i]) {
                    m[i] = m[j] + ans[i];
                }
            }
        }
        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, m[i]);
        }
        System.out.println(max);
    }
}
