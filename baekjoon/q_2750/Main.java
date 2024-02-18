package baekjoon.q_2750;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nList = new int[n];
        for (int i = 0; i < n; i++) {
            nList[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (nList[j] > nList[j + 1]) {
                    int tmp = nList[j];
                    nList[j] = nList[j + 1];
                    nList[j + 1] =tmp;
                }
            }
        }

        for (int i : nList) {
            System.out.println(i);
        }
    }
}
