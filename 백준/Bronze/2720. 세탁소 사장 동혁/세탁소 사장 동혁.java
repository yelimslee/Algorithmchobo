import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        final int Q = 25;
        final int D = 10;
        final int N = 5;
        final int P = 1;
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());

            while (num > 0) {
                q = num / Q;
                num %= Q;

                d = num / D;
                num %= D;

                n = num / N;
                num %= N;

                p = num / P;
                num %= P;
            }
            System.out.printf("%d %d %d %d\n", q, d, n, p);
        }
    }
}