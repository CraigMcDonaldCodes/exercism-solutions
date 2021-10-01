#include <ctype.h>
#include <stdio.h>
#include <string.h>

#include "isogram.h"

bool is_isogram(const char phrase[]) {

    // Don't pass in rubbish 
    if (phrase == NULL) {
        return false;
    }

    int len = strlen(phrase);

    // If only 1 char, not point in testing as true
    if (len == 1) {
        return true;
    }

    for (int i = 0; i < len - 1; i++) {

        for (int k = i + 1; k < len; k++) {

            // Ignore space and hypen chars
            if (phrase[k] == ' ' || phrase[k] == '-') {
                continue;
            }

            // If the chars are equal then not an isogram
            // return early
            // Probably a better way than continuously calling tolower()
            if (tolower(phrase[i]) == tolower(phrase[k])) {
                return false;
            }
        }
    }

    return true;
}
