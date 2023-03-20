import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/11655
// ROT13
class Bj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (char c : temp.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c += 13;
                if (c > 'Z') {
                    c = (char)('A' + (c - 'Z') - 1);
                }
            } else if (c >= 'a' && c <= 'z') {
                c += 13;
                if (c > 'z') {
                    c = (char)('a' + (c - 'z') - 1);
                }
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
