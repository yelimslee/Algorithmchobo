import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            StringBuilder result = new StringBuilder(); // 문자열+문자열 = 비효율적
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < n; k++) {
                    result.append(s.charAt(j));
                }
            }
            System.out.println(result);
        }
    }
}