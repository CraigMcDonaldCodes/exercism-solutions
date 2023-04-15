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

pub fn colorCode(colors: [2]ColorBand) usize {
    var sum: usize = undefined;

    sum = @enumToInt(colors[0]);
    sum *= 10;
    sum += @enumToInt(colors[1]);

    return sum;
}
