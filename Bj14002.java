import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 가장 긴 증가하는 부분 수열 4
// https://www.acmicpc.net/problem/14002
public class Bj14002 {
    private static StringBuilder sb;
    private static int[] record;
    private static int[] arr;
    private static void showRecords(int index) {
        if (index == 0) {
            return;
        }
        showRecords(record[index]);
        sb.append(arr[index]).append(' ');
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        int[] m = new int[n + 1];
        record = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            m[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j] && m[i] < m[j] + 1) {
                    m[i] = m[j] + 1;
                    record[i] = j;
                }
            }
        }
        int lis = 0;
        int lisIndex = -1;
        for (int i = 1; i <= n; i++) {
            if (m[i] > lis) {
                lis = m[i];
                lisIndex = i;
            }
        }
        sb = new StringBuilder();
        sb.append(lis).append('\n');
        showRecords(lisIndex);
        System.out.println(sb);
    }
}
