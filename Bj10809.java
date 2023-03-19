import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/10809
// 알파벳 찾기
public class Bj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        int position = 0;
        for (char c : br.readLine().toCharArray()) {
            if (alphabets[c - 'a'] == -1) {
                alphabets[c - 'a'] = position;
            }
            position++;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : alphabets) {
            sb.append(num).append(' ');
        }
        System.out.println(sb);
    }
}
