import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 바구니 N개
        int M = scanner.nextInt();  // M번 돌기
        int[] ball = new int[N+1];  // 6칸의 ball 배열 생성
        int i, j;

        for(int x=1; x<N+1; x++) {
            ball[x] = x;  // x번 칸에 x를 할당
        }

        for(int y=0; y<M; y++) {  // M번 돌기
            i = scanner.nextInt();
            j = scanner.nextInt();

            int tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        
        for(int g=0; g<N; g++) {
            System.out.print(ball[g+1] + " ");
        }

        scanner.close();
    }
}
