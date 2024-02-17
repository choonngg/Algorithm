package baekjoon.q_1747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AfterMain {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        while (true) {
            if (isPalindrome(n) && isPrime(n)) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }

    static boolean isPalindrome(int n) {

        String nStr = Integer.toString(n);

        StringBuffer sb = new StringBuffer(nStr);
        String rnStr = sb.reverse().toString();
//        String rnStr = new StringBuffer(nStr).reverse().toString();

        return nStr.equals(rnStr);
    }

    static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
