import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 카드 구매하기2
public class Bj16194 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n + 1];
        int[] m = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            m[i] = cards[i];
            for (int j = 1; j <= (i / 2); j++) {
                int temp = m[j] + m[i - j];
                if (m[i] > temp) {
                    m[i] = temp;
                }
            }
        }
        System.out.println(m[n]);
    }
}
