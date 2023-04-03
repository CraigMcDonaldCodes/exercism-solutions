pub const ColorBand = enum {
    black,
    brown,
    red,
    orange,
    yellow,
    green,
    blue,
    violet,
    grey,
    white,
};

pub fn colorCode(color: ColorBand) usize {
    return @enumToInt(color);
}

pub fn colors() []const ColorBand {

    // I didn't want to do it this way, feels like cheating
    // but I couldn't find a comptime way
    // of iterating the enum values/fields and turning it
    // into a slice of enum values.
    // This way means you have to remember to update this
    // if the enum values are updated.
    // So it passes all the unit tests but probably not
    // a solution in the 'spirit' of learning.
    return &[_]ColorBand{
        .black, .brown, .red,    .orange, .yellow,
        .green, .blue,  .violet, .grey,   .white,
    };
}
