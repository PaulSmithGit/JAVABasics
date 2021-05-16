package by.epam.unit02.main;

public class Task04 {
    /*Вычислить расстояние между двумя точками с данными координатами
        (х1, у1) и (x2, у2).
    */

    public static void main(String[] args) {

        double x1,y1,x2,y2,dist;
        x1=3;
        y1=-4;
        x2=-6;
        y2=5;

            dist=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            System.out.println("Расстояние = " + dist);
    }
}
