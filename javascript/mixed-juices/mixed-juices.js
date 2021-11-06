// @ts-check

const JUICING_TIMES = {
  'Pure Strawberry Joy': 0.5,
  'Energizer': 1.5,
  'Green Garden': 1.5,
  'Tropical Island': 3,
  'All or Nothing': 5,
  DEFAULT: 2.5,
};

const LIME_WEDGES = {
  small: 6,
  medium: 8,
  large: 10,
};

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {

  const time = JUICING_TIMES[name];

  if (time === undefined) {
    return JUICING_TIMES.DEFAULT;
  } else {
    return time;
  }
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {

  // There is probably a nicer way of doing this

  if (wedgesNeeded === 0 || limes.length === 0) {
    return 0;
  }

  let count = 0;

  while (limes.length) {

    let lime = limes.shift();
    wedgesNeeded -= LIME_WEDGES[lime];
    count++;

    if (wedgesNeeded <= 0) {
      break;
    }
  }

  return count;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */
export function remainingOrders(timeLeft, orders) {

  while (timeLeft > 0) {

    let order = orders.shift();
    let time = JUICING_TIMES[order] === undefined ? JUICING_TIMES.DEFAULT : JUICING_TIMES[order];

    timeLeft -= time;
  }

  return orders;
}
