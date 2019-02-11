public class ForDemo {
    public static void main(String[] args) {
        System.out.println(isPrime(8956));
    }

    private static boolean isPrime(int n){
        if(n<1){
            return false;
        }

        for(int i=2; i<=(n/2); i++){
            System.out.println("Looping in " + i);
            if((n%i)==0){
                return false;
            }
        }

        return true;
    }
}
