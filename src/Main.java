package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();

        // Cree un objeto de Codigo5 y llamé al métoodo de evaluación
        CodCinco codigo = new CodCinco(ni);
        codigo.evaluarNumero();
     //cerré el scanner
        s.close();
    }
}
