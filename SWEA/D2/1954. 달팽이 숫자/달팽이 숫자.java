import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int[][] check = new int[11][11]; // 지나간 곳인지 체크
    static int[][] ans = new int[11][11]; // count 찍는 곳
    static int[] di = { -1, 0, 1, 0 }; // 행 전환
    static int[] dj = { 0, 1, 0, -1 }; // 열 전환
    static int count = 1; // 1부터 시작
    static int dr = 0; // 방향 바꾸는
    static int N;

    static void go(int nowI, int nowJ) {
        check[nowI][nowJ] = 1;
        ans[nowI][nowJ] = count++;
        int ni = nowI + di[dr];
        int nj = nowJ + dj[dr];

        // 더이상 갈 수 없는 길이면 방향 바꿔줌
        if (ni < 0 || ni >= N || nj < 0 || nj >= N || check[ni][nj] == 1) {
            dr = (dr + 1) % 4;
            ni = nowI + di[dr];
            nj = nowJ + dj[dr];
        }
        // 갈 수 있는 경우
        if (0 <= ni && ni < N && 0 <= nj && nj < N && check[ni][nj] == 0)
            go(ni, nj);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine());

            go(0, 0); // 시작 위치 (0, 0)

            System.out.println("#" + test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }

            count = 1; // 다시 초기화 해줘야 함. (다음 테스트 코드)
            dr = 0; // 동일
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    check[i][j] = 0; // 동일
                }
            }
        }
    }
}
