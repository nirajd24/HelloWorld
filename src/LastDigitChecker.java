public class LastDigitChecker {

    public static void main(String[] args){
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int param1, int param2, int param3){
        boolean value = true;

        //if((param1 < 10 || param1 > 1000) || (param2 < 10 || param2 > 1000)  || (param3 < 10 || param3 > 1000)) return false;

        if(!isValid(param1)) return false;
        if(!isValid(param2)) return false;
        if(!isValid(param3)) return false;

        while(value){
            int lastDigit = param1 % 10;

            while(value){
                int inLastDigit = param2 % 10;

                while(value) {
                    int innerLastDigit = param3 % 10;

                    if (lastDigit == inLastDigit) return true;
                    if (lastDigit == innerLastDigit) return true;
                    if (inLastDigit == innerLastDigit) return true;

                    value = false;
                }
            }
        }

        return value;
    }

    public static boolean isValid(int number){

        if(number < 10) return false;
        if(number > 1000) return false;

        return true;
    }
}
