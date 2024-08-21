package baekjoon.q_1157;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(mostUseAlphabet(str));
    }

    public static char mostUseAlphabet(String str) {
        str = str.toUpperCase();
        int[] alphabetCount = new int[26];

        boolean duplicate = false;
        for (int i = 0; i < str.length(); i++) {
            alphabetCount[str.charAt(i) - 'A']++;
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] == max) {
                duplicate = true;
            }
            if (alphabetCount[i] > max) {
                max = alphabetCount[i];
                index = i;
                duplicate = false;
            }
        }

        if (duplicate) {
            return '?';
        }
        return (char) ('A' + index);
    }
}
