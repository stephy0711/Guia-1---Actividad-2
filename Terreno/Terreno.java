package Terreno;

public class Terreno {
    public static double calcAreaRectangulo( double base, double altura ){
        return base * altura;
    }

    public static double calcHipotenusa( double catOpuesto, double catAdyacente ){
        return Math.sqrt( catOpuesto * catOpuesto + catAdyacente * catAdyacente );
    }

    public static double calcAreaTriangulo( double base, double altura ){
        return ( base * altura ) / 2;
    }

    public static double calcPerimetroTerreno( double ladoA, double ladoB, double ladoC){
        return ladoA + ladoB + ladoC;
    }

    public static void showInfo( double ladoB, double ladoC ){
        System.out.println("""
                ====================
                    RESULTADOS
                ====================
                """);
        System.out.println("Area del rectangulo: "+ calcAreaRectangulo( ladoB, ladoC ));
        System.out.println("Area del triangulo: "+ calcAreaTriangulo( ladoB, ladoC ));
        double h = calcHipotenusa( ladoB, ladoC ); // hipotenusa
        System.out.println("Calculo de la hipotenusa: "+ h);
        System.out.println("Calculo del perimetro: "+ calcPerimetroTerreno(h, ladoB, ladoC));
    }

}
