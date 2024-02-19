package baekjoon.q_10815;

import java.io.*;
import java.util.*;

public class AfterMain2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> nSet = new HashSet<>();
        StringTokenizer nst = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nSet.add(Integer.parseInt(nst.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer mst = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (nSet.contains(Integer.parseInt(mst.nextToken()))) {
                sb.append("1").append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
