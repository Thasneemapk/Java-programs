class AddComplexNumbers {
    int real;
    int image;

    void setValues(int r, int i) {
        real = r;
        image = i;
    }

    void addition(AddComplexNumbers c1) {
        System.out.println("Resulting Complex number : " + (real + c1.real) + " + " + (image + c1.image) + " i");
    }
}

public class complexnmbr {
    public static void main(String[] str) {

        AddComplexNumbers c1 = new AddComplexNumbers();
        AddComplexNumbers c2 = new AddComplexNumbers();

        c1.setValues(12, 4);
        c2.setValues(8, 2);

        c2.addition(c1);

    }
}