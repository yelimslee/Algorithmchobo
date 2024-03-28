import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr1 = new int[N][N];

            for (int i = 0; i < N; i++) { // arr1배열에 채워넣음
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr1[i][j] = Integer.parseInt(st.nextToken());

                }
            }

            int[][] arr2 = new int[N][N];
            // 90도 회전
            for (int j = 0; j < N; j++) {
                for (int i = 0; i < N; i++) {
                    arr2[j][i] = arr1[N - i - 1][j];
                }
            }

            int[][] arr3 = new int[N][N];
            // 180도 회전
            for (int j = 0; j < N; j++) {
                for (int i = 0; i < N; i++) {
                    arr3[j][i] = arr2[N - i - 1][j];
                }
            }

            int[][] arr4 = new int[N][N];
            // 270도 회전
            for (int j = 0; j < N; j++) {
                for (int i = 0; i < N; i++) {
                    arr4[j][i] = arr3[N - i - 1][j];
                }
            }

            System.out.println("#" + test_case);

            // 결과 출력
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    System.out.print(arr2[j][k]);
                }
                System.out.print(" ");

                for (int k = 0; k < arr3.length; k++) {
                    System.out.print(arr3[j][k]);
                }
                System.out.print(" ");

                for (int k = 0; k < arr4.length; k++) {
                    System.out.print(arr4[j][k]);
                }
                System.out.println();
            }
        }
    }
}