package Modulo1_2;

public class NumeroPrimo {

    public static void main(String[] args) {
        int number = 2;
        System.out.println(isPrime(number));
        number = 17;
        System.out.println(isPrime(number));
        number = 631;
        System.out.println(isPrime(number));
        number = 634;
        System.out.println(!isPrime(number));
        number = 999;
        System.out.println(!isPrime(number));
        number = 997;
        System.out.println(isPrime(number));
    }

    private static boolean isPrime(int number) {
        for (int i=2; i<number; i++) {
            //cerco un divisore, se lo trovo ritorno false
            if (number % i == 0)
                return false;
        }
        //se arrivo qui è primo
        System.out.println(true);
        return true;
    }

}