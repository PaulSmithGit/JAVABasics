package by.epam.unit02.main;

public class Task09 {
    /*Вычислить значение функции:
    9, если x<=-3 and
    1/(x^2+1), если x>3
     */

    public static void main(String[] args) {

        double x,f;
        x=4;

            if (x<=-3) {
                f=9;
                System.out.println("F(x) = " + f);
            } else if (x>3) {
                f=1/(Math.pow(x,2)+1);
                System.out.println("F(x) = " + f);
            } else {
                System.out.println("Функция не определена");
            }
    }
}
