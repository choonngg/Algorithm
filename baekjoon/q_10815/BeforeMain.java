package baekjoon.q_10815;

import java.util.Scanner;

public class BeforeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nLists = new int[n];
        for (int i = 0; i < n; i++) {
            nLists[i] = Integer.parseInt(scanner.next());
        }

        int m = scanner.nextInt();

        int[] mLists = new int[m];
        for (int i = 0; i < m; i++) {
            mLists[i] = Integer.parseInt(scanner.next());
        }

        boolean[] checks = new boolean[m];
        for (int i = 0; i < mLists.length; i++) {
            for (int j = 0; j < nLists.length; j++) {
                if (mLists[i] == nLists[j]) {
                    checks[i] = true;
                }
            }
        }

        for (boolean check : checks) {
            if (check) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
