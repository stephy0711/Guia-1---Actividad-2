package Pedro;

public class Pedro {
    public static double gastoArriendo( double sueldo ){
        double gasto = sueldo * 0.4;
        return gasto;
    }

    public static double gastoComida( double sueldo ){
        double gasto = sueldo * 0.15;
        return gasto;
    }

    public static void mostrarInformacion( double sueldo, double arriendo, double comida ){
        if ( (int) sueldo  >= 1 ){
            System.out.println("""
                ===============
                    CALCULO
                ===============
                """);
            System.out.println("Sueldo: "+ (int) sueldo );
            System.out.println("Gasto del arriendo: "+ (int) arriendo );
            System.out.println("Gasto del comida: "+ (int) comida );
        }else{
            System.out.println("""
                    ====================
                        Sueldo en 0
                    ====================
                    """);
            System.out.println("Gasto del arriendo: "+ (int) arriendo );
            System.out.println("Gasto del comida: "+ (int) comida );
        }
    }
}
