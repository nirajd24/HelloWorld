public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(0);
        numberToWords(123);
        numberToWords(-12);
        numberToWords(5200);

        numberToWords(-121);
        numberToWords(1212);
        numberToWords(1234);
        numberToWords(100);

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-126);
        numberToWords(0000);
    }

    public static void numberToWords(int number) {
        if(number < 0) System.out.println("Invalid Value");
        else if(number == 0) System.out.println("Zero");
        else {
            int beforeReverseIntLength = getDigitCount(number);
            number = reverse(number);
            int afterReverseNumberLength = getDigitCount(number);

            int difference = beforeReverseIntLength - afterReverseNumberLength;
            int lastDigit = 0;
            String numberInWords = "";

            while(number != 0){
                lastDigit = number % 10;
                number = number / 10;

                switch (lastDigit){
                    case 0:
                        numberInWords = numberInWords + " " + "Zero";
                        break;
                    case 1:
                        numberInWords = numberInWords + " " + "One";
                        break;
                    case 2:
                        numberInWords = numberInWords + " " + "Two";
                        break;
                    case 3:
                        numberInWords = numberInWords + " " + "Three";
                        break;
                    case 4:
                        numberInWords = numberInWords + " " + "Four";
                        break;
                    case 5:
                        numberInWords = numberInWords + " " + "Five";
                        break;
                    case 6:
                        numberInWords = numberInWords + " " + "Six";
                        break;
                    case 7:
                        numberInWords = numberInWords + " " + "Seven";
                        break;
                    case 8:
                        numberInWords = numberInWords + " " + "Eight";
                        break;
                    case 9:
                        numberInWords = numberInWords + " " + "Nine";
                        break;
                    default:
                        numberInWords = numberInWords + " " + "";
                }
            }

            if(difference > 0){
                while(difference != 0) {
                    numberInWords = numberInWords + " " + "Zero";
                    difference--;
                }
            }

            System.out.println(numberInWords.trim());
        }
    }

    public static int reverse(int number) {
        String concat = "";
        while(number != 0) {
            int lastDigit = number % 10;
            number = number / 10;
            concat = concat + Integer.toString(lastDigit);
        }

        return Integer.parseInt(concat);
    }

    public static int getDigitCount(int number) {
        if(number < 0) return -1;
        return Integer.toString(number).length();
    }

    /**
     * public static void numberToWords(int number){
     *         int reminder;
     *         int reversNumber = 0;
     *         int countRevers = 0;
     *         int countNumber = 0;
     *         if(number < 0){
     *             System.out.println("Invalid Value");
     *         }else{
     *             reversNumber = reverse(number);
     *             if(reversNumber == 0){
     *                 System.out.println("Zero");
     *             }
     *             countNumber = getDigitCount(number);
     *             countRevers = getDigitCount(reversNumber);
     *             while(reversNumber != 0){
     *                 reminder = reversNumber % 10;
     *                 switch(reminder){
     *                     case 0:
     *                         System.out.println("Zero");
     *                         break;
     *                     case 1:
     *                         System.out.println("One");
     *                         break;
     *                     case 2:
     *                         System.out.println("Two");
     *                         break;
     *                     case 3:
     *                         System.out.println("Three");
     *                         break;
     *                     case 4:
     *                         System.out.println("Four");
     *                         break;
     *                     case 5:
     *                         System.out.println("Five");
     *                         break;
     *                     case 6:
     *                         System.out.println("Six");
     *                         break;
     *                     case 7:
     *                         System.out.println("Seven");
     *                         break;
     *                     case 8:
     *                         System.out.println("Eight");
     *                         break;
     *                     case 9:
     *                         System.out.println("Nine");
     *                         break;
     *                 }
     *                 reversNumber /= 10;
     *             }
     *             for(int i = 0; i != (countNumber - countRevers); i++ ){
     *                 System.out.println("Zero");
     *             }
     *
     *         }
     *     }
     *
     *     public static int reverse(int number){
     *         int reversNumber = 0, reminder = 0;
     *         while(number != 0){
     *             reminder = number % 10;
     *             reversNumber = reversNumber * 10 + reminder;
     *             number /= 10;
     *         }
     *         return reversNumber;
     *     }
     *
     *     public static int getDigitCount(int number){
     *         int count = 0;
     *         if(number > 0){
     *             while(number > 0){
     *                 number /= 10;
     *                 count ++;
     *             }
     *             return count;
     *         }else if(number == 0){
     *             return 1;
     *         }
     *         return -1;
     *     }
     */

}
