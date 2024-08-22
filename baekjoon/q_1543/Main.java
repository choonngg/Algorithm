package baekjoon.q_1543;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String search = br.readLine();

        System.out.println(searchCount(word, search));
    }

    public static int searchCount(String word, String search) {
        int answer = 0;
        int wordLength = word.length();
        int searchLength = search.length();

        if (wordLength < searchLength) {
            return 0;
        }

        if (wordLength == searchLength) {
            if (word.equals(search)) {
                return 1;
            } else {
                return 0;
            }
        }

        for (int i = 0; i + searchLength <= wordLength; i++) {
            if (word.substring(i, i + searchLength).equals(search)) {
                answer++;
                i = i + searchLength - 1;
            }
        }
        return answer;
    }
}
