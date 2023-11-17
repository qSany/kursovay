public class Palindrome {
    public static void main(String[] args) {
        String input = "Итог:" ;

        if(isPalindrome(input)) {
            System.out.println(input + " полиндром.");
        } else {
            System.out.println(input + " не полиндром");
        }
    }

    public static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        return sb.toString().equals(input);


    }
}