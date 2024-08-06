package baekjoon.q_1316;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopCount = Integer.parseInt(br.readLine());

        int groupWordAmount = 0;
        for (int i = 0; i < loopCount; i++) {
            String s = br.readLine();
            if (groupWordCheck(s)) {
                groupWordAmount++;
            }
        }
        System.out.println(groupWordAmount);
    }

    public static boolean groupWordCheck(String s) {
        List<Character> list = new ArrayList<>();

        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                list.add(s.charAt(i));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int j = i + 1;
            while (j < list.size()) {
                if (list.get(i) == list.get(j)) {
                    return false;
                }
                j++;
            }
        }
        return true;
    }

}
