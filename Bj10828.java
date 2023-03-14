import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10828 {
    static class Stack {
        private int[] stack;
        private int size;
        public Stack() {
            stack = new int[10000];
            size = 0;
        }

        void push(int n) {
            stack[size++] = n;
        }

        int pop() {
            if (size == 0) return -1;
            int ans = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return ans;
        }

        int empty() {
            if (size == 0) return 1;
            else return 0;
        }

        int top() {
            if (size == 0) return -1;
            else return stack[size - 1];
        }

        int size() {
            return size;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        while(n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String instruction = st.nextToken();
            if (instruction.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (instruction.equals("pop")) {
                sb.append(stack.pop()).append('\n');
            } else if (instruction.equals("size")) {
                sb.append(stack.size()).append('\n');
            } else if (instruction.equals("empty")) {
                sb.append(stack.empty()).append('\n');
            } else if (instruction.equals("top")) {
                sb.append(stack.top()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
