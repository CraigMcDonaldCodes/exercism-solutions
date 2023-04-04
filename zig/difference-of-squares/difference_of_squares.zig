// Not sure if I should be testing for overflow
// but all tests pass.

const std = @import("std");
const math = std.math;

pub fn squareOfSum(number: usize) usize {
    var sum: usize = 0;
    var i: usize = 1;

    while (i <= number) : (i += 1) {
        sum += i;
    }

    return math.pow(usize, sum, 2);
}

pub fn sumOfSquares(number: usize) usize {
    var sum: usize = 0;
    var i: usize = 1;

    while (i <= number) : (i += 1) {
        sum += math.pow(usize, i, 2);
    }

    return sum;
}

pub fn differenceOfSquares(number: usize) usize {
    return squareOfSum(number) - sumOfSquares(number);
}
