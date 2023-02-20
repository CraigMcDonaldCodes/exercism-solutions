package airportrobot

import "fmt"

type Greeter interface {
	LanguageName() string
	Greet(string) string
}

type Italian struct{}

func (i Italian) LanguageName() string {
	return "Italian"
}

func (i Italian) Greet(str string) string {
	return fmt.Sprintf("Ciao %s!", str)
}

type Portuguese struct{}

func (p Portuguese) LanguageName() string {
	return "Portuguese"
}

func (p Portuguese) Greet(str string) string {
	return fmt.Sprintf("Olá %s!", str)
}

func SayHello(name string, greet Greeter) string {
	return fmt.Sprintf("I can speak %s: %s", greet.LanguageName(), greet.Greet(name))
}
