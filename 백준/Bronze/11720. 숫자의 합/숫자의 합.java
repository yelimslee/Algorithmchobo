import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // N은 필요 없음

        int sum = 0;
        for (byte value : br.readLine().getBytes()) {
            // getBytes() 는 문자열을 byte 배열로 반환
            sum += (value - '0');
            // 인코딩에 맞게 각 문자의 값을 저장하므로 반드스 '0' 또는 48을 빼주어야 함
        }

        System.out.print(sum);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += s.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}