/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ute_ta6;

/**
 *
 * @author facum
 */
public class UTE_TA6 {

    public static void main(String[] args) {
        Compilador compilador = new Compilador();
        if (compilador.controlCorchetes("{}{{}}")){
            System.out.println("Control de Corchetes CORRECTO");
        }
        else{System.out.println("Control de Corchetes INCORRECTO");}
    }
}
