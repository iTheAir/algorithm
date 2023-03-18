import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/1935
// 후위 표기식2
public class Bj1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        Stack<Double> stack = new Stack<>();
        double[] input = new double[n];
        for (int i = 0; i < n; i++) {
            input[i] = Double.parseDouble(br.readLine());
        }

        for (char c : temp.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                double num = input[c - 'A'];
                stack.push(num);
            } else {
                double secondNum = stack.pop();
                double firstNum = stack.pop();
                double ans = 0;
                if (c == '*') {
                    ans = firstNum * secondNum;
                } else if (c == '+') {
                    ans = firstNum + secondNum;
                } else if (c == '-') {
                    ans = firstNum - secondNum;
                } else if (c == '/'){
                    ans = firstNum / secondNum;
                }
                stack.push(ans);
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
