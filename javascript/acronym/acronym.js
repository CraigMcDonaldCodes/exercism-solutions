'use strict';

export const parse = (phrase) => {

  let words = phrase.split(/ |-|_/);
  let acronym = [];
    
  words.forEach(w => acronym.push(w[0]));

  return acronym.join("").toUpperCase();
};
