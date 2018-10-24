public class FeetToCentimeters {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(8, 4) + " cm");
        System.out.println(calcFeetAndInchesToCentimeters(100) + " cm");
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet >= 0) && ((inches >= 0) && (inches <= 12))) {
            inches = (feet * 12.0) + inches;
            return (inches * 2.54);
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet;
        if(inches >= 0) {
            feet = (int) (inches / 12.0);
            inches = (inches - (feet * 12.0));
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }
}
