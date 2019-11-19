public class ToBinary {

    public static void main (String[] args) {
        System.out.println("4: " + toBinary(4));
        System.out.println("42: " + toBinary(42));
        System.out.println("1023: " + toBinary(1023));
    }

    public static String toBinary(int n) {
        String answer = "";
        while (n > 0) {
            int rem = n%2;
            n = n/2;
            answer = rem + answer;
        }
        return answer;
    }

}
