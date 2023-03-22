import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Electro-PC
 */
public class ejerciciojavautn {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int numInicio;
        int numFinal;

        numInicio = 5;
        numFinal = 14;

        System.out.println("EJERCICIO 1");

        System.out.println("A)");

        while ((numInicio <= 14) && (numFinal >= 5)) {
            System.out.println("imprime el numero " + numInicio);
            numInicio = numInicio + 1;
        }

        System.out.println("B)");

        numInicio = 5;

        while ((numInicio >= 5) && (numInicio <= 14)) {
            if (numInicio % 2 == 0) {
                System.out.println("este es numero par " + numInicio);
            }
            numInicio = numInicio + 1;
        }

        System.out.println("C)");

        numInicio = 5;

        while ((numInicio >= 5) && (numInicio <= 14)) {
            if (numInicio % 2 == 0) {
                System.out.println("este es numero par " + numInicio);
            } else if (numInicio % 2 == 1) {
                System.out.println("este es numero impar " + numInicio);
            } else {
                System.out.println("no imprime nada ");
            }
            numInicio = numInicio + 1;
        }

        System.out.println("D)");

        for (numInicio = 14; numInicio >= 5; numInicio--) {
            if (numInicio % 2 == 0) {
                System.out.println("imprime el par decreciente " + numInicio);
            }
        }

        System.out.println("EJERCICIO 2");

        double ingMensual = 489.083;
        int vehNuevo = 3;
        int inmuebles = 3;
        boolean solvencia = true;

        if ((ingMensual >= 489.083) || (vehNuevo >= 3) || (inmuebles >= 3) || (solvencia)) {
            System.out.println("El ciudadano pertenece al sector de ingresos altos");
        }
    }

    @Override
    public String toString() {
        return "ejerciciojavautn []";
    }
}
