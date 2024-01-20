/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
* Este programa valida el número de rut chileno
*/
package com.marely.validarut;

import java.util.Scanner;

/**
 *
 * @author marely
 */
public class ValidaRut {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dato;
            
            while (true) {
                System.out.println("Ingrese rut: ");
                dato = scanner.nextLine();
                if (validarDato(dato)) {
                    String nroRut = dato.split("-")[0];
                    String dvRut = dato.split("-")[1].toUpperCase();
                    System.out.println(validarRut(nroRut, dvRut) ? "verdadero" : "falso");
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
    public static boolean validarDato(String dato) {
        return dato.matches("^\\d{1,8}-[\\dKk]$");
    }
    /*
    El método valida el rut chileno
    se engresa como argumento el rut y el digito verificado y retorna un valor booleano
    */
    public static boolean validarRut(String texto, String dvRut) {
        int pos  = texto.length();
        int suma = 0;
      
       while (pos > 0){
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
        System.out.println("rut: " + texto + "-"+ dv);
        return dv.equals(dvRut);
    }
}
