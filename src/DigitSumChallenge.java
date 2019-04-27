public class DigitSumChallenge {

    public static void main(String[] args){
        System.out.println("Sum is "+sumDigits(125));
        System.out.println("Sum is "+sumDigits(-125));
        System.out.println("Sum is "+sumDigits(4));
        System.out.println("Sum is "+sumDigits(32123));
    }

    public static int sumDigits(int number){
        int sum=0;
        if (number >= 10 ){
            do {
                sum = sum + (number % 10);
                number = number / 10;
            } while(number > 0);
            return sum;
        } else {
            return -1;
        }
    }
}
