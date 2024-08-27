package baekjoon.q_1236;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());

        // 첫번째 입력 (x,y)
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // X와 . 입력받기 // X->true, .->false
        boolean[][] xy = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < y; j++) {
                if (str.charAt(j) == 'X') {
                    boolean b = true;
                    xy[i][j] = b;
                } else {
                    boolean b = false;
                    xy[i][j] = b;
                }
            }
        }

        // 가로와 세로 빈 줄을 구하고 최댓값을 구하면 답
        int wCount = 0;
        int hCount = 0;
        for (int i = 0; i < x; i++) {
            if (!xy[i][0]) {
                boolean b = false;
                for (int j = 1; j < y; j++) {
                    if (xy[i][j]) {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    continue;
                } else {
                    wCount++;
                }
            }
        }
        for (int i = 0; i < y; i++) {
            if (!xy[0][i]) {
                boolean b = false;
                for (int j = 1; j < x; j++) {
                    if (xy[j][i]) {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    continue;
                } else {
                    hCount++;
                }
            }
        }

        int answer = Math.max(wCount, hCount);
        System.out.println(answer);
    }
}
