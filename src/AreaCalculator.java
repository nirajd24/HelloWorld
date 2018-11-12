public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    private static double area(double radius){
        if(radius < 0.0d){
            return -1.0d;
        }
        return 3.14159d * (radius * radius);
    }

    private static double area(double x, double y){
        if((x < 0.0d) || (y < 0.0d)){
            return -1.0d;
        }
        return x * y;
    }
}
