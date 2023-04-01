package DP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11057
// 오르막 수
public class Bj11057 {
    private static final int DIVIDER = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] m = new int[n + 1][10];
        for (int i = 0; i <= 9; i++) {
            m[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= j; k++) {
                    m[i][j] += (m[i-1][k] % DIVIDER);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= 9; i++) {
            ans += m[n][i];
        }
        System.out.println(ans % DIVIDER);
    }
}
