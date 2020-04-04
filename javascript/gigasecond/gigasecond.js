'use strict';

export const gigasecond = (date) => {

  let newDate = new Date(date);
  newDate.setUTCSeconds(newDate.getUTCSeconds() + Math.pow(10, 9));
  return newDate;
};
