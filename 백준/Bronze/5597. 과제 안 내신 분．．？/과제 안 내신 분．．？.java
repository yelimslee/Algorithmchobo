import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = 28;
        int[] student = new int[31];  // 0부터 30까지 31개의 배열 생성

        for(int i=0; i<studentNum; i++) {
            int x = scanner.nextInt();
            student[x] = 1;
        }

        for(int i=1; i<student.length; i++) {
            if(student[i] != 1) {
                System.out.println(i + " ");
            }
        }
    }
}
