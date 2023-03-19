import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/2743
// 단어 길이 재기
public class Bj2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length());
    }
}
