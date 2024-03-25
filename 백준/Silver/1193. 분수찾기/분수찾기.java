// 복습

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cross_count = 1; // 해당 범위의 대각선 칸의 개수 (1부터 시작)
        int prev_count_sum = 0; // 해당 대각선 직전 대각선까지의 칸의 누적 합

        while (true) {

            // 직전 대각선 누적합 + 해당 대각선 개수를 이용한 범위 판별
            if (X <= cross_count + prev_count_sum) {

                if (cross_count % 2 == 1) { // 대각선의 개수가 홀수
                    // 분자가 큰 수부터 시작
                    // 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 -1)
                    // 분모는 X번째 - 직전 대각선까지의 블럭 개수
                    System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                } else {
                    System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
                    break;
                }

            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}