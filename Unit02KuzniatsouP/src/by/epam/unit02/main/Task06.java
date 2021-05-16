package by.epam.unit02.main;

public class Task06 {
    /*Даны натуральные числа М и N. Вывести старшую цифру дробной части и
    младшую цифру целой части числа M/N.
    */

    public static void main(String[] args) {

        int m,n,a,b;
        double max,min;
        m=101;
        n=8;

            min=(double)m/n;
            a=(int)min;
            max=min*10;
            b=(int)max;

        System.out.println("Младшая цифра целой части = " + a % 10);
        System.out.println("Старшая цифра дробной части = " + b % 10);

    }
}
