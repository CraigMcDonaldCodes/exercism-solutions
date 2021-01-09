const MIN: u32 = 1;
const MAX: u32 = 64;

pub fn square(s: u32) -> u64 {

    if s > MAX || s < MIN {
        panic!("Square must be between 1 and 64");
    }

    u64::pow(2, s - 1)
}

pub fn total() -> u64 {
    u64::MAX
}
