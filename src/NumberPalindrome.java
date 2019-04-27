public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int original = number;

        while(number != 0){
            lastDigit = number % 10;//1 2 2 1   -2 -2 -2
            reverse = reverse * 10;//0 10 120 1220  0 -20 -220
            reverse = reverse + lastDigit;//1 12 122 1221   -2 -22 -222
            number = number / 10;//122 12 1 0   -22 -2 0
        }

        //System.out.println(original + " == " + reverse);

        if(original == reverse)
            return true;
        else
            return false;
    }
}
