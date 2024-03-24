// 복습

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        br.close();

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) { // 몫이 0보다 클 경우 (더이상 B진법으로 바꿀 수 없는 경우)
            if (N % B < 10) {
                list.add((char) (N % B + '0')); // charcter타입으로 변환후 추가
            } else { // 몫이 0일 경우
                list.add((char) (N % B - 10 + 'A')); // 'A'는 10부터 시작하므로 -10
            }
            N /= B;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}