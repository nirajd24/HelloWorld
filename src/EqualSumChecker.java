public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
    public static boolean hasEqualSum(int value1, int value2, int value3){
        return (((value1 + value2) == value3) ? true : false);
    }
}
