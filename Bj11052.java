import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 카드 구매하기
public class Bj11052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] m = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            m[i] = arr[i];
            for (int j = 1; j <= (i / 2); j++) {
                int current = m[j] + m[i - j];
                if (m[i] < current) {
                    m[i] = current;
                }
            }
        }
        System.out.println(m[n]);
    }
}
