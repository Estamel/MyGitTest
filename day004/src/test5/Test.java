package test5;
class Animal{

}
class Cat extends Animal{

}
class Dog extends Animal{

}
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        Cat cat1 = (Cat)animal1;
        Dog cat2 = (Dog)animal2;

    }

}

