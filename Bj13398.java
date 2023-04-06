import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연속합2
public class Bj13398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] m = new int[n + 1];
        m[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            m[i] = arr[i];
            int temp = m[i-1] + arr[i];
            if (m[i] < temp) {
                m[i] = temp;
            }
        }

        int[] mr = new int[n + 1];
        mr[n] = arr[n];
        for (int i = n-1; i >= 1; i--) {
            mr[i] = arr[i];
            int temp = mr[i + 1] + arr[i];
            if (mr[i] < temp) {
                mr[i] = temp;
            }
        }

        int max = m[1];
        for (int i = 2; i <= n; i++) {
            if (max < m[i]) {
                max = m[i];
            }
        }
        for (int i = 2; i < n; i++) {
            max = Math.max(max, m[i-1] + mr[i + 1]);
        }
        System.out.println(max);
    }
}
