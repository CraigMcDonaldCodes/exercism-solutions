"use strict";

export class HighScores {

  constructor(scores) {
    this._scores = scores;
  }

  get scores() {
    return this._scores;
  }

  get latest() {
    return this._scores[this._scores.length - 1];
  }

  get personalBest() {
    return Math.max(this._scores);
  }

  get personalTopThree() {
    throw new Error("Remove this statement and implement this function");
  }
}
