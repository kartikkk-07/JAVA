// Polymorphism

/*  Compile Time Polymorphism (Static) : Method Overloading
    It is called compile time because at the time of execution compiler knows which function is going to be
    called. */

/* public class OOPs5 {
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        System.out.println(ca.sum(4 , 5));
        System.out.println(ca.sum(4.5f , 5.4f));
        System.out.println(ca.sum(4 , 5 , 10));
    }
} */

/* class Calculator {
    int sum (int a, int b){
        return a + b;
    }
    float sum (float a, float b) {
        return a + b;
    }
    int sum (int a, int b, int c) {
        return a+b+c;
    }
} */

/*  Run Time Polymorphism (Dynamic) : Method overriding 
 *  It overrides...
*/

public class OOPs5 {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats everything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}