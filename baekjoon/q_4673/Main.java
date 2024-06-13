package baekjoon.q_4673;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i < 10001; i++) {
            set.add(i);
        }

        for (int i = 1; i < 10001; i++) {
            set.remove(d(i));
        }

        for (Integer i : set) {
            System.out.println(i);
        }
    }

    static int d(int n) {
        String s = Integer.toString(n);
        int sum = n;

        for (int i = 0; i < s.length(); i++) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
