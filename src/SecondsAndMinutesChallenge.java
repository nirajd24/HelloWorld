public class SecondsAndMinutesChallenge {
    public static void main(String[] args){
        System.out.println(getDurationString(10203));
    }

    private static String getDurationString(long minutes, long seconds){
        if(!((minutes >= 0) && ((seconds >= 0) && (seconds <= 59)))){
            return "Invalid Value";
        }

        long hours = minutes / 60;
        minutes = minutes % 60;

        String returnString;

        if((hours / 10) == 0){
            returnString = "0" + hours + "h ";
        } else {
            returnString = hours + "h ";
        }

        if((minutes / 10) == 0){
            returnString = returnString + "0" + minutes + "m ";
        } else {
            returnString = returnString + minutes + "m ";
        }

        if((seconds / 10) == 0){
            returnString = returnString + "0" + seconds + "s";
        } else {
            returnString = returnString + seconds + "s";
        }

        return returnString;
    }

    private static String getDurationString(long seconds){
        if(!(seconds >= 0)){
            return "Invalid Value";
        }

        long minutes = (seconds / 60);
        seconds = (seconds % 60);

        return getDurationString(minutes, seconds);
    }
}