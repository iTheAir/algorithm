import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] cnt = new int[1000001];
        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(st.nextToken());
            arr[i] = current;
            cnt[current]++;
        }
        int[] m = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
                m[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            m[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(m[i]).append(' ');
        }
        System.out.println(sb);
    }
}
