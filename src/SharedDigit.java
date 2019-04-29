public class SharedDigit {

    public static void main(String[] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(15, 67));
    }

    public static boolean hasSharedDigit(int param1, int param2){
        boolean value = true;

        if((param1 < 10 || param1 > 99) || (param2 < 10 || param2 > 99)) return false;

        while(value){
            int lastDigit = param1 % 10;
            int firstDigit = param1 / 10;

            while(value){
                int inLastDigit = param2 % 10;
                int inFirstDigit = param2 / 10;

                if((lastDigit == inLastDigit) || (lastDigit == inFirstDigit)) return true;
                if((firstDigit == inLastDigit) || (firstDigit == inFirstDigit)) return true;

                value = false;
            }
        }

        return value;
    }
}
