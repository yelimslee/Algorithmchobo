import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int X = N / 4;
        for(int i=0; i<X; i++) {
            System.out.print("long ");
        }
        System.out.println("int");

        scanner.close();
    }
}


