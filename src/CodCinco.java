
public class CodCinco {
    private int c;

    public CodCinco(String ni) {
        // Convierte el número ingresado a entero
        this.c = Integer.parseInt(ni);
    }
//defino un meotodo publicopara determinar para determinr siel num es afortunado
    public void evaluarNumero() {
        int afo = 0;
        int noAfo = 0;
        //cree una variable local que copia el valor original
        int num = c;

        while (num > 0) {
            //se obtendra el ultimo diigito usando el operador modulo
            int digito = num % 10;

            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
//se eliminara el ultimo digito dividiendo entre 10
            num /= 10;
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
    }
}
