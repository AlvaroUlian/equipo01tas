/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut5abo;

import java.util.ArrayList;
import java.util.Collections;
import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.CalculadorMatricesOptimo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

/**
 *
 * @author nnavarro
 */
public class ut5abo{

    public static void main(String[] args)
    {
        
        String[] palabras = ManejadorArchivosGenerico.leerArchivo("palabras.txt");
        String[] noPalabras = ManejadorArchivosGenerico.leerArchivo("nopalabras.txt");
        TArbolBB arbol = new TArbolBB();
        
        int cantElem = palabras.length;
        String[] claves = new String[cantElem+1];
        
        for (int clave = 0; clave<=cantElem; clave++){
            claves[clave] = Integer.toString(clave);
        }
        
        int[] frecExito = new int[cantElem+1];
        int[] frecNoExito = new int[cantElem+1];

        int index = 1;
        for (String palabra : palabras){
                frecExito[index] = Integer.parseInt(palabra.split(" ")[1]);
                index++;
        }
        
        index = 0;
        for (String noPalabra : noPalabras){
                frecNoExito[index] = Integer.parseInt(noPalabra);
                index++;
        }
                
        
        /*
        int cantElem = 4;
        
        int[] frecExito = new int[5]; //Vector frecuencias de Exito.
        frecExito[1]=5;
        frecExito[2]=3;
        frecExito[3]=4;
        frecExito[4]=2;

        int[] frecNoExito = new int[5]; //Vector frecuencias de NO Exito.
        frecNoExito[0]=1;
        frecNoExito[1]=3;
        frecNoExito[2]=1;
        frecNoExito[3]=3;
        frecNoExito[4]=7;
        */
        
        //UT5_TA15
        //Shuffle de claves
        ArrayList arrayClaves = new ArrayList();
        for (String elementos : claves) {
            arrayClaves.add(elementos);
        }
        Collections.shuffle(arrayClaves);
        
        //Insertar en Arbol BB
        for (String linea : palabras) {
            String[] auxLinea = linea.split(",");
            IElementoAB elemento = new TElementoAB(auxLinea[0], auxLinea[0]);
            arbol.insertar(elemento);
        }
        
        
        //armar arbol optimo
        IArbolBB arbolOptimo = new TArbolBB();
        
        CalculadorMatricesOptimo calMatOpt_1 = new CalculadorMatricesOptimo(cantElem);
        calMatOpt_1.encontrarOptimo(cantElem, frecExito, frecNoExito);
        calMatOpt_1.armarArbolBinario(0,cantElem, claves, arbolOptimo);
        
        
        
        //Probar listaDatosNivelMasProfundo
        System.out.println("Lista de Datos Nivel mas Profundo:");
        arbol.listaDatosNivelMasProfundo().imprimir();
        System.out.println("-------------");
        
        //Probar Lti
        System.out.println("Longitud de Trayectoria Interna:");
        System.out.println(arbol.Lti());
        System.out.println("-------------");
    }
}
