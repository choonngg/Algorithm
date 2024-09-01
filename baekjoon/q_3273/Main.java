package baekjoon.q_3273;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[2000001];
        var st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int x = Integer.parseInt(br.readLine());

        int count = 0;
        int end = (x / 2 == x - x / 2) ? x / 2 - 1 : x / 2;
        for (int i = 0; i <= end; i++) {
            if (arr[i] + arr[x - i] > 1) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
