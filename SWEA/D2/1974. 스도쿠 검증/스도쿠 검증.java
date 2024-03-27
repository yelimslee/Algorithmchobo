import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    static int[][] arr;
    static boolean[] isUsed;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T + 1; test_case++) {
            arr = new int[9][9];

            // 2차원 배열 생성 후 숫자 입력
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("#" + test_case + " ").append(solving()).append("\n");
        }
        System.out.println(sb);
    }

    public static int solving() {  // 수평, 수직, 네모에 겹치는 숫자가 없는지 체크
        // 수평
        for(int i=0; i<9; i++) {
            isUsed = new boolean[10];  // 배열에 저장된 숫자가 사용되었는지 여부를 저장하는 배열.

            for(int j=0; j<9; j++) {
                if(isUsed[arr[i][j]]) {  // 겹치는 숫자가 있으면 0 반환
                    return 0;
                }
                isUsed[arr[i][j]] = true;  // 겹치는 숫자가 없으면 현재 숫자를 사용한 것으로 저장
            }
        }

        // 수직
        for(int i=0; i<9; i++) {
            isUsed = new boolean[10];

            for(int j=0; j<9; j++) {
                if(isUsed[arr[j][i]]) {
                    return 0;
                }
                isUsed[arr[j][i]] = true;
            }
        }

        // 네모
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                isUsed = new boolean[10];
                for(int r = 0; r<3; r++) {
                    for(int c = 0; c<3; c++) {
                        if(isUsed[arr[i*3+r][j*3+c]]) {  // 인덱스 0,3,6 이 첫칸인 행/열을 탐색
                            return 0;
                        }
                        isUsed[arr[i*3+r][j*3+c]] = true;
                    }
                }
            }
        }
        return 1;  // 겹치는 숫자가 없다면 1 반환
    }
}