import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i); // i번째 문자 (현재 문자)

            if (prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }

            else {
                continue;
            }
        }
        return true;
    }
}