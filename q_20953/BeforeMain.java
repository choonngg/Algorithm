package q_20953;

import java.util.ArrayList;
import java.util.Scanner;

public class BeforeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            arrayList.add(dolmen(a, b));
        }
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    static int dolmen(int a, int b) {
        int sum, i, j, k;
        sum = 0;
        for (i = 0; i < a + b; i++) {
            for (j = 0; j < a + b; j++) {
                for (k = 0; k < j; k++) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
