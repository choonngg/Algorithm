package baekjoon.q_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AfterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> nSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            nSet.add(br.readLine());
        }

        List<String> check = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String mInput = br.readLine();
            if (nSet.contains(mInput)) {
                check.add(mInput);
            }
        }

        Collections.sort(check);
        System.out.println(check.size());
        for (String s : check) {
            System.out.println(s);
        }
    }
}
