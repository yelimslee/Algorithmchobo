public class Main {
    public static void main(String[] args) throws Exception {

        // System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있음
        int a = System.in.read();
        System.out.println(a);
    }
}