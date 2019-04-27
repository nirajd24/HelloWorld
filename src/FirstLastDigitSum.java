public class FirstLastDigitSum {

    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(-257));
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = -1;
        int lastDigit = 0;

        if(number < 0) return -1;

        while(number >= 0){
            lastDigit = number % 10;//2

            if(sum < 0) sum = lastDigit;
            number = number / 10;//25

            if(number == 0) {
                sum = sum + lastDigit;
                number = -1;
            }
        }

        return sum;
    }
}
