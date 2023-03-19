import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11656
// 접미사 배열
public class Bj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        StringBuilder sb;
        String[] str = new String[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            str[i] = temp.substring(i);
        }
        Arrays.sort(str);
        sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
