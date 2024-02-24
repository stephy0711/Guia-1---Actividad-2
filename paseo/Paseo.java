package paseo;

public class Paseo {
    public static void calculoBuses( int sillasBus, int estudianteGrande, int estudiantePeque ){
        int sillasNecesarias = estudianteGrande * 2 + estudiantePeque;
        int buses = sillasNecesarias / sillasBus;
        if (sillasNecesarias % sillasBus != 0) {
            buses++;
        }
        System.out.println("Buses necesarios para realizar el pase: "+ buses);
    }
}
