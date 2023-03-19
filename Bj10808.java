import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// https://www.acmicpc.net/problem/10808
// 알파벳 개수
public class Bj10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabets = new int[26];
        String temp = br.readLine();
        for (char c : temp.toCharArray()) {
            alphabets[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int a : alphabets) {
            sb.append(a).append(' ');
        }
        System.out.println(sb);
    }
}
