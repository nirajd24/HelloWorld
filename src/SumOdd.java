public class SumOdd {

    public static void main(String[] args){
        System.out.println(new SumOdd().sumOdd(1, 100));
        System.out.println(new SumOdd().sumOdd(-1, 100));
        System.out.println(new SumOdd().sumOdd(100, 100));
        System.out.println(new SumOdd().sumOdd(13, 13));
        System.out.println(new SumOdd().sumOdd(100, -100));
        System.out.println(new SumOdd().sumOdd(100, 1000));

    }

    public boolean isOdd(int number){
        if(number < 1) return false;

        if(number % 2 == 0) return false;
        else return true;
    }

    public int sumOdd(int start, int end){
        int sum=0;

        if(((start > 0) && (end >0)) && (end >= start)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}
