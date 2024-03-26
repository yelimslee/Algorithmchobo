import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            String s = br.readLine();

            int result = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                    result = 1;
                } else {
                    result = 0;
                }
            }

            System.out.printf("#%d %d\n", test_case, result);
        }
    }
}