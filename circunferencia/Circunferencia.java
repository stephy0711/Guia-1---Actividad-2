package circunferencia;

public class Circunferencia {
    public static double areaCirculo( double radio ){
        return Math.PI * Math.pow(radio, 2);
    }

    public static double areaCorona(double rGrande, double rPequeno){
        double calculoAreaGrande = areaCirculo( rGrande );
        double calculoAreaPequeno = areaCirculo( rPequeno );
        return  calculoAreaGrande - calculoAreaPequeno;
    }
}
