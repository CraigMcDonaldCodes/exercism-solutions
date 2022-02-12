/// <reference path="./global.d.ts" />
// @ts-check

'use strict';

/**
 * @param {number} [timeLeft]
 */
function cookingStatus(timeLeft) {

    switch (timeLeft) {
        case undefined:
            return "You forgot to set the timer."
        case 0:
            return "Lasagna is done."
        default:
            return "Not done, please wait.";
    }
}

/**
 * @param {string[]} layers
 * @param {number} prepTime
 */
function preparationTime(layers, prepTime = 2) {

    // do JS devs test for undefined and null?
    return layers.length * prepTime;
}

/**
 * 
 * @param {string[]} layers 
 */
function quantities(layers) {

    let result = {
        noodles: 0,
        sauce: 0,
    };

    layers.forEach(layer => {

        if (layer === 'noodles') {
            result.noodles += 50;
        } else if (layer === 'sauce') {
            result.sauce += 0.2;
        }
    });

    return result;
}

/**
 * @param {string[]} friendsList
 * @param {string[]} myList
 */
function addSecretIngredient(friendsList, myList) {

    // assuming there is at least one item in `friendsList`
    myList.push(friendsList.at(-1));
}

/**
 * @param {object} recipe
 * @param {number} scale
 */
function scaleRecipe(recipe, scale) {

    // we don't need a deep copy
    let newRecipe = {...recipe};

    // determine single value and multiply by scale for each object property
    // assuming the object passed in is correct
    for (const key in newRecipe) {
        newRecipe[key] = (newRecipe[key] / 2) * scale;
    }

    return newRecipe;
}

export {cookingStatus, preparationTime, quantities, scaleRecipe, addSecretIngredient}