package baekjoon.q_11718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while (true) {
            str = br.readLine();
            if (str.isBlank() || str.isEmpty()) {
                break;
            }
            System.out.println(str);
        }
    }
}
