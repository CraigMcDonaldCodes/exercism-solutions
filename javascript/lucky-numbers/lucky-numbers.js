// @ts-check

/**
 * Calculates the sum of the two input arrays.
 *
 * @param {number[]} array1
 * @param {number[]} array2
 * @returns {number} sum of the two arrays
 */
export function twoSum(array1, array2) {

  let sum1 = 0; 
  let sum2 = 0; 

  for (let i = 0; i < array1.length; i++) {
    sum1 *= 10;
    sum1 += array1[i];
  }

  for (let i = 0; i < array2.length; i++) {
    sum2 *= 10;
    sum2 += array2[i];
  }

  return sum1 + sum2;
}

/**
 * Checks whether a number is a palindrome.
 *
 * @param {number} value
 * @returns {boolean}  whether the number is a palindrome or not
 */
export function luckyNumber(value) {

  let tmp = value;
  let revValue = 0;

  while (tmp > 0) {
    revValue *= 10;
    revValue += (tmp % 10);
    tmp = Math.floor(tmp/10); // no int division by default
  }

  return value === revValue;
}

/**
 * Determines the error message that should be shown to the user
 * for the given input value.
 *
 * @param {string|null|undefined} input
 * @returns {string} error message
 */
export function errorMessage(input) {

  if (input === null || input === undefined || input.length === 0) {
    return "Required field";
  }

  let num = Number(input);
  if (Number.isNaN(num) || num === 0) {
    return "Must be a number besides 0";
  }

  return "";
}
