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

        if (number < 1) {
            return false;
        }

        int perfectFinder = 0;
        int perfectSum = 0;

        while (perfectFinder < number) {
            perfectFinder++;
            if (number % perfectFinder == 0){
                perfectSum += perfectFinder;
                if (perfectSum == number){
                    return true;
                }
            }
        }
        return false;
    }
}