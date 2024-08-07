package baekjoon.q_2839;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(minDelivery(n));
    }

    public static int minDelivery(int n) {
        List<int[]> list = new ArrayList<>();
        int aMax = n / 5;
        int bMax = n / 3;

        for (int a = 0; a <= aMax; a++) {
            for (int b = 0; b <= bMax; b++) {
                if (5 * a + 3 * b == n) {
                    list.add(new int[]{a, b});
                }
            }
        }

        if (list.isEmpty()) {
            return -1;
        }

        int count = 0;
        int[][] abArray = new int[list.size()][2];
        for (int[] ab : list) {
            if (count == list.size()) {
                break;
            }
            abArray[count][0] = ab[0];
            abArray[count][1] = ab[1];
            count++;
        }

        // 케이스가 하나면 무조건 정답
        if (list.size() == 1) {
            return abArray[0][0] + abArray[0][1];
        }

        // b/a를 해서 기울기가 가장 작은 케이스가 정답
        int answer = 0;
        double minIncline = (double) abArray[0][1] / abArray[0][0];
        double maxIncline = 0.0;
        for (int[] ints : abArray) {

            // a가 0일 경우
            if (ints[0] == 0) {
                continue;
            }

            // b가 0일 경우 -> 무조건 답
            if (ints[1] == 0) {
                return ints[0] + ints[1];
            }

            maxIncline = (double) ints[1] / ints[0];
            if (minIncline > maxIncline) {
                minIncline = maxIncline;
                answer = ints[0] + ints[1];
            }
        }

        return answer;
    }
}
