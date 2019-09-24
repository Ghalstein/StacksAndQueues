/*
first-in, first-out animal shelter
can either adopt the "youngest" or specify whether they want a dog/cat and recieve
the youngest of that type
very primitive skeleton that just takes age in as cat or dog
*/

public class AnimalShelter {

	// two stacks one dog and one cat
	SortStack dogs = new SortStack();
	SortStack cats = new SortStack();

	// pops off oldest either cat or dog
	public void push(String type, int age) {
		if (type.toLowerCase().equals("cat")) {
			cats.push(age);
		}
		else if (type.toLowerCase().equals("dog")){
			dogs.push(age);
		}
		else {
			return;
		}
	}

	public static void main(String[] args) {
		AnimalShelter shelter = new AnimalShelter();
		shelter.push("DOG", 10);
		shelter.push("CAT", 15);
		shleter.push("BUNNY", 2);
		System.out.println("dogs: " + this.dogs);
		SYstem.out.println("cats: " + this.cats);
	}
}