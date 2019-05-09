public class GreatestCommonDivisor {

    public static void main(String[] args){
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int i = 1;
        int gcd = 1;

        while(gcd <= i){

            int fLastDigit = first % i;
            int sLastDigit = second % i;

            if((fLastDigit == 0) && (sLastDigit == 0)){
                gcd = i;
                i++;
            } else {
                break;
            }
        }

        return gcd;
    }
}
