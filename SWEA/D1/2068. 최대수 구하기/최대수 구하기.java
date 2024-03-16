import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            int[] array = new int[10];  // 10 크기의 int 타입의 배열 생성
            for(int j=0; j<10; j++) {
                array[j] = scanner.nextInt();  // 배열의 값을 입력
            }
            int max = array[0];
            for(int j=1; j<10; j++) {
                if(array[j] > max) {
                    max = array[j];
                }
            }
            System.out.println("#" + (i+1) + " " + max);
        }
    }
}