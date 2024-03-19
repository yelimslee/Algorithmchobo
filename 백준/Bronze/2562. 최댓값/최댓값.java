import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = 9;
        int[] arr = new int[T];

        for(int i=0; i<T; i++) {
           arr[i] = scanner.nextInt();   
        }

        int max = arr[0];
        int maxIndex = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}
