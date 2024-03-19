import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int score = 0;

        int[] array = new int[T];  // 배열 생성
        for(int i=0; i<T; i++) {
            array[i] = scanner.nextInt();  // 모두 배열 안에 넣음
        }

        int v = scanner.nextInt();

        for(int i=0; i<array.length; i++) {
            if(v==array[i]) {
                score += 1;
            }
        }

        System.out.println(score);
    }
}
