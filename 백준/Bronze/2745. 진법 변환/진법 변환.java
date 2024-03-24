// 복습

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken(); // B진법의 값인 N
        int B = Integer.parseInt(st.nextToken()); // 몇 진법인지
        br.close();

        int tmp = 1; // 자릿수를 판별하기 위한 변수
        int sum = 0; // 10진법으로 변환된 값을 저장할 변수

        // 10진법으로 구하기 전에 문자열 하나하나가 각 수를 의미하므로 문자열을 문자로 변환해주어야 함
        for (int i = N.length() - 1; i >= 0; i--) { // 맨 오른쪽부터 계산
            char ch = N.charAt(i);

            if ('A' <= ch && ch <= 'Z') {  // A~Z까지의 경우, 10부터 시작하기 때문에 'A' - 10을 더해줌
                sum += (ch - 'A' + 10) * tmp; // 10부터 A이기 때문에 +10
            } else {
                sum += (ch - '0') * tmp;  // 문자 '0'의 ASCII 값인 48을 빼주면 해당 숫자를 얻을 수 있음
            }
            tmp *= B; // 자릿수가 한 칸씩 왼쪽으로 간다는 것은 왼쪽으로 B곱하기 한 것과 같음
        }
        System.out.println(sum);
    }
}