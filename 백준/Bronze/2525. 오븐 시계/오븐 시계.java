import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();  
        int M = scanner.nextInt();  
        int MM  = scanner.nextInt();

        M += MM;

        if(M >= 60) {
            H += M / 60;
            M %= 60;
        }

        if(H >= 24) {
            H %= 24;
        }
        
        System.out.println(H + " " + M);
        
        scanner.close();
    }
}


