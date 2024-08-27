package baekjoon.q_1919;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        String line2 = br.readLine();

        int[] line1Arr = new int[26];
        int[] line2Arr = new int[26];

        for (int i = 0; i < line1.length(); i++) {
            line1Arr[line1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < line2.length(); i++) {
            line2Arr[line2.charAt(i) - 'a']++;
        }

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            if (line1Arr[i] != line2Arr[i]) {
                int diff = line1Arr[i] - line2Arr[i];
                if (diff < 0) {
                    diff = -diff;
                }
                answer = answer + diff;
            }
        }

        System.out.println(answer);
    }
}
