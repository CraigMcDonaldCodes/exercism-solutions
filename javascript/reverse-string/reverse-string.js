"use strict";

// Probably many better ways of doing this
export const reverseString = (str) => {
  
  let newStr = "";
  for (let i = 0 - 1; i < str.length; i++ ) { newStr = str.charAt(i) + newStr; }

  return newStr;
};
