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
            for (int j = s.length(); j < 15; j++) {
                arr[i][j] = ' ';
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == ' ')
                    continue;
                sb.append(arr[i][j]);
            }
        }
        System.out.println(sb);
    }
}