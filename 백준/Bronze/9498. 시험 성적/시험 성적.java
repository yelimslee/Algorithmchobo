import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score  = scanner.nextInt();
        char rank;
        
        if((90<=score) && (score<=100)) {
            rank = 'A';
        } else if((80<=score) && (score<=89)) {
            rank = 'B';
        } else if((70<=score) && (score<=79)) {
            rank = 'C';
        } else if((60<=score) && (score<=69)) {
            rank = 'D';
        } else {
            rank = 'F';
        }

        System.out.println(rank);
        scanner.close();
    }
}