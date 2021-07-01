export const isArmstrongNumber = numberToCheck => {

  const power = numberToCheck.toString().length;
  let currentValue = numberToCheck;
  let sum = 0;

  while (currentValue > 0) {

    sum += Math.pow(currentValue % 10, power);
    currentValue = Math.trunc(currentValue / 10);
  }

  return numberToCheck === sum;
};
