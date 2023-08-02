class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("barking");	
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}
public class InheritanceEg1 {
public static void main(String[] args) {
		Animal obj1=new Animal();
		obj1.eat();
		
	Dog obj2=new Dog();
	obj2.bark();obj2.eat();
	
	cat obj3=new cat();
	obj3.meow();obj3.eat();

	}

}
