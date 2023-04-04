import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가장 긴 바이토닉 부분 수열
// https://www.acmicpc.net/problem/11054
public class Bj11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] m = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            m[i] = 1;
            for (int j = 1; j < i; j++) {
                // LIS
                if (arr[i] > arr[j] && m[i] < m[j] + 1) {
                    m[i] = m[j] + 1;
                }
            }
        }

        int[] temp = new int[n + 1];
        for (int i = n; i >= 1; i--) {
            temp[i] = 1;
            for (int j = n; j > i; j--) {
                if (arr[i] > arr[j] && temp[i] < temp[j] + 1) {
                    temp[i] = temp[j] + 1;
                }
            }
        }
        int lbs = 0;
        for (int i = 1; i <= n; i++) {
            if (lbs < (m[i] + temp[i] - 1)) {
                lbs = m[i] + temp[i] - 1;
            }
        }
        System.out.println(lbs);
    }
}
