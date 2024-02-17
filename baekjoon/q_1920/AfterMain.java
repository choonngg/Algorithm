package baekjoon.q_1920;

import java.util.Arrays;
import java.util.Scanner;

public class AfterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = Integer.parseInt(scanner.next());
        }
        Arrays.sort(arrayN);

        int m = scanner.nextInt();
        int[] arrayM = new int[m];
        for (int i = 0; i < m; i++) {
            arrayM[i] = Integer.parseInt(scanner.next());
        }

        for (int i = 0; i < m; i++) {
            if (search(arrayN, arrayM[i])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    static boolean search(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (num > array[mid]) {
                low = mid + 1;
            } else if (num < array[mid]) {
                high = mid - 1;
            } else if (num == array[mid]) {
                return true;
            }
        }
        return false;
    }
}
