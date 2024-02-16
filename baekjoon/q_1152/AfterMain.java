package baekjoon.q_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AfterMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().trim();

        if (text.isEmpty()) {
            System.out.println(0);
        } else {
            String[] textSplit = text.split(" ");
            System.out.println(textSplit.length);
        }
    }
}
