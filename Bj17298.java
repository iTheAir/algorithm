import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        int[] m = new int[n];

        for (int i = 0 ; i < n; i++) {
            int current = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] < current) {
                m[stack.pop()] = current;
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
