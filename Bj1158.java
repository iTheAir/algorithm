import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        int index = 1;
        while(!q.isEmpty()) {
            if (index % k == 0) {
                sb.append(q.poll());
                if (!q.isEmpty()) {
                    sb.append(", ");
                }
            } else {
                q.add(q.poll());
            }
            index++;
        }
        sb.append('>');
        System.out.println(sb);

    }
}
