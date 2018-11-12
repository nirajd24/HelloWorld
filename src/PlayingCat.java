public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    private static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && ((temperature <= 45) && (temperature >= 25))){
            return true;
        } else if(!summer && ((temperature >= 25) && (temperature <= 35))){
            return true;
        } else {
            return false;
        }
    }
}
