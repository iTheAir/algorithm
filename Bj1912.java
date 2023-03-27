import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연속합
// https://www.acmicpc.net/problem/1912
public class Bj1912 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] m = new int[n + 1];
        int max = arr[1];
        m[1] = arr[1];
        for (int i = 1; i <= n; i++) {
            int sum = arr[i] + m[i-1];
            if (sum > arr[i]) {
                m[i] = sum;
            } else {
                m[i] = arr[i];
            }
            max = Math.max(m[i], max);
        }
        System.out.println(max);
    }
}
