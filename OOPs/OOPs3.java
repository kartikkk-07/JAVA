// Inheritance
public class OOPs3 {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat(); // eat() function isn't in class Fish but it is inherited from class Animal(Parent Class)
        System.out.println(f1.c);
        f1.c();
    }
}

class Animal { // Parent / Base / Super Class
    int a = 10;
    String st = "Hello";
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal { // Child / Derived / Sub Class
    int b = 15;
    int c = a + b;

    void c() {
        System.out.println(st);
    }

    void fins(){
        System.out.println("Have fins");
    }
}