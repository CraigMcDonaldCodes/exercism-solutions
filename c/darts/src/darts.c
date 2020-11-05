#include <math.h>
#include <stdint.h>
#include "darts.h"

uint8_t score(coordinate_t pos) {

        float radius = sqrt(pos.x * pos.x + pos.y * pos.y);
        int score = 0;

        if (radius > 10) {
            // Outside the circle, no score
        } else if (radius > 5) {
            // Outer radius
            score = 1;
        } else if (radius > 1) {
            // Middle radius
            score = 5;
        } else if (radius >= 0) {
            // Inner radius
            score = 10;
        }

        return score;
}
