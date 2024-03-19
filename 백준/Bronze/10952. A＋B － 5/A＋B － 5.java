import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        // boolean result = true;
        
        while(true) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if(num1==0 && num2==0)
                break;

            if(num1<0 || num2<0 || num1>=10 || num2>=10)
                continue;

            System.out.println(num1 + num2);

            /* 
            System.out.println(num1 + num2);
            if((num1==0) && (num2==0) || (num1<0) || (num2<0) || (num1>=10) || (num2>=10))
                result = false;
                */
        }
        scanner.close();
    }
}