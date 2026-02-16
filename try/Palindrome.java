import java.util.*;

class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return original == rev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
