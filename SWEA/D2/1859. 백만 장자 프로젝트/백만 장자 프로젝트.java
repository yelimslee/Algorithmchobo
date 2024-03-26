import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            long profit = 0; // 오버플로우 방지로 long 타입을 써야 함!
            int max = arr[n - 1]; // 초기값
            for (int j = arr.length - 2; j >= 0; j--) {
                if (max > arr[j]) {
                    profit += max - arr[j];
                } else {
                    max = arr[j];
                }
            }

            System.out.printf("#%d %d\n", tc, profit);
        }
    }
}
