import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = br.readLine();
        int count = 0;

        for (int i = 0; i < alpha.length(); i++) {
            
            // 불규칙적일 땐 if-else문 보단 switch-case문을 쓰는 것이 효율적
            switch (alpha.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    break;

                case 'D':
                case 'E':
                case 'F':
                    count += 4;
                    break;

                case 'G':
                case 'H':
                case 'I':
                    count += 5;
                    break;

                case 'J':
                case 'K':
                case 'L':
                    count += 6;
                    break;

                case 'M':
                case 'N':
                case 'O':
                    count += 7;
                    break;

                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count += 8;
                    break;

                case 'T':
                case 'U':
                case 'V':
                    count += 9;
                    break;

                case 'X':
                case 'Y':
                case 'Z':
                case 'W':
                    count += 10;
                    break;

            }
        }
        System.out.println(count);
    }
}