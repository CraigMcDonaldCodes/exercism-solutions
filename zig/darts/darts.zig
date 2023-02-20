const math = @import("std").math;

pub const Coordinate = struct {
    x: f32,
    y: f32,

    pub fn init(x_coord: f32, y_coord: f32) Coordinate {
        return Coordinate{
            .x = x_coord,
            .y = y_coord,
        };
    }

    pub fn score(self: Coordinate) isize {
        const radius = math.sqrt(self.x * self.x + self.y * self.y);
        var points: isize = 0;

        if (radius > 10) {
            // no score, bad aim
        } else if (radius > 5) {
            // outer radius
            points = 1;
        } else if (radius > 1) {
            // middle radius
            points = 5;
        } else if (radius >= 0) {
            // inner radius
            points = 10;
        }

        return points;
    }
};
