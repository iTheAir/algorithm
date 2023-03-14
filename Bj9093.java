import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            String temp = br.readLine() + '\n';
            java.util.Stack<Character> stack = new java.util.Stack<>();
            for (char currentChar : temp.toCharArray()) {
                if (currentChar == ' ' || currentChar == '\n') {
                    while(!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(currentChar);
                    continue;
                }
                stack.push(currentChar);
            }
        }
        System.out.println(sb);
    }
}
