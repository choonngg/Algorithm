package baekjoon.q_1920;

import java.util.Scanner;

public class BeforeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = Integer.parseInt(scanner.next());
        }

        int m = scanner.nextInt();
        int[] arrayM = new int[m];
        for (int i = 0; i < n; i++) {
            arrayM[i] = Integer.parseInt(scanner.next());
        }

        boolean[] checks = new boolean[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arrayM[i] == arrayN[j]) {
                    checks[i] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (checks[i]) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
