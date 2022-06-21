package flatten

// Flatten take an arbitrarily-deep nested slice of any type
// and returned flattened with any nil values
func Flatten(nested interface{}) []interface{} {

	// empty slice of interfaces
	flatSlice := []interface{}{}

	if topSlice, ok := nested.([]interface{}); ok {

		for _, entry := range topSlice {

			if nestedSlice, ok := entry.([]interface{}); ok {
				flatSlice = append(flatSlice, Flatten(nestedSlice)...)
			} else {
				if entry != nil {
					flatSlice = append(flatSlice, entry)
				}
			}
		}
	}

	return flatSlice
}
