"use strict";

export class BankAccount {

  constructor() {
    this.isOpen = false;
    this.currentBalance = 0;
  }

  open() {

    if (this.isOpen) {
      throw new ValueError();
    } else {
      this.isOpen = true;
    }
  }

  close() {

    if (this.isOpen) {
      this.isOpen = false;
      this.currentBalance = 0;
    } else {
      throw new ValueError();
    }
  }

  deposit(amount) {

    if (!this.isOpen || amount < 0) {
      throw new ValueError();
    }

    this.currentBalance += amount;
  }

  withdraw(amount) {

    if (!this.isOpen || this.currentBalance == 0 || amount > this.currentBalance || amount < 0 ) {
      throw new ValueError();
    }

    this.currentBalance -= amount;
  }

  get balance() {

    if (!this.isOpen) {
      throw new ValueError();
    }

    return this.currentBalance;
  }
}

export class ValueError extends Error {
  constructor() {
    super('Bank account error');
  }
}
