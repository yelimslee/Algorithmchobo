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
            int N = Integer.parseInt(st.nextToken()); // N=3
            int M = Integer.parseInt(st.nextToken()); // M=5

            int[] arr1 = new int[N];
            StringTokenizer s = new StringTokenizer(br.readLine(), " ");

            // arr1 배열에 숫자들 집어넣음
            for (int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(s.nextToken());
            }

            int[] arr2 = new int[M];
            StringTokenizer s2 = new StringTokenizer(br.readLine(), " ");

            // arr2 배열에 숫자 집어넣음
            for (int i = 0; i < M; i++) {
                arr2[i] = Integer.parseInt(s2.nextToken());
            }

            int max = 0;
            // arr1의 크기가 arr2의 크기보다 큰 경우
            if (N > M) {
                int[] arrtotal1 = new int[N - M + 1];
                for (int i = 0; i < N - M + 1; i++) {
                    for (int j = 0; j < M; j++) {
                        arrtotal1[i] += (arr1[i + j] * arr2[j]);
                    }
                }
                for (int i = 0; i < arrtotal1.length; i++) {
                    if (arrtotal1[i] > max) {
                        max = arrtotal1[i];
                    }
                }
                System.out.printf("#%d %d\n", test_case, max);

            }
            // arr2의 크기가 arr1의 크기보다 큰 경우
            else if (N < M) {
                int[] arrtotal2 = new int[M - N + 1];
                for (int i = 0; i < M - N + 1; i++) {
                    for (int j = 0; j < N; j++) {
                        arrtotal2[i] += (arr1[j] * arr2[i + j]);
                    }
                }
                for (int i = 0; i < arrtotal2.length; i++) {
                    if (arrtotal2[i] > max) {
                        max = arrtotal2[i];
                    }
                }
                System.out.printf("#%d %d\n", test_case, max);

            }
        }
    }
}