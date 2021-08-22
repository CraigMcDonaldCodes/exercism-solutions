'use strict';

// We should probably just hardcode the upper values
// that require BigInt

const MIN_VALUE = 1;
const MAX_VALUE = 64;

export const square = (n) => {

  if (n < MIN_VALUE || n > MAX_VALUE) {
    throw new Error('square must be between 1 and 64');
  }

  if (n == MAX_VALUE) {
    return BigInt(2) ** BigInt(MAX_VALUE - 1);
  } else {
    return Math.pow(2, n - 1);
  }
};

export const total = () => {
  return BigInt(2) ** BigInt(MAX_VALUE) - BigInt(1);
};
