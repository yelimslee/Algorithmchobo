import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int min = 10000;
            int max = 0;
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(st.nextToken());
                min = Math.min(min, n);
                max = Math.max(max, n);
                sum += n;
            }

            int result = (int) (Math.round((sum - max - min) / 8.0));
            System.out.printf("#%d %d\n", test_case, result);
        }
    }
}