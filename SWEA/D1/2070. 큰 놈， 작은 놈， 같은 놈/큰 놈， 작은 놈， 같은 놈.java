import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println("#" + (i+1) + " " +isBig(x, y));
        }
    }

    public static String isBig(int x, int y) {
        if(x>y) {
            return ">";
        } else if(x==y) {
            return "=";
        } else{
            return "<";
        }
    }
}