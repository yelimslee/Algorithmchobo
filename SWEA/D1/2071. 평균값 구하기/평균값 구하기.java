import java.util.Scanner;

class Solution
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++) {
            int sum = 0;
            for(int j=0; j<10; j++) {
                int num = scanner.nextInt();
                sum += num;
            }
            System.out.println("#" + (i+1) + " " + Math.round(sum/10.0));
        }
	}
}