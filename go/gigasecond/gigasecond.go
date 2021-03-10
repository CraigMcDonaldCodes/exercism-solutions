package gigasecond

import "time"

// AddGigasecond adds 1000_000_000 seconds to an existing Time
func AddGigasecond(t time.Time) time.Time {

	return t.Add(time.Second * 1000_000_000)
}
