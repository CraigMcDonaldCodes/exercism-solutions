const closingChar = new Map([
  ["]", "["],
  ["}", "{"],
  [")", "("],
]);

// Will have already checked length > 0 before calling
const peek = (stack) => stack[stack.length - 1];

const isStackEmpty = stack => stack.length == 0;

export const isPaired = (text) => {

  let stack = [];

  for (const c of text) {

    switch (c) {
      case "[":
      case "{":
      case "(":
        stack.push(c);
        break;
      case "]":
      case "}":
      case ")":
        if (stack.length > 0 && peek(stack) == closingChar.get(c)) {
          stack.pop();
        } else {
          return false;
        }
        break;
    }
  }

  return isStackEmpty(stack);
};
