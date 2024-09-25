package baekjoon.q_10448;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] tN = new int[45];
        tN[0] = 0;
        for (int i = 1; i <= 44; i++) {
            tN[i] = (i * (i + 1)) / 2;
        }

        var br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(eureka(k, tN));
        }
    }

    public static int eureka(int k, int[] tN) {
        double nMax1 = nCalculator(k);
        for (int a = 1; a <= nMax1; a++) {
            int sub1 = k - tN[a];
            double nMax2 = nCalculator(sub1);
            for (int b = a; b <=nMax2; b++) {
                int sub2 = sub1 - tN[b];
                int nMax3 = (int) nCalculator(sub2);
                for (int c = b; c <= nMax3; c++) {
                    if (sub2 == tN[c]) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public static double nCalculator(int k) {
        return (-1 + (Math.sqrt(1 + 8*k))) / 2.0;
    }
}
