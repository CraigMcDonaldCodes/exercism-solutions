#include "difference_of_squares.h"

#include <math.h>
#include <stdint.h>

#define u32 uint32_t

u32 sum_of_squares(const u32 number) {

    u32 sum = 0;

    for (u32 i = 1; i <= number; i++) {
        sum += (u32)pow(i, 2);
    }

    return sum;
}

u32 square_of_sum(const u32 number) {

    u32 sum = 0;

    for (u32 i = 1; i <= number; i++) {
        sum += i;
    }

    return (u32)pow(sum, 2);
}

u32 difference_of_squares(const u32 number) {
    return square_of_sum(number) - sum_of_squares(number);
}
