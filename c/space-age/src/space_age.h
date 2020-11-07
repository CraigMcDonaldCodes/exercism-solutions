#ifndef SPACE_AGE_H
#define SPACE_AGE_H

#include <stdint.h>

#define EARTH_SEC 31557600

#define MERCURY_EARTH_YEAR  0.2408467
#define VENUS_EARTH_YEAR    0.61519726
#define MARS_EARTH_YEAR     1.8808158
#define JUPITER_EARTH_YEAR  11.862615
#define SATURN_EARTH_YEAR   29.447498
#define URANUS_EARTH_YEAR   84.016846
#define NEPTUNE_EARTH_YEAR  164.79132

typedef enum planet {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
} planet_t;

float convert_planet_age(planet_t planet, int64_t input);

#endif
