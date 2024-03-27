import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            int N = Integer.parseInt(br.readLine());

            int a, b, c, d, e, f, g, h;
            a = N / 50000;
            N = N % 50000;

            b = N / 10000;
            N = N % 10000;

            c = N / 5000;
            N = N % 5000;

            d = N / 1000;
            N = N % 1000;

            e = N / 500;
            N = N % 500;

            f = N / 100;
            N = N % 100;

            g = N / 50;
            N = N % 50;

            h = N / 10;
            N = N % 10;

            System.out.printf("#%d\n", test_case);
            System.out.printf("%d %d %d %d %d %d %d %d\n", a, b, c, d, e, f, g, h);
        }
    }
}