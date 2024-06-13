package baekjoon.q_8979;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int k = scanner.nextInt();

        int[][] countries = new int[n][4]; //국가번호,금,은,동

        //메달 정렬 (동->은->금 순으로 정렬했음)
        medalSort(countries, n);

        //국가번호k의 등수 출력
        int[] grades = new int[n];  //n-1번 인덱스=n번 국가

    }

    static void medalSort(int[][] countries, int n) {
        int[][] tmp = new int[1][n];
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j < countries.length - 1; j++) {
                for (int k = 0; k < countries.length - 1 - j; k++) {
                    if (countries[k][i] < countries[k + 1][i]) {
                        tmp[0] = countries[k];
                        countries[k] = countries[k + 1];
                        countries[k + 1] = tmp[0];
                    }
                }
            }
        }
    }
}
