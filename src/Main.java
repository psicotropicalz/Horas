import java.util.Scanner;

/**
 * Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos. Dispone de los métodos:Hora(hora, minuto), que construye un objeto con los datos pasados como pará-metros.void inc(), que incrementa la hora en un minuto.boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve true o false según haya sido posible modificar los minutos o no.boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la hora o no.String toString(), que devuelve un String con la representación de la hora.
 *
 * Siguiendo el ejercicio anterior:
 * A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los segundos. Además de los métodos heredados de Hora, dispondrá de:HoraExacta(hora, minuto, segundo), que construye un objeto con los datos pasados como parámetros.setSegundo(valor), que asigna, si está comprendido entre 0 y 59, el valor indicado a los segundos.inc(), que incrementa la hora en un segundo
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora horaEs = new Hora(16,54);
        System.out.println(horaEs.toString());

        int nuevoMin, nuevaHora;
        do {
            System.out.print("Introduzca la nueva hora: ");
            nuevaHora = sc.nextInt();
            if (horaEs.setHora(nuevaHora)) {
                System.out.println("La hora se ha establecido correctamente.\n" + horaEs.toString() + "\n");
            } else {
                System.out.println("El valor para asignar a la hora no es valido\n");
            }
        } while (!horaEs.setHora(nuevaHora));


        do {
            System.out.print("Introduzca el numero de minuto: ");
            nuevoMin = sc.nextInt();
            if (horaEs.setMinuto(nuevoMin)) {
                System.out.println("El minuto se ha establecido correctamente.\n" + horaEs.toString() + "\n");
            } else {
                System.out.println("El valor para asignar al minuto no es valido");
            }
        } while (!horaEs.setMinuto(nuevoMin));

        //Usamos la función inc() e incrementamos 1 minuto
        System.out.println("\n\nIncrementado un minuto...\nIncrementado!");
        horaEs.inc();
        System.out.println(horaEs.toString());

    }
}