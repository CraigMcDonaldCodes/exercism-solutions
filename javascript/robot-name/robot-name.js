'use strict';

export class Robot {

    constructor() {
        this.robotNames = new Set();
        this.name = this.getNextName();
    }

    random(min, max) {
        return Math.floor(Math.random() * (max - min)) + min;
    }

    generateName() {

        let newName = "";

        // Two uppercase chars
        newName += String.fromCharCode(this.random(1, 26) + 65);
        newName += String.fromCharCode(this.random(1, 26) + 65);

        // Three numbers
        newName += this.random(0, 10);
        newName += this.random(0, 10);
        newName += this.random(0, 10);

        return newName;
    }

    getNextName() {

        let nextName = this.generateName();

        while (this.robotNames.has(nextName)) {
            nextName = this.generateName();
        }

        this.robotNames.add(nextName);

        return nextName;
    }

    releaseNames() {
        this.robotNames.clear();
    }

    reset() {
        this.name = this.getNextName();
    }
}

/*
Robot.releaseNames = () => {
        robotNames.clear();
};
*/
