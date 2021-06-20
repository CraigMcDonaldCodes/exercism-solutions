package account

type BankAccount struct {
	balance int
}

func Open(amount int) BankAccount {

	account := BankAccount{
		balance: amount,
	}

	return account
}

func (account *BankAccount) Balance() (int, error) {
	return 1, nil
}
