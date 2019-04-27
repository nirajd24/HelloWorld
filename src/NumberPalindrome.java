public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int original = number;

        while(number > 0){
            lastDigit = number % 10;//1 2 2 1
            reverse = reverse * 10;//0 10 120 1220
            reverse = reverse + lastDigit;//1 12 122 1221
            number = number / 10;//122 12 1 0
        }

        if(original == reverse)
            return true;
        else
            return false;
    }
}
