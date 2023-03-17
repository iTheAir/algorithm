import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine() + '\n';

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean isOpened = false;

        for(char c : s.toCharArray()) {
            if (c == '\n') {
                while(!stack.empty()) {
                    sb.append(stack.pop());
                }
            }
            if (isOpened) {
                if (c == '>') {
                    isOpened = false;
                    sb.append('>');
                    continue;
                }
                sb.append(c);

            } else {
                if (c == '<') {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append('<');
                    isOpened = true;
                    continue;
                }
                if (c == ' ') {
                    while(!stack.empty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    stack.push(c);
                }
            }
        }
        System.out.println(sb);
    }
}
