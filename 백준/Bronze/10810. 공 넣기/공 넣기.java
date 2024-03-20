import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int i,j,k;
        int[] ball = new int[N+1];

        for(int z=0; z<M; z++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            k = scanner.nextInt();

            for(int x=i; x<j+1; x++) {
                ball[x] = k;
                // ball[j] = k;
            }
        }

        for(int z=0; z<N; z++) {
            System.out.print(ball[z+1] + " ");
        }

    }
}
