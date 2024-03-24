import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < Math.min(s.length(), 15); j++) {
                arr[i][j] = s.charAt(j);
            }
            // 문자가 들어가지 않는 배열은 빈칸으로 저장
            for (int j = s.length(); j < 15; j++) {
                arr[i][j] = ' ';
            }
        }

        // 긴 문자열을 더할 때 StringBuilder을 사용하는 것이 좋음
        // 새로운 객체를 생성하는 것이 아니기 때문에 속도도 빠르며 상대적으로 부화가 적음
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == ' ')  // 배열의 값이 빈칸이면 건너뜀
                    continue;
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }
}