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
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());

            int H, M;
            H = h1 + h2;
            M = m1 + m2;
            if (m1 + m2 >= 60) {
                H++;
                M -= 60;
            }

            if (H > 12) {
                H -= 12;
            }

            System.out.printf("#%d %d %d\n", test_case, H, M);
        }
    }
}