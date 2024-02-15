package q_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bR.readLine());
        int count = 0;

        int nn = n;
        while (true) {
            nn = (nn % 10 * 10) + ((nn / 10 + nn % 10) % 10);
            count++;
            if (n == nn) {
                break;
            }
        }
        System.out.println(count);
    }
}
