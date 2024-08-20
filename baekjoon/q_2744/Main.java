package baekjoon.q_2744;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solve(str));
    }

    public static String solve(String str) {
        String[] strArray = str.split("");

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(strArray[i].toLowerCase())) {
                strArray[i] = strArray[i].toUpperCase();
            } else {
                strArray[i] = strArray[i].toLowerCase();
            }
        }

        str = "";
        for (String s : strArray) {
            str += s;
        }
        return str;
    }
}
