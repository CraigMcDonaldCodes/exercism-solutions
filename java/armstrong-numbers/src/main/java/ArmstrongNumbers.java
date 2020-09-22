public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        // TODO: Probably a better way to get this value
        int power = Integer.toString(numberToCheck).length();
        int currentValue = numberToCheck;
        long sum = 0;

        while (currentValue > 0) {

            sum += Math.pow(currentValue % 10, power);
            currentValue /= 10;
        }

        return numberToCheck == sum;
    }
}
