// @ts-check

/**
 * Respond with the correct character, given the line of the
 * poem, if this were said at the front door.
 *
 * @param {string} line
 * @returns {string}
 */
export function frontDoorResponse(line) {

  if (line.length === 0) {
    return "";
  } else {
    return line[0];
  }
}

/**
 * Format the password for the front-door, given the response
 * letters.
 *
 * @param {string} word the letters you responded with before
 * @returns {string} the front door password
 */
export function frontDoorPassword(word) {
  return capitalize(word);
}

/**
 * Respond with the correct character, given the line of the
 * poem, if this were said at the back door.
 *
 * @param {string} line
 * @returns {string}
 */
export function backDoorResponse(line) {

  let trimLine = line.trim();

  if (trimLine.length === 0) {
    return "";
  } else {
    return trimLine[trimLine.length - 1];
  }
}

/**
 * Format the password for the back door, given the response
 * letters.
 *
 * @param {string} word the letters you responded with before
 * @returns {string} the back door password
 */
export function backDoorPassword(word) {
  return capitalize(word) + ", please";
}


/**
 * Basic function to capitalize a word.
 * 
 * @param {string} word 
 * @returns {string} The capitalized word
 */
function capitalize(word) {

  let newWord = "";

  if (word.length > 0) {
    newWord += word[0].toUpperCase();
  }

  if (word.length > 1) {
    newWord += word.substr(1).toLowerCase();
  }

  return newWord;
}