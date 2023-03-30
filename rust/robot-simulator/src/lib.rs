// Too much cloning going on!

#[derive(Clone, PartialEq, Eq, Debug)]
pub enum Direction {
    North,
    East,
    South,
    West,
}

#[derive(Clone)]
pub struct Robot {
    x: i32,
    y: i32,
    direction: Direction,
}

impl Robot {
    pub fn new(x: i32, y: i32, d: Direction) -> Self {
        Self { x, y, direction: d }
    }

    #[must_use]
    pub fn turn_right(self) -> Self {
        let mut tmp = self.clone();

        match self.direction {
            Direction::North => tmp.direction = Direction::East,
            Direction::East => tmp.direction = Direction::South,
            Direction::South => tmp.direction = Direction::West,
            Direction::West => tmp.direction = Direction::North,
        }

        tmp
    }

    #[must_use]
    pub fn turn_left(self) -> Self {
        let mut tmp = self.clone();

        match self.direction {
            Direction::North => tmp.direction = Direction::West,
            Direction::West => tmp.direction = Direction::South,
            Direction::South => tmp.direction = Direction::East,
            Direction::East => tmp.direction = Direction::North,
        }

        tmp
    }

    #[must_use]
    pub fn advance(self) -> Self {
        let mut tmp = self.clone();

        match tmp.direction {
            Direction::North => tmp.y += 1,
            Direction::East => tmp.x += 1,
            Direction::South => tmp.y -= 1,
            Direction::West => tmp.x -= 1,
        }

        tmp
    }

    #[must_use]
    pub fn instructions(self, instructions: &str) -> Self {
        let mut tmp = self.clone();

        for i in instructions.chars() {
            match i {
                'R' => tmp = tmp.turn_right(),
                'L' => tmp = tmp.turn_left(),
                'A' => tmp = tmp.advance(),
                // input is not valid
                _ => (),
            }
        }

        tmp
    }

    pub fn position(&self) -> (i32, i32) {
        (self.x, self.y)
    }

    pub fn direction(&self) -> &Direction {
        &self.direction
    }
}
