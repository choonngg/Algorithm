package baekjoon.q_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BeforeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> nList = new ArrayList<>();
        List<String> mList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nList.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            mList.add(br.readLine());
        }

        int count = 0;
        List<String> check = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (mList.contains(nList.get(i))) {
                check.add(nList.get(i));
                count++;
                continue;
            }
        }

        Collections.sort(check);
        System.out.println(count);
        for (String s : check) {
            System.out.println(s);
        }
    }
}
