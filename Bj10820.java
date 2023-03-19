import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10820
// 문자열 분석
public class Bj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String temp = br.readLine();
            if (temp == null) break;
            int uppercase = 0;
            int lowercase = 0;
            int number = 0;
            int blank = 0;
            for (char c : temp.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    uppercase++;
                } else if (c >= 'a' && c <= 'z') {
                    lowercase ++;
                } else if (c >= '0' && c <= '9') {
                    number++;
                } else if (c == ' ') {
                    blank++;
                }
            }
            sb.append(lowercase).append(' ')
                    .append(uppercase).append(' ')
                    .append(number).append(' ')
                    .append(blank).append(' ')
                    .append('\n');
        }
        System.out.println(sb);
    }
}
