package baekjoon.q_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int diff = o1.length() - o2.length();
                if (diff != 0) {
                    return diff;
                }
                return o1.compareTo(o2);
            }
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>(comparator);
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
