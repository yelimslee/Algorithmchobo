import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int mid = N/2;
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[mid]);
	}
}