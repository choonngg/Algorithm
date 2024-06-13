package baekjoon.q_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] scores = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(line[i]);
        }

        int max = scores[0];
        for (int i = 0; i < n; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        double[] fakeScores = new double[n];
        for (int i = 0; i < n; i++) {
            fakeScores[i] = (double) scores[i] / max * 100;
        }

        double average = 0.0;
        for (int i = 0; i < n; i++) {
            average += fakeScores[i];
        }
        average = average / n;
        System.out.println(average);
    }
}
