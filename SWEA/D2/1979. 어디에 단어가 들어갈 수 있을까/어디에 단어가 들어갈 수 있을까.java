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
            int N = Integer.parseInt(st.nextToken()); // 배열(세로 가로) 크기
            int K = Integer.parseInt(st.nextToken()); // 단어의 길이
            int[][] arr = new int[N + 2][N + 2]; // 주변을 0으로 둘러싸는 2차원 배열 생성.

            for (int i = 1; i < N + 1; i++) { // 배열에 수 입력
                StringTokenizer s = new StringTokenizer(br.readLine(), " ");
                for (int j = 1; j < N + 1; j++) {
                    arr[i][j] = Integer.parseInt(s.nextToken());
                }
            }

            int count = 0; // 전체 갯수 초기화

            // 가로 확인
            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < N - K + 2; j++) {
                    boolean isPossible = true;
                    for (int k = 0; k < K; k++) {
                        if (arr[i][j + k] == 0) { // 단어를 넣을 수 없는 경우
                            isPossible = false;
                            break;
                        }
                    }
                    if (isPossible && arr[i][j - 1] == 0 && arr[i][j + K] == 0) {
                        count++;
                    }
                }
            }

            // 세로 확인
            for (int j = 1; j < N + 1; j++) {
                for (int i = 1; i < N - K + 2; i++) {
                    boolean isPossible = true;
                    for (int k = 0; k < K; k++) {
                        if (arr[i + k][j] == 0) { // 단어를 넣을 수 없는 경우
                            isPossible = false;
                            break;
                        }
                    }
                    if (isPossible && arr[i - 1][j] == 0 && arr[i + K][j] == 0) {
                        count++;
                    }
                }
            }

            System.out.printf("#%d %d\n", test_case, count);
        }
    }
}