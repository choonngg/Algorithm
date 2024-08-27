package baekjoon.q_13223;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        var br = new BufferedReader(new InputStreamReader(System.in));

        String currentTime = br.readLine();
        String sortTime = br.readLine();

        int current = Integer.parseInt(currentTime.substring(0, 2)) * 60 * 60
                + Integer.parseInt(currentTime.substring(3,5)) * 60
                + Integer.parseInt(currentTime.substring(6));
        int sort = Integer.parseInt(sortTime.substring(0, 2)) * 60 * 60
                + Integer.parseInt(sortTime.substring(3,5)) * 60
                + Integer.parseInt(sortTime.substring(6));

        int need = sort - current;
        if (need <= 0) {
            need += 24 * 60 * 60;
        }

        int hour = need / 3600;
        need = need % 3600;
        int minute = need / 60;
        int second = need % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
