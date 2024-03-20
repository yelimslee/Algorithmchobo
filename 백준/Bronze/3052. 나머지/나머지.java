import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();

        for(int i=0; i<10; i++) {
            h.add(scanner.nextInt() % 42);
        }

        scanner.close();
        System.out.print(h.size());
    }
}
