'use strict';

export const square = (n) => {
  // throw new Error('Remove this statement and implement this function');

  if (n < 1 || n > 64) {
    throw new Error('square must be between 1 and 64');
  }

  return Math.pow(2, n - 1);
};

export const total = (n) => {
  // throw new Error('Remove this statement and implement this function');
  return Math.pow(2, 64) - 1;
};
