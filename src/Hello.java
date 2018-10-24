public class Hello {

    public static void main(String[] args){
        System.out.println("********************Hello World!********************");
        challenge1();
        challenge2();
        challenge3();
        practice1();

        displayHighScorePosition("Niraj", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000) return 1;
        else if((score > 500) && (score < 1000)) return 2;
        else if((score > 100) && (score < 500)) return 3;
        else return 4;
    }

    public static void practice1(){
        int myInt = 50;
        System.out.println(myInt);
        myInt++;
        System.out.println(myInt);
        myInt--;
        System.out.println(myInt);
    }

    public static void challenge3(){
        System.out.println("********************Challenge3********************");

        char copyrightChar = '\u00A9';
        char rupeeIndian = '\u20B9';
        char registeredChar = '\u00AE';
        System.out.println("Unicode output was: " + copyrightChar + rupeeIndian + registeredChar);
    }

    public static void challenge2(){
        System.out.println("********************Challenge2********************");

        int numOfPounds = 207;
        double poundToKilogramMultiplier = 0.453_592_37d;
        double numOfKilograms = numOfPounds * poundToKilogramMultiplier;
        System.out.println(numOfKilograms);
    }

    public static void challenge1(){
        System.out.println("********************Challenge1********************");

        byte myByte = 127;
        short myShort = 32_276;
        int myInt = 34_32_276;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        System.out.println(myLong);
    }
}
