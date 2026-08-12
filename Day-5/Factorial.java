public class Factorial {
    static int factorialNo(int n){
        if( n == 0 || n == 1){
            return 1;

        }
        return n*factorialNo(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialNo(4));
    }
}
