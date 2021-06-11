pub fn sum_of_multiples(limit: u32, factors: &[u32]) -> u32 {

    // There is definitely a more succint way of doing this
    // probably a poor way of solving
    // I will come back to it once I know Rust a bit better

    let mut sum = 0u32;

    for n in 1..limit {

        for f in factors {

            if (*f != 0) && n % f == 0 {
                sum += n;
                break
            }
        }
    }

    sum
}
