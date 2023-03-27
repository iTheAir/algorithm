import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가장 긴 증가하는 부분 수열
// https://www.acmicpc.net/problem/11053
public class Bj11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] m = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            m[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j] && m[i] < m[j] + 1) {
                    m[i] = m[j] + 1;
                }
            }
        }
        int lis = 0;
        for (int num : m) {
            if (num > lis) {
                lis = num;
            }
        }
        System.out.println(lis);
    }
}
