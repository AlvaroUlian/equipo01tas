/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.parcial;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.IElementoAB;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.util.CalculadorMatricesOptimo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

/**
 *
 * @author nnavarro
 */
public class Main
{

    public static void main(String[] args)
    {
        String[] lineas = ManejadorArchivosGenerico.leerArchivo("palabras.txt");
        int cantElementos = lineas.length;

        CalculadorMatricesOptimo abo = new CalculadorMatricesOptimo(cantElementos);
        String[] claves = new String[cantElementos+1]; // COMPLETAR: Asignar el tamaño correcto al vector de claves
        int[] frecExito = new int[cantElementos+1]; // COMPLETAR: Asignar el tamaño correcto al vector de frecuencias de exito
        int[] frecNoExito = new int[cantElementos+1]; // COMPLETAR: Asignar el tamaño correcto al vector de frecuencias de no exito

        for (int i = 0; i < cantElementos; i++)
        {
            String[] datos = lineas[i].split(" ");
            String klave = datos[0].trim();
            int valorFrecExito = Integer.parseInt(datos[1]);
             System.out.println(klave);
            System.out.println(i+1+"\n");
            claves[i+1] = klave;
            frecExito[i+1] = valorFrecExito;
            // COMPLETAR: Asignar al vector de claves y al vector frecExito los valores correspondientes 
            
        }
        System.out.println("\n");
        System.out.println("\n");
        String[] lineas2 = ManejadorArchivosGenerico.leerArchivo("nopalabras.txt");
        for (int i = 0; i <= cantElementos; i++)
        {
            int valorFrecNoExito = Integer.parseInt(lineas2[i]);
            frecNoExito[i] = valorFrecNoExito;
            // COMPLETAR: Asignar al vector de frecuencias de no éxito el valor correspondiente
        }
        System.out.println("\n");
        System.out.println("\n");

        // COMPLETAR: Encontrar el árbol óptimo
        // COMPLETAR: Armar el árbol óptimo
        
        TArbolBB arbolOptimo = new TArbolBB();
        CalculadorMatricesOptimo calMatOpt_1 = new CalculadorMatricesOptimo(cantElementos);
        calMatOpt_1.encontrarOptimo(cantElementos, frecExito, frecNoExito);
        calMatOpt_1.armarArbolBinario(0,cantElementos, claves, arbolOptimo);
        arbolOptimo.calcularCosto(frecExito, frecNoExito);
        
        // COMPLETAR: Calcular los costos para cada TElemento del árbol
        
        String clave1 = "int";
        IElementoAB elementoBuscado1 = arbolOptimo.buscar(clave1);
        if (elementoBuscado1 != null){
            System.out.println("Busco el elemento en el ABB OPTIMO para confirmar inserción "+elementoBuscado1.getEtiqueta());
        }
        
        String clave2 = "def";
        IElementoAB elementoBuscado2 = arbolOptimo.buscar(clave2);
        if (elementoBuscado2 != null){
            System.out.println("Busco el elemento en el ABB OPTIMO para confirmar inserción "+elementoBuscado2.getEtiqueta());
        }
        
        String clave3 = "import";
        arbolOptimo.buscar(clave3);
        IElementoAB elementoBuscado3 = arbolOptimo.buscar(clave3);
        if (elementoBuscado3 != null){
            System.out.println("Busco el elemento en el ABB OPTIMO para confirmar inserción "+elementoBuscado3.getEtiqueta());
        }
       
        String clave4 = "private";
        arbolOptimo.buscar(clave4);
        IElementoAB elementoBuscado4 = arbolOptimo.buscar(clave4);
        if (elementoBuscado4 != null){
            System.out.println("Busco el elemento en el ABB OPTIMO para confirmar inserción "+elementoBuscado4.getEtiqueta());
        }

        
        // COMPLETAR: Obtener el valor del costo para cada clave dada
        // COMPLETAR: Emitir por pantalla en el formato requerido los valores obtenidos
        
        long costoClave1 = arbolOptimo.obtenerCosto(clave1);
        System.out.println(costoClave1);
        long costoClave2 = arbolOptimo.obtenerCosto(clave2);
        System.out.println(costoClave2);
        long costoClave3 = arbolOptimo.obtenerCosto(clave3);
        System.out.println(costoClave3);
        long costoClave4 = arbolOptimo.obtenerCosto(clave4);
        System.out.println(costoClave4);
        
        System.out.println("FIN EJECUCIÓN");
    }
}
