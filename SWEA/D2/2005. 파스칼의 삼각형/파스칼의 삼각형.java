import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N + 1][N + 1];

            arr[1][1] = 1;
            for (int i = 2; i < N + 1; i++) {
                for (int j = 1; j < N + 1; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }

            System.out.println("#" + test_case);
            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < N + 1; j++) {
                    if (arr[i][j] != 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}