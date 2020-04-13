
export const isPangram = (text) => {

  let chars = new Set();
  text = text.toLowerCase();

  text.split('').forEach(t => {

    if (t >= 'a' && t <= 'z') {
      chars.add(t);
    }
  });

  return chars.size === 26;
};
