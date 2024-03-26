import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            StringTokenizer s = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(s.nextToken());
            int M = Integer.parseInt(s.nextToken());
            int[][] arr = new int[N][N]; 

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    int cnt = 0;
                    for (int x = i; x < i+M; x++) {  // 0부터가 아니라 i부터 시작함에 주의
                        for (int y = j; y < j+M; y++) {
                            cnt += arr[x][y];
                        }
                    }
                    if (max < cnt) {
                        max = cnt;
                    }
                }
            }
            System.out.printf("#%d %d\n", test_case, max);
        }

    }
}