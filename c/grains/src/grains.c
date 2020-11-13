#include "grains.h"

#define MIN 1
#define MAX 64

uint64_t square(uint8_t index) {

    if (index < MIN || index > MAX) {
        return 0;
    }

    return powl(2, index - 1);
}


uint64_t total(void) {
    return powl(2, 64) - 1;
}
