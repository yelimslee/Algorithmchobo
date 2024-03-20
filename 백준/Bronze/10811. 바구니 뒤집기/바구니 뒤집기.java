import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 5
        int M = scanner.nextInt(); // 4

        int[] arr = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            arr[i] = i;
        }

        for (int y = 0; y < M; y++) {  // 4번 반복하면서 수를 입력받음
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            for (int x = i; x < j + 1; x++) {
                int nn = j--;

                int tmp = arr[x];
                arr[x] = arr[nn];
                arr[nn] = tmp;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
