package q_1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bR.readLine());
        int count = 0;

        String nStr = Integer.toString(n);
        if (n < 10) {
            nStr = "0" + nStr;
        }

        while (true) {
            int nLeft = Integer.parseInt(String.valueOf(nStr.charAt(0)));
            int nRight = Integer.parseInt(String.valueOf(nStr.charAt(nStr.length() - 1)));
            String nRightStr = String.valueOf(nStr.charAt(nStr.length() - 1));

            int sumLR = nLeft + nRight;
            String sumLRStr = Integer.toString(sumLR);
            String sumRightStr = String.valueOf(sumLRStr.charAt(sumLRStr.length() - 1));

            nStr = nRightStr + sumRightStr;
            int nn = Integer.parseInt(nStr);

            count++;
            if (n == nn) {
                break;
            }
        }
        System.out.println(count);
    }
}
