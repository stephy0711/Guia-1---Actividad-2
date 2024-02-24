package Cartesiano;

public class Cartesiano {
    public static double distancia( double x1, double y1, double x2, double y2 ){
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;

        double distancia = Math.sqrt( Math.pow(diferenciaY,2) + Math.pow(diferenciaX, 2) );

        return  distancia;
    }

    public static double pendiente( double x1, double y1, double x2, double y2 ){
        if ( x1 == x2 ){
            System.out.println("Los puntos no pueden tener la misma coordenada x");
            return 0;
        }

        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;

        double pend = diferenciaY / diferenciaX;

        return pend;


    }
}
