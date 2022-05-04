use std::fmt;

use enum_iterator::IntoEnumIterator;
use int_enum::IntEnum;

#[repr(usize)]
#[derive(Clone, Copy, Debug, Eq, IntoEnumIterator, PartialEq, IntEnum)]
pub enum ResistorColor {
    Black = 0,
    Brown = 1,
    Red = 2,
    Orange = 3,
    Yellow = 4,
    Green = 5,
    Blue = 6,
    Violet = 7,
    Grey = 8,
    White = 9,
}

impl fmt::Display for ResistorColor {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        write!(f, "{:?}", self)
    }
}

pub fn color_to_value(color: ResistorColor) -> usize {
    color.int_value()
}

pub fn value_to_color_string(value: usize) -> String {

    let mut resistor = "value out of range".to_string();

    for r in ResistorColor::into_enum_iter() {

        if color_to_value(r) == value {
            resistor = r.to_string();
        }
    }

    resistor
}

pub fn colors() -> Vec<ResistorColor> {

    let mut colors = Vec::new();

    for r in ResistorColor::into_enum_iter() {
        colors.push(r)
    }

    colors
}
