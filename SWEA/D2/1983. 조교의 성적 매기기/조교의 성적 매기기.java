import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, K, mid_score, final_score, work_score;
        double[] scores;
        String[] grades = { "D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };

        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); // N명의 학생
            K = Integer.parseInt(st.nextToken()); // K번째 학생

            scores = new double[N]; // N크기의 배열 생성
            for (int i = 0; i < N; i++) {
                StringTokenizer s = new StringTokenizer(br.readLine(), " ");
                mid_score = Integer.parseInt(s.nextToken());
                final_score = Integer.parseInt(s.nextToken());
                work_score = Integer.parseInt(s.nextToken());
                scores[i] = 0.35 * mid_score + 0.45 * final_score + 0.2 * work_score;
            }

            String ans = "";
            double K_score = scores[K-1]; // K의 점수 저장
            Arrays.sort(scores); // 작은 수부터 오름차순 정렬

            for (int i = 0; i < N; i++) {
                if (K_score == scores[i]) { // K의 점수가 score배열의 몇번째에 있는지 확인
                    ans = grades[i / (N / 10)];
                    break;
                }
            }
            System.out.printf("#%d %s\n", test_case, ans);
        }
        br.close();
    }
}
