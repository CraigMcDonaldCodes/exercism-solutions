#ifndef SPACE_AGE_H
#define SPACE_AGE_H

#include <stdint.h>

#define MERCURY 0.2408467
#define VENUS 0.61519726
#define EARTH 

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
