import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
    }
}
