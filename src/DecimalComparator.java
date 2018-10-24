public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757));
        System.out.println(areEqualByThreeDecimalPlaces(0.0, 0.0));
    }
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        int valueInt1 = (int) (value1 * 1000);
        int valueInt2 = (int) (value2 * 1000);

        if(valueInt1 == valueInt2){
            return true;
        } else {
            return false;
        }
    }
}
