package chessboard

const minFile = 1
const maxFile = 8

// Declare a type named Rank which stores if a square is occupied by a piece - this will be a slice of bools
type Rank []bool

// Declare a type named Chessboard which contains a map of eight Ranks, accessed with keys from "A" to "H"
type Chessboard map[string]Rank

// CountInRank returns how many squares are occupied in the chessboard,
// within the given rank
func CountInRank(cb Chessboard, rank string) int {

	var count int

	for key, row := range cb {

		if key == rank {
			for _, square := range row {
				if square {
					count++
				}
			}
		}
	}

	return count
}

// CountInFile returns how many squares are occupied in the chessboard,
// within the given file
func CountInFile(cb Chessboard, file int) int {

	if file > maxFile || file < minFile {
		return 0
	}

	index := file - 1
	var count int

	for _, row := range cb {
		if row[index] {
			count++
		}
	}

	return count
}

// CountAll should count how many squares are present in the chessboard
func CountAll(cb Chessboard) int {

	var count int

	for _, row := range cb {
		count += len(row)
	}

	return count
}

// CountOccupied returns how many squares are occupied in the chessboard
func CountOccupied(cb Chessboard) int {

	var count int

	for _, row := range cb {
		for _, square := range row {
			if square {
				count++
			}
		}
	}

	return count
}
