import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; // 영문자의 개수는 26개임
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { // 현재 알파벳이 소문자인지 확인
                arr[s.charAt(i) - 97]++; // a는 97에 해당하므로 'a'를 0번째 인덱스에 매핑
            } else {
                arr[s.charAt(i) - 65]++; // 대문자일 경우, 'A'는 97에 해당하므로 'A'를 0번째 인덱스에 매핑
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) { // 각 알파벳의 등장 횟수를 확인
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }

}