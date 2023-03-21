import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Bj1463 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] m = new int[n + 1];
        m[1] = 0;
        for (int i = 2; i <= n; i++) {
            m[i] = m[i - 1] + 1;
            if (i % 2 == 0) {
                int temp = m[i / 2] + 1;
                if (m[i] > temp) {
                    m[i] = temp;
                }
            }
            if (i % 3 == 0) {
                int temp = m[i / 3] + 1;
                if (m[i] > temp) {
                    m[i] = temp;
                }
            }
        }
        System.out.println(m[n]);
    }
}