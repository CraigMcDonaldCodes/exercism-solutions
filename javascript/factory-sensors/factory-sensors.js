// @ts-check

const HUMIDITY_MAX = 70;
const TEMP_MAX = 500;
const TEMP_SHUTDOWN = 600;

export class ArgumentError extends Error {}

export class OverheatingError extends Error {

  constructor(temperature) {
    super(`The temperature is ${temperature} ! Overheating !`);
    this.temperature = temperature;
  }
}

/**
 * Check if the humidity level is not too high.
 *
 * @param {number} humidityPercentage
 * @throws {Error}
 */
export function checkHumidityLevel(humidityPercentage) {

  if (humidityPercentage > HUMIDITY_MAX) {
    throw new Error();
  } else {
    return;
  }
}

/**
 * Check if the temperature is not too high.
 *
 * @param {number|null} temperature
 * @throws {ArgumentError|OverheatingError}
 */
export function reportOverheating(temperature) {

  if (temperature === null) {
    throw new ArgumentError();
  } else if (temperature > TEMP_MAX) {
    throw new OverheatingError(temperature);
  } else {
    return;
  }
}

/**
 *  Triggers the needed action depending on the result of the machine check.
 *
 * @param {{
 * check: function,
 * alertDeadSensor: function,
 * alertOverheating: function,
 * shutdown: function
 * }} actions
 * @throws {ArgumentError|OverheatingError|Error}
 */
export function monitorTheMachine(actions) {

  try {
    actions.check();
  } catch (err) {

    if (err instanceof ArgumentError) {
      actions.alertDeadSensor();
    } else if (err instanceof OverheatingError) {

      if (err.temperature < TEMP_SHUTDOWN) {
        actions.alertOverheating();
      } else {
        actions.shutdown();
      }
    } else {
      throw err;
    }
  }
}
