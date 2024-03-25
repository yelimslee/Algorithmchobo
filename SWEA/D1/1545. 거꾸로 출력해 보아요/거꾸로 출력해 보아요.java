import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
