// @ts-check

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {

  let sum = 0;
  birdsPerDay.forEach(day => sum += day);

  return sum;
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
export function birdsInWeek(birdsPerDay, week) {

  let pos = (week - 1) * 7;
  let end = pos + 7;
  let sum = 0;

  while (pos < end) {
    sum += birdsPerDay[pos];
    pos++;
  }

  return sum;
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {number[]} corrected bird count data
 */
export function fixBirdCountLog(birdsPerDay) {

  for (let i = 0; i < birdsPerDay.length; i += 2) {
    birdsPerDay[i]++;
  }

  return birdsPerDay;
}
