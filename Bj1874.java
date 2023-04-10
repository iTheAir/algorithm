import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        boolean isPossible = true;
        while(n-- > 0) {
            int currentInput = Integer.parseInt(br.readLine());
            if (currentNumber < currentInput) {
                while (currentNumber < currentInput) {
                    currentNumber++;
                    stack.push(currentNumber);
                    sb.append('+').append('\n');
                }
                stack.pop();
                sb.append('-').append('\n');
            } else {
                if (stack.peek() == currentInput) {
                    stack.pop();
                    sb.append('-').append('\n');
                } else {
                    isPossible = false;
                }
            }
        }
        if (!isPossible) {
            System.out.println("NO");
            System.exit(0);
        } else {
            System.out.println(sb);
        }
    }
}
