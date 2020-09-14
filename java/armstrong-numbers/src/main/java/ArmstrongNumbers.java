public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        // TODO: Probably a better way to get this value
        int power = Integer.toString(numberToCheck).length();
        long sum = 0;

        while (numberToCheck > 0) {

            sum += Math.pow(numberToCheck % 10, power);
            numberToCheck /= 10;
        }

        return numberToCheck == sum;
    }
}
