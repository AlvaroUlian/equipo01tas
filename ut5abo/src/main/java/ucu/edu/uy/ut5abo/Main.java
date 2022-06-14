/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut5abo;

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
public class Main
{

    public static void main(String[] args)
    {
        IArbolBB arbol = new TArbolBB();
        String[] claves;
        String[] frecExito;
        String[] frecNoExito;
        
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("palabras.txt");
        
        for (String linea : archivo) {
            String[] auxLinea = linea.split(",");
            x
            //claves += auxLinea[0];
            IElementoAB elem = new TElementoAB(auxLinea[0], auxLinea[0]);  //???????
            //llenar frecExito y frecNoExito !!!!
            arbol.insertar(elem);
        }
        
    }
}
