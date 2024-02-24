package escalera;

public class Escalera {
    public static void calculoLongitud( double a, double angulo ){
        if (angulo > 0) {
            double anguloRad = Math.toRadians( angulo );
            double longitud = a / Math.sin( anguloRad );
            System.out.println("La longitud de la escalera es: "+ longitud);
        }else{
            System.out.println("-- Error en formato --");
        }

    }
}
