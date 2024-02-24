package funcion;

public class Funcion {
    public static void resultado( double x, double y ){
        double res = Math.pow(x,2) + ( 2 * x * y ) + Math.pow(x,2);
        System.out.println("El resultado de la operacion es: "+ res +"\n");
    }
}

