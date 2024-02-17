package baekjoon.q_1747;

import java.util.Scanner;

public class BeforeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n <= 1000000) {
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
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
