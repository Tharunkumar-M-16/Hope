package Days.Day7;

public class NoStr {
    public static void main(String[] args) {
        String str = "Hello Hi     How are you";
        int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))) {
                if (i == str.length() - 1 || str.charAt(i + 1) == ' ') {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
