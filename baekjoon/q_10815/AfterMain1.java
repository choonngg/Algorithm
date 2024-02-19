package baekjoon.q_10815;

import java.io.*;
import java.util.Arrays;

public class AfterMain1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];
        String[] nTokens = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(nTokens[i]);
        }
        Arrays.sort(nArr);

        int m = Integer.parseInt(br.readLine());
        int[] mArr = new int[m];
        String[] mTokens = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            mArr[i] = Integer.parseInt(mTokens[i]);
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(binarySearch(nArr, mArr[i])).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static int binarySearch(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (num > array[mid]) {
                low = mid + 1;
            } else if (num < array[mid]) {
                high = mid - 1;
            } else if (num == array[mid]) {
                return 1;
            }
        }
        return 0;
    }
}
