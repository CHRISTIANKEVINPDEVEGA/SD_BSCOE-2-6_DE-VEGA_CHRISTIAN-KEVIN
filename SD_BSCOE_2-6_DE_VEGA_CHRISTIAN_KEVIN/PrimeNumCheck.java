import java.lang.Math;

public class PrimeNumCheck {
        public static void main(String[]
        args ){
        int num = 29; // this is the number to test
        boolean isPrime = true;
        
        if(num < 2){
            isPrime = false;
        };

        for(int iter=2; iter <= Math.sqrt(num); iter++){
            if(num%iter == 0){
                isPrime = false;
            };
        };
        
        if(isPrime) {
            System.out.println(num + " is a prime number.");
            } else {
            System.out.println(num + " is not a prime number.");
            }
    }
}
