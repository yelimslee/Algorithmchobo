import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=1; i<N+1; i++) {
            for(int j=0; j<N-i; j++) {
                System.out.print(" ");
            }

            for(int z=0; z<i; z++) {
                System.out.print('*');
            }

            System.out.println();
        }
        scanner.close();
    }
}
