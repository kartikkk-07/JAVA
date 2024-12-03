// Hybrid Inheritance
public class OOPs4 {
    public static void main(String[] args) {
        Human h1 = new Human();
        System.out.println(h1.legs);
        h1.breathe();
    }
}

class Animal {
    void breathe() {
        System.out.println("Breathes");
    }
    void eat() {
        System.out.println("Eats");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}
class Tuna extends Fish {
    int size = 45;
}
class Shark extends Fish {
    int size = 60;
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}
class sparrow extends Bird {
    int flyheight = 55;
}

class Mammals extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}
class Human extends Mammals {
    int legs = 2;
}
class Dog extends Mammals {
    int legs = 4;
}
class Cat extends Mammals {
    int legs = 4;
}