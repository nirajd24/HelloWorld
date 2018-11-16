public class SwitchStatement {
    public static void main(String[] args) {
        char switchChar = 'A';

        switch(switchChar){
            case 'A':
                System.out.println("A is present.");
                break;
            case 'B':
                System.out.println("B is present.");
                break;
            case 'C':
                System.out.println("C is present.");
                break;
            case 'D':
                System.out.println("D is present.");
                break;
            case 'E':
                System.out.println("E is present.");
                break;
            default:
                System.out.println("Not found.");
                break;
        }

        //Another way. If certain about single type of value use switch. It is equivalent to if else
        switch(switchChar){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println(switchChar + " is present.");
                break;
            default:
                System.out.println("Not found.");
                break;
        }
    }
}
