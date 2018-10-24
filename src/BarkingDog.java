public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, 4));
    }
    public static boolean bark(boolean barking, int hourOfDay){
        boolean barkingBool = false;

        if(!((hourOfDay < 0) || (hourOfDay > 23))){
            if(barking && ((hourOfDay < 8) || (hourOfDay > 22))){
                barkingBool = true;
            }
        }

        return barkingBool;
    }
}
