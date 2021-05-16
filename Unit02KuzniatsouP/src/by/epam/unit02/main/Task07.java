package by.epam.unit02.main;

public class Task07 {
    /*Даны три действительных числа. Возвести в квадрат те из них, значения
    которых неотрицательны, и в четвертую степень — отрицательные.
    */

    public static void main(String[] args) {

        double x,y,z;
        x=0;
        y=12.6;
        z=-14.5;

            if (x>=0) {
                x=Math.pow(x,2);
            } else {
                x=Math.pow(x,4);
            }

            if (y>=0) {
                y=Math.pow(y,2);
            } else {
                y=Math.pow(y,4);
            }

            if (z>=0) {
                z=Math.pow(z,2);
            } else {
                z=Math.pow(z,4);
            }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
