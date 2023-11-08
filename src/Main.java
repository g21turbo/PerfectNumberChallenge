public class Main {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(8128));
        System.out.println(isPerfectNumber(7));
        System.out.println(isPerfectNumber(23));

    }

    public static boolean isPerfectNumber(int number) {

        // input validation
        if (number < 1) {
            return false;
        }

        // initialize variables
        int perfectFinder = 0;
        int perfectSum = 0;

        // loop that continues while perfectFinder is less than number
        while (perfectFinder < number) {

            // increment perfectFinder by 1
            perfectFinder++;

            // if there is no remainder when dividing number by perfectFinder
            if (number % perfectFinder == 0){

                // perfectSum will add each divisor
                perfectSum += perfectFinder;

                // if perfectSum is equal to the original number than it is a perfect number
                if (perfectSum == number){
                    return true;
                }
            }
        }
        // if it not a perfect number, return false
        return false;
    }

    // ----------------- Instructor's Code----------------------
//    public static boolean isPerfectNumber(int number) {
//
//        if (number < 1) {
//            return false;
//        }
//
//        int sum = 0;
//        for (int i = 1; i < number; i++) {
//            if (number % i == 0) {
//                sum += i;
//            }
//        }
//        return sum == number;
//    }
}


