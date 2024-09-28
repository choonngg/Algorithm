package baekjoon.q_11005;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (n < b) {
            System.out.println(aToZ(n));
        } else {
            int count = n / b;
            String answer = "";
            while (count-- > 0) {
                int quotient = n / b;
                int remainder = n % b;

                answer = aToZ(remainder) + answer;
                if (quotient >= b) {
                    n = quotient;
                } else {
                    answer = aToZ(quotient) + answer;
                    break;
                }
            }
            System.out.println(answer);
        }
    }

    public static String aToZ (int number) {
        String[] aToZ = new String[26];
        char alphabet = 'A';
        for (int i = 0; i < aToZ.length; i++) {
            aToZ[i] = String.valueOf((char)(alphabet + i));
        }

        if (10 <= number && number < 36) {
            return aToZ[number - 10];
        } else if (number >= 36) {
            return "Z";
        } else {
            return String.valueOf(number);
        }
    }
}
