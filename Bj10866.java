import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String instruction = st.nextToken();
            if (instruction.equals("push_front")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (instruction.equals("push_back")) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (instruction.equals("pop_front")) {
                if (deque.size() == 0) {
                    sb.append("-1").append('\n');
                } else {
                    sb.append(deque.pollFirst()).append('\n');
                }
            } else if (instruction.equals("pop_back")) {
                if (deque.size() == 0) {
                    sb.append("-1").append('\n');
                } else {
                    sb.append(deque.pollLast()).append('\n');
                }
            } else if (instruction.equals("size")) {
                sb.append(deque.size()).append('\n');
            } else if (instruction.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append("1").append('\n');
                } else {
                    sb.append("0").append('\n');
                }
            } else if (instruction.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekFirst()).append('\n');
                }

            } else if (instruction.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
