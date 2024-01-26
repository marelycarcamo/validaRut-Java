/* Este programa valida el número de rut chileno  */

package com.marely.validarut;
import java.util.Scanner;

/**
 *
 * @author marely
 */
/**
 * The ValidaRut class in Java prompts the user to enter a Chilean national identification number (RUT)
 * and validates whether it is a valid RUT or not.
 */
public class ValidaRut {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String rut;

            while (true) {
                System.out.println("Ingrese rut: ");
                rut = scanner.nextLine();
                if (validarDato(rut)) {
                    System.out.println(validarRut(rut.split("-")[0],rut.split("-")[1].toUpperCase()) ? "verdadero" : "falso");
                    break;
                } else {
                    System.out.println("Ingrese un numero de rut válido");
                }
            }
        }
    }

    /*
    Este método valida el dato ingresado, verificando si corresponde al formato establecido, para posteriormente realizar el proceso de validación.
     */
   /**
    * The function "validarDato" checks if a given string matches a specific pattern.
    * 
    * @param dato The parameter "dato" is a string that represents a data value.
    * @return The method is returning a boolean value.
    */
    public static boolean validarDato(String dato) {
        return dato.matches("^\\d{1,8}-[\\dKk]$");
    }

    /*
    El método valida el rut chileno
    se engresa como argumento el rut y el digito verificado y retorna un valor booleano
     */
   // The `validarRut` method is responsible for validating the Chilean national identification number
   // (RUT).
    public static boolean validarRut(String texto, String dvRut) {
        int pos = texto.length();
        int suma = 0;

        while (pos > 0) {
            for (int i = 2; i < 8; i++) {
                pos -= 1;
                suma += i * Integer.parseInt(String.valueOf(texto.charAt(pos)));
                if (pos == 0) {
                    break;
                }
            }
        }
        int d = 11 - (suma % 11);
        String dv = (d == 10) ? "K" : ((d == 11) ? "0" : String.valueOf(d));
        System.out.println("rut: " + texto + "-" + dv);
        return dv.equals(dvRut);
    }
}
