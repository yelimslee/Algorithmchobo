import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++) {
            int sum = 0;
            for(int j=0; j<10; j++) {
                int num = scanner.nextInt();
                if(num%2 != 0)
                    sum += num;
            }
            System.out.println("#" + (i+1) + " " + sum);
		}
	}
}