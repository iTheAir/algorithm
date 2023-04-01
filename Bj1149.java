package DP1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// RGB 거리
// https://www.acmicpc.net/problem/1149
public class Bj1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] s = new int[n + 1][3];
        int[][] m = new int[n + 1][3]; // [i][0] = red, [i][1] = green, [i][2] = blue
        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 1; i <= n; i++) {
            m[i][0] = s[i][0] + Math.min(m[i - 1][1], m[i - 1][2]);
            m[i][1] = s[i][1] + Math.min(m[i - 1][0], m[i - 1][2]);
            m[i][2] = s[i][2] + Math.min(m[i - 1][0], m[i - 1][1]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 2; i++) {
            if (min > m[n][i]) {
                min = m[n][i];
            }
        }
        System.out.println(min);
    }
}
