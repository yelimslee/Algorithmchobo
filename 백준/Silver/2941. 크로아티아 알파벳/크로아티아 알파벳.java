import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[100];

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'c' && i < s.length() - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                }
            }

            else if (ch == 'd' && i < s.length() - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;
                } else if (s.charAt(i + 1) == 'z' && i < s.length() - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }

            else if ((ch == 'l' || ch == 'n') && i < s.length() - 1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            }

            else if((ch == 's' || ch == 'z') && i<s.length()-1) {
                if(s.charAt(i+1) == '=') {
                    i++;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}