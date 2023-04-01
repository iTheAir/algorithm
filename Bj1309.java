package DP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 동물원
// https://www.acmicpc.net/problem/1309
public class Bj1309 {
    private static final int DIVIDER = 9901;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] m = new long[n + 1][3];

        m[1][0] = 1;
        m[1][1] = 1;
        m[1][2] = 1;
        for (int i = 2; i <= n; i++ ){
            m[i][0] = (m[i-1][0] + m[i-1][1] + m[i-1][2]) % DIVIDER; // n번 행에 사자가 없는 경우
            m[i][1] = (m[i-1][0] + m[i-1][2]) % DIVIDER; // n번 행의 1번에 사자가 있는 경우
            m[i][2] = (m[i-1][0] + m[i-1][1]) % DIVIDER; // n번 행의 2번에 사자가 있는 경우
        }
        System.out.println((m[n][0] + m[n][1] + m[n][2]) % DIVIDER);
    }
}
