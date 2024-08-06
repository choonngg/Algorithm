package baekjoon.q_1010;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(combination(m, n));
        }
    }

    public static long combination(int m, int n) {
        long dem = 1;
        long mol = 1;

        if (n > m / 2) {
            n = m - n;
        }

        if (n == 1) {
            return m;
        } else {
            for(int i=0; i<n; i++) {
                dem = dem * (m - i);
                mol = mol * (i + 1);
            }
            return dem / mol;
        }
    }
}
