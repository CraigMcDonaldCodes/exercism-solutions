pub fn is_armstrong_number(num: u32) -> bool {

    let mut sum = 0u32;
    let mut current = num;
    let power = num.to_string().len() as u32;

    while current > 0 {
        sum += u32::pow(current % 10, power);
        current /= 10;
    }

    num == sum
}
