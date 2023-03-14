import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            String ps = br.readLine();
            Stack<Integer> stack = new Stack<>();
            boolean isVPS = true;
            for (char currentP : ps.toCharArray()) {
                if (currentP == '(') {
                    stack.push(1);
                } else if (currentP == ')') {
                    if (stack.empty()) {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.empty()) isVPS = false;
            String ans;
            if (isVPS) {
                ans = "YES";
            } else {
                ans = "NO";
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }
}
