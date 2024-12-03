// Getters and Setters

public class OOPs2 {
    public static void main(String[] args) {
        Pen1 p2 = new Pen1();

        p2.setCompany("Lexi");
        System.out.println(p2.getCompany());

        p2.setPrice(45);
        System.out.println(p2.getPrice());

        p2.setCompany("Butterflow");
        System.out.println(p2.getCompany());
    }
}

class Pen1 {
    private String company;
    private int price;

    // get : to return the value
    // set : to modify / change the value

    String getCompany() {
        return this.company;
    }

    int getPrice() {
        return this.price; 
    }

    void setCompany(String change) {
        this.company = change;
    }

    void setPrice(int price){
        this.price = price;
        // this.price refers to price variable from present class (Here Pen class)
        // and value assigning price variable is from arguments that we are going to pass
    }
}