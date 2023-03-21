import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Bj11727 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] m = new int[n + 1];
        m[0] = 1;
        m[1] = 1;
        for (int i = 2; i <= n; i++) {
            m[i] = (m[i-1] +  2 * m[i - 2]) % 10007;
        }
        System.out.println(m[n]);
    }
}
