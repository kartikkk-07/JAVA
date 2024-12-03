public class Apna {

    public static void plusPlus(int c,int d) {
        System.out.println(c);
        System.out.println(d);
        return;
    }
    
    public static void printName(String one , String two) {
        System.out.println(one);
        System.out.println(two);
        return;
    }

    public static void callByReference (int marks[] , int nonchange){
        nonchange = 5;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] kartik) {
        // int a = 10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(" ");

        // int c = 10;
        // int d = ++c;
        // plusPlus(c, d);

        // String k1 = "\nKartik";
        // String k2 = "Magdum";
        // printName(k1 ,k2);

        int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 99;
        marks[2] = 98;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Array is: " + marks[i]);
        }

        int nonchange = 10;
        System.out.println(nonchange);
        callByReference(marks,nonchange);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Changed array is: " + marks[i]);
        }
        System.out.println(nonchange);
        // Call by value(JAVA) and not by reference(C++), always in java but in array data type,
        // it has own property
        // Hence array values changes and int value do not
    }
}