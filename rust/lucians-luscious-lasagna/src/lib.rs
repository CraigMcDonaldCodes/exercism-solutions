const COOKING_TIME: i32 = 40;
const MIN_PER_LAYER: i32 = 2;

pub fn expected_minutes_in_oven() -> i32 {
    COOKING_TIME
}

pub fn remaining_minutes_in_oven(actual_minutes_in_oven: i32) -> i32 {
    COOKING_TIME - actual_minutes_in_oven
}

pub fn preparation_time_in_minutes(number_of_layers: i32) -> i32 {
    number_of_layers * MIN_PER_LAYER
}

pub fn elapsed_time_in_minutes(number_of_layers: i32, actual_minutes_in_oven: i32) -> i32 {
    actual_minutes_in_oven + preparation_time_in_minutes(number_of_layers)
}
