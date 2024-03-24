import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0; // 최대값
        int row = 1; // 1행
        int colum = 1; // 1열

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int num = Integer.parseInt(st.nextToken()); // integer타입으로 변환

                if (num > max) {
                    max = num;
                    row = i;
                    colum = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d\n", row, colum);

    }
}