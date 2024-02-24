import Cartesiano.Cartesiano;
import Pedro.Pedro;
import Terreno.Terreno;
import circunferencia.Circunferencia;
import escalera.Escalera;
import funcion.Funcion;
import paseo.Paseo;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean bool = true;
        while(bool == true) {
            System.out.println("""
                   =======================================
                        BIENVENIDO A LOS EJERCICIOS
                   =======================================
                    1. Funcion f(x,y) = x^2 + 2xy + y^2
                    2. Ejercicio el paseo
                    3. Ejercicio de escalera
                    4. Ejercicio de pedro
                    5. Ejercicio de Area
                    6. Ejercicio de Terreno
                    """);

            try{
                switch (scan.nextLine()){
                    case "1":
                        Funcion fun = new Funcion();
                        System.out.println("""
                            -------------------------------------------
                                Funcion f(x,y) = x^2 + 2xy + y^2
                            -------------------------------------------
                            """);
                        System.out.println("Que numero es la variable de x: ");
                        double x = Double.parseDouble( scan.nextLine() );
                        double y = Double.parseDouble( scan.nextLine() );
                        fun.resultado(x,y);
                        break;
                    case "2":
                        System.out.println("""
                            -------------------------
                                Ejercicio el paseo
                            -------------------------
                            """);
                        Paseo pas = new Paseo();
                        System.out.println("Ingrese el numero de sillas de los buses");
                        int sillasBus = Integer.parseInt(scan.nextLine());
                        System.out.println("Ingrese el numero de estudiantes gordos");
                        int estudiantesGordos = Integer.parseInt( scan.nextLine() );
                        System.out.println("Ingrese el numero de estudiantes delgados");
                        int estudiantesFlacos = Integer.parseInt( scan.nextLine() );
                        pas.calculoBuses(sillasBus, estudiantesGordos, estudiantesFlacos);
                        break;
                    case "3":
                        System.out.println("""
                            -----------------------------
                                Ejercicio de escalera
                            -----------------------------
                            """);
                        Escalera esc = new Escalera();
                        System.out.println("Ingrese la altura de la escalera");
                        double a = Double.parseDouble(scan.nextLine());
                        System.out.println("Ingrese el angulo en grados");
                        double angulo = Double.parseDouble( scan.nextLine() );
                        esc.calculoLongitud(a,angulo);
                        break;
                    case "4":
                        Pedro pdr = new Pedro();
                        System.out.println("""
                            -------------------------
                                Ejercicio de pedro
                            -------------------------
                            """);
                        System.out.println("Ingrese el sueldo actual de Pedro sin ningun punto o coma");
                        double salario = Double.parseDouble(scan.nextLine());
                        double gastoArriendo = pdr.gastoArriendo( salario );
                        double gastoComida = pdr.gastoComida( salario );
                        pdr.mostrarInformacion( salario, gastoArriendo, gastoComida );
                        break;
                    case "5":
                        System.out.println("""
                                ---------------------------
                                    Ejercicio de Area
                                ---------------------------
                                """);
                        Circunferencia cr = new Circunferencia();
                        System.out.println("Ingrese el radio de la circunferencia grande (R)");
                        double rGrande = Double.parseDouble( scan.nextLine() );
                        System.out.println("Ingrese el radio de la circunferencia pequeña (r)");
                        double rPequeno = Double.parseDouble( scan.nextLine() );
                        double aCorona = cr.areaCorona( rGrande, rPequeno );
                        System.out.println("El área de la corona circular es "+ aCorona);
                        break;
                    case "6":
                        Terreno ter = new Terreno();
                        System.out.println("""
                                ---------------------------
                                    Ejercicio de Terreno
                                ---------------------------
                                """);
                        System.out.println("Ingrese el lado B:");
                        double ladoB = Double.parseDouble(scan.nextLine());
                        System.out.println("Ingrese el lado C:");
                        double ladoC = Double.parseDouble(scan.nextLine());
                        ter.showInfo( ladoB, ladoC );
                        break;
                    case "7":
                        Cartesiano cart = new Cartesiano();
                        System.out.println("""
                                -------------------------------
                                    Ejercicio de Cartesiano
                                -------------------------------
                                """);
                        System.out.println("Ingresa el valor del punto x sub 1:");
                        double x1 = Double.parseDouble(scan.nextLine());
                        System.out.println("Ingresa el valor del punto y sub 1");
                        double y1 = Double.parseDouble(scan.nextLine());
                        System.out.println("Ingresa el valor del punto x sub 2:");
                        double x2 = Double.parseDouble(scan.nextLine());
                        System.out.println("Ingresa el valor del punto y sub 2");
                        double y2 = Double.parseDouble(scan.nextLine());
                        double pendiente = cart.pendiente(x1, y1, x2, y2);
                        double distancia = cart.distancia(x1, y1, x2, y2);
                        System.out.println("La distancia entre (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);
                        System.out.println("La pendiente de la recta que une (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + pendiente);
                        break;
                    case "8":

                        break;
                }
            }catch (Exception e ){
                System.out.println("-- ERROR --");
                System.out.println("Se presento un error, revise porfavor los datos ingresados o comuniquese con el dev");
                System.out.println(e.getMessage());
            }
        }

    }
}