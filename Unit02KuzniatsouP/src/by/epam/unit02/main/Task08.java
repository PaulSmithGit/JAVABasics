package by.epam.unit02.main;

public class Task08 {
    /*Для данных областей составить линейную программу, которая печатает true,
    если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае.
    */

    public static void main(String[] args) {

        double x,y;
        x=4.001;
        y=0;

            if ((y>=0) && (y<=4) && (x<=2) && (x>=-2)) {
                System.out.println("TRUE");
            } else if ((y<=0) && (y>=-3) && (x<=4) && (x>=-4)) {
                System.out.println("TRUE");
            } else {
            System.out.println("FALSE");
            }
    }
}
