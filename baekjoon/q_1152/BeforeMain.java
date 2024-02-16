package baekjoon.q_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeforeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        if (text.charAt(0) == ' ') {
            String tmp = "";
            for (int i = 1; i < text.length(); i++) {
                tmp += text.charAt(i);
            }
            text = tmp;
        }
        if (text.charAt(text.length() - 1) == ' ') {
            String tmp = "";
            for (int i = 0; i < text.length() - 1; i++) {
                tmp += text.charAt(i);
            }
            text = tmp;
        }

        String[] textSplit = text.split(" ");
        System.out.println(textSplit.length);
    }
}
