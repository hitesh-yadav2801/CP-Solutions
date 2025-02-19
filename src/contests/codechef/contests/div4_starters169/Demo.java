package contests.codechef.contests.div4_starters169;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Cat();
        animal.sound();
        animal1.sound();
        Animal.walk();
        System.out.println(Animal.a);
        Mammal cow = new Cow();
        cow.sound();
    }
}

interface Animal {
    int a = 10;
    void sound();
    static void walk() {
        System.out.println("Animal is walking");
    }
}

abstract class Mammal implements Animal {
    @Override
    public void sound() {
        System.out.println("Mammal is making sound");
    }
}

class Cow extends Mammal {

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }
}
