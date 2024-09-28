package baekjoon.q_11068;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(isValid(n));
        }
    }

    public static char[] numberArr() {
        char[] arr = new char[65];

        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                arr[i] = (char) ('0' + i);
            }
            if (10 <= i && i <= 35) {
                arr[i] = (char) ('a' + i - 10);
            }
            if (36 <= i && i <= 61) {
                arr[i] = (char) ('A' + i - 36);
            }
            if (i == 62) {
                arr[i] = '!';
            }
            if (i == 63) {
                arr[i] = '@';
            }
            if (i == 64) {
                arr[i] = '#';
            }
        }
        return arr;
    }

    // 진법 변환 (리턴 : 변환한 값)
    public static String convert(int n, int b) {
        char[] zeroTo64 = numberArr();  // 64까지 표현하기 위해 사용

        if (n < b) {
            return String.valueOf(zeroTo64[n]);
        } else {
            String result = "";
            int count = n / b;
            while (count-- > 0) {
                int quotient = n / b;
                int remainder = n % b;

                result = zeroTo64[remainder] + result;
                if (quotient >= b) {
                    n = quotient;
                } else {
                    result = zeroTo64[quotient] + result;
                    break;
                }
            }
            return result;
        }
    }

    public static int isValid(int n) {
        // 2-64진법 변환
        for (int i = 2; i <= 64; i++) {
            String result = convert(n, i);  // 변환한 값
            if (reverse(result)) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean reverse(String result) {
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
