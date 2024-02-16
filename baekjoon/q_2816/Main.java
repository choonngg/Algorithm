package baekjoon.q_2816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bR.readLine());

        String[] channel = new String[n];
        for (int i = 0; i < n; i++) {
            channel[i] = bR.readLine();
        }

        while (true) {
            if (channel[0].equals("KBS1") && channel[1].equals("KBS2")) {
                break;
            }

            //Find : KBS1 -> KBS2
            findKBS(channel, "KBS1");
            findKBS(channel, "KBS2");
        }
    }

    static void findKBS(String[] channel, String name) {

        int num = 0;
        if (name.equals("KBS2")){
            num = 1;
        }


        if (!channel[num].equals(name)) {   //1,2번째 채널이 KBS1,2인 경우는 제외
            int point = 0;
            for (int i = num + 1; i < channel.length; i++) {
                if (channel[i].equals(name)) {
                    point = i;
                    break;
                }
            }

            //화살표를 KBS1,2까지 내리기
            for (int i = 0; i < point; i++) {
                System.out.print("1");
            }
            //KBS1,2을 1,2번째로 올리기
            for (int i = point; i > num; i--) {
                String tmp = channel[i-1];
                channel[i-1] = channel[i];
                channel[i] = tmp;
                System.out.print("4");
            }
        }
    }

}
