import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        Stack<Character> stack = new Stack<>();
        int total = 0;
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                stack.pop();
                if (temp.charAt(i - 1) == '(') {
                    total += stack.size();
                } else {
                    total += 1;
                }
            }
        }
        System.out.println(total);
    }
}
