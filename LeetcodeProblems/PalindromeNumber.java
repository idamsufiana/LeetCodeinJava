public class PalindromeNumber {

    static boolean isPalindrome(int original) {

        int reverseNum = 0;
        int tempOriginal = original;

        while (tempOriginal > 0) {

        int lastDigit = tempOriginal % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            tempOriginal = tempOriginal / 10;
        }

        if (original == reverseNum) {
          return true;
        } else {
          return false;
  
        }
    }


    public static void main(String[] args) throws Exception {
        int number = 125;
        System.out.println(isPalindrome(number));
    }

    
}
