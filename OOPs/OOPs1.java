// Basics of Classes & Objects
// Access modifiers
public class OOPs1 {
    public static void main(String[] args) {
        // 1 :
        Pen p1 = new Pen(); // Constructor. New heap occupied space for Pen()
        p1.changeCompany("Lexi");
        System.out.println(p1.company);

        p1.price = 45;
        System.out.println(p1.price);

        p1.company = "Butterflow";
        System.out.println(p1.company);

        // 2 :
        BankAccount MyAcc = new BankAccount();
        MyAcc.username = "kartikMagdum";
        MyAcc.password = "abchefg";
        MyAcc.setPassword("abcde"); // We can change value but can't access
        System.out.println(MyAcc.password); // Cannot access due to private access modifier
    }
}

// Always create a new class below main class (This is tradiotinal way)
class Pen {
    String company;
    int price;

    void changeCompany(String change) {
        company = change;
    }

    void changePrice(int num){
        price = num;
    }
}

class BankAccount {
    public String username;
    private String password;

    void setPassword (String pwd) {
        password = pwd;
    }
}