import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15990 {
    private static final int MAX_VALUE = 100001;
    private static final int DIVIDER = 1000000009;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] m = new int[MAX_VALUE][4];
        int[] ans = new int[MAX_VALUE];

        for (int i = 1; i < MAX_VALUE; i++) {
            if (i - 1 >= 0) {
                m[i][1] = m[i - 1][2] + m[i - 1][3];
                if (i == 1) {
                    m[i][1] = 1;
                }
            }
            if (i - 2 >= 0) {
                m[i][2] = m[i - 2][1] + m[i - 2][3];
                if (i == 2) {
                    m[i][2] = 1;
                }
            }
            if (i - 3 >= 0) {
                m[i][3] = m[i - 3][1] + m[i - 3][2];
                if (i == 3) {
                    m[i][3] = 1;
                }
            }
            ans[i] = (m[i][1] + m[i][2] + m[i][3]) % DIVIDER;
        }
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int currentNum = Integer.parseInt(br.readLine());
            sb.append(ans[currentNum]).append('\n');
        }
        System.out.println(sb);
    }
}
