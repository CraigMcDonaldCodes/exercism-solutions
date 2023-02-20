const std = @import("std");
const math = std.math;

pub const ChessboardError = error{IndexOutOfBounds};

const min_size = 1;
const max_size = 64;

pub fn square(index: isize) ChessboardError!u64 {
    if (index < min_size or index > max_size) {
        return ChessboardError.IndexOutOfBounds;
    }

    const i = @intCast(u64, index) - 1;

    return math.pow(u64, 2, i);
}

pub fn total() u64 {
    return math.maxInt(u64);
}
