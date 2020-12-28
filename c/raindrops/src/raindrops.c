#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include "raindrops.h"

char* convert(char result[], int drops) {

    /* Should use 'strcat_s' so we will have to assume char array is large enough */

    _Bool matched = false;

    if (drops % 3 == 0) {
        strcat(result, "Pling");
        matched = true;
    }

    if (drops % 5 == 0) {
        strcat(result, "Plang");
        matched = true;
    }

    if (drops % 7 == 0) {
        strcat(result, "Plong");
        matched = true;
    }

    /* No match so return int back as char array */
    if (!matched) {
        sprintf(result, "%d", drops);
    }

    return result;
}
