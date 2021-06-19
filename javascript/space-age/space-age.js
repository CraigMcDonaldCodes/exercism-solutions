const planets = new Map([
    [ "earth",   31_557_600],
    [ "mercury", 0.2_408_467],
    [ "venus",   0.61_519_726],
    [ "mars",    1.8_808_158],
    [ "jupiter", 11.8_626_15],
    [ "saturn",  29.447_498],
    [ "uranus",  84.016_846],
    [ "neptune", 164.79_132],
]);

export const age = (planet, seconds) => {

  let answer = seconds / planets.get("earth");

  if (planet !== "earth" && planets.has(planet)) {
    answer /= planets.get(planet);
  }

  return +(answer.toFixed(2));
};
