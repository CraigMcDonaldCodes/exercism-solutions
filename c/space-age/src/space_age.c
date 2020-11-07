#include "space_age.h"

float convert_planet_age(planet_t planet, int64_t input) {

    float result = input / EARTH_SEC;

    switch (planet) {
        case EARTH:
            // Do nothing
            break;
        case MERCURY:
            result /= MERCURY_EARTH_YEAR;
            break;
        case VENUS:
            result /= VENUS_EARTH_YEAR;
            break;
        case MARS:
            result /= MARS_EARTH_YEAR;
            break;
        case JUPITER:
            result /= JUPITER_EARTH_YEAR;
            break;
        case SATURN:
            result /= SATURN_EARTH_YEAR;
            break;
        case URANUS:
            result /= URANUS_EARTH_YEAR;
            break;
        case NEPTUNE:
            result /= NEPTUNE_EARTH_YEAR;
            break;
    }

    return result;
}
