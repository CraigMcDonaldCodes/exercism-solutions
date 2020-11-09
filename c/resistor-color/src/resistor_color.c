#include <stdio.h>
#include <stdlib.h>
#include "resistor_color.h"

int color_code(resistor_band_t resistor) {
    return (int)resistor;
}

resistor_band_t* colors(void) {

    // TODO Should really check malloc returned
    resistor_band_t *data = malloc(10 * sizeof(resistor_band_t));

    for (int i = BLACK; i <= WHITE; i++) {
        data[i] = i;
    }

    return data;
}
