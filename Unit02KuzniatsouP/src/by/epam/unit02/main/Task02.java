package by.epam.unit02.main;

public class Task02 {
    //Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

    public static void main(String[] args) {

        int x, y, d;

        x = 5;
        y = 8;

        if (x < y) {
            d = x;
            x = y;
            y = d;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("Перераспределение не требуется");
        }
    }
}
