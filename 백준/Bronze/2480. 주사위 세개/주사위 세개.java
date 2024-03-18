import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 만약 모든 변수가 다른 경우
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            int max;
            // 만약 num1 > num2 라면
            if (num1 > num2) {
                // num3 > num1 > num2 라면
                if (num3 > num1) {
                    max = num3;
                } 
                // num1 > (num2, num3)
                else {
                    max = num1;
                }
            }
            // num2 > num1 라면	
            else {
                // num3 > num2 > num1 라면
                if (num3 > num2) {
                    max = num3;
                }
                // num2 > (num1, num3)
                else {
                    max = num2;
                }
            }
            System.out.println(max * 100);
        } else {
            // 3개의 변수가 모두 같은 경우
            if (num1 == num2 && num1 == num3) {
                System.out.println(10000 + num1 * 1000);
            }
            else {
                // num1가 num2혹은 num3 같은 경우
                if(num1 == num2 || num1 == num3) {
                    System.out.println(1000 + num1 * 100);
                }
                // num2가 num3 같은 경우
                else {
                    System.out.println(1000 + num2 * 100);
                }
            }
        }
        scanner.close();
    }
}


