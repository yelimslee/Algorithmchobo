import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T+1; test_case++) { 
            String str = br.readLine();

            for (int i = 1; i <= 10; i++) {
                String pre = str.substring(0, i);
                String next = str.substring(i, i + i);

                if (pre.equals(next)) {
                    System.out.printf("#%d %d\n", test_case, pre.length());
                    break;
                }

                if (i == 1) { // 마디가 한 개인 경우 예외처리
                    pre = str.substring(0, 1);
                    next = str.substring(1, 2);
                    if (pre.equals(next)) {
                        System.out.printf("#%d %d\n", test_case, 1);
                        break;
                    }
                }
            }
        }
        br.close();
    }
}
