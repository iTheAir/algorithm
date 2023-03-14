import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Stack;

// 에디터
// https://www.acmicpc.net/problem/1406
public class Bj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        Stack<Character> left = new Stack();
        Stack<Character> right = new Stack();
        for (char c : temp.toCharArray()) {
            left.push(c);
        }

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char instruction = st.nextToken().charAt(0);
            if (instruction == 'P') {
                char letter = st.nextToken().charAt(0);
                left.push(letter);
            } else if (instruction == 'L') {
                if (left.isEmpty()) continue;
                right.push(left.pop());
            } else if (instruction == 'D') {
                if (right.isEmpty()) continue;
                left.push(right.pop());
            } else if (instruction == 'B') {
                if (left.isEmpty()) continue;
                left.pop();
            }
        }

        while(!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();

        while(!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);

    }
}
