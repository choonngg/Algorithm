package baekjoon.q_10431;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());
        for (int i = 1; i < p + 1; i++) {
            var st = new StringTokenizer(br.readLine());
            st.nextToken();

            int[] arr = new int[20];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = arr.length - 1; k > 0; k--) {
                    if (arr[k] < arr[k - 1]) {
                        int tmp = arr[k];
                        arr[k] = arr[k - 1];
                        arr[k - 1] = tmp;
                        count++;
                    }
                }
            }

            System.out.println(i + " " + count);
        }
    }
}
