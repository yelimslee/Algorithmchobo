import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int N, X;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        // 새로운 입력 줄을 받기 위해 StringTokenizer를 다시 초기화
        st = new StringTokenizer(br.readLine());  

        int[] array = new int[N];
        for(int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<array.length; i++) {
            if(array[i] < X) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
