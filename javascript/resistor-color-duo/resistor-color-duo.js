const COLORS = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"];

export const decodedValue = (values) => {

  // Assume at least two items
  return (COLORS.indexOf(values[0]) * 10) +
          COLORS.indexOf(values[1]);
};
