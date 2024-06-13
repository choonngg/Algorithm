package baekjoon.q_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = 20;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] subject = new String[n][3];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                subject[i][j] = line[j];
            }
        }

        double count = 0.0;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            if (subject[i][2].equals("A+")) {
                sum += 4.5 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("A0")) {
                sum += 4.0 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("B+")) {
                sum += 3.5 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("B0")) {
                sum += 3.0 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("C+")) {
                sum += 2.5 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("C0")) {
                sum += 2.0 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("D+")) {
                sum += 1.5 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("D0")) {
                sum += 1.0 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("F")) {
                sum += 0.0 * Double.parseDouble(subject[i][1]);
                count += Double.parseDouble(subject[i][1]);
            } else if (subject[i][2].equals("P")) {
                continue;
            }
        }
        double average = sum / count;
        System.out.println(average);
    }
}
