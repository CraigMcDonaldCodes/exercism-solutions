const MIN_SPEED: u32 = 0;
const MAX_SPEED: u32 = 10;
const CARS_PER_HOUR: u32 = 221;

pub fn production_rate_per_hour(speed: u8) -> f64 {

    let success_rate = match speed {
        5..=8 => 0.9,
        9 | 10 => 0.77,
        _ => 1.0
    };

    (speed as u32 * CARS_PER_HOUR) as f64 * success_rate
}

pub fn working_items_per_minute(speed: u8) -> u32 {
    (production_rate_per_hour(speed) / 60.0) as u32
}
