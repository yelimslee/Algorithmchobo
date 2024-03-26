import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            for (int i = 1; i < n + 1; i++) {
                if (i % 2 != 0) { // 홀수면
                    sum += i; // 그냥 더함
                } else {
                    sum -= i; // 짝수면 뺌
                }
            }
            System.out.printf("#%d %d\n", test_case, sum);
        }
    }
}