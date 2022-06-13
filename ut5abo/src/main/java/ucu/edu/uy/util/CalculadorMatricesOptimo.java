package ucu.edu.uy.util;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.IElementoAB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author Ernesto
 */
public class CalculadorMatricesOptimo implements ICalculadorMatricesOptimo
{

    public final int[][] W;
    public final int[][] P;
    public final int[][] R;

    public CalculadorMatricesOptimo(int cantElem)
    {
        W = new int[cantElem + 1][cantElem + 1];
        P = new int[cantElem + 1][cantElem + 1];
        R = new int[cantElem + 1][cantElem + 1];
    }

    @Override
    public void encontrarOptimo(int cantElem, int[] frecExito, int[] frecNoExito)
    {
        //Integer[][] w = new Integer[cantElem][cantElem];
        //Integer[][] p = new Integer[cantElem][cantElem];
        
        int i;
        int min = Integer.MAX_VALUE;
        int raiz;
        
        
        // wii = bii y pii = wii
        
        for(i=0;i<=cantElem;i++){  // Completamos diagonales de Matriz W y Matriz P.
            W[i][i] = frecNoExito[i];
            P[i][i] = frecNoExito[i];
        }
        
        
        for(i=0;i <= cantElem;i++){ // Completa la Matriz W
            for(int j = 1;j<=cantElem;j++){
                W[i][j] = W[i][j-1] + frecExito[j] + frecNoExito[j];
            }
        }
        
        for(i=0;i <= cantElem;i++){ // Completa la segunda diagonal de P
            int j = i + 1;
            P[i][j] = P[i][i] + P[j][j];
            }
        
        //Para h >= 2 hasta h = n
        for(int h = 2; h < cantElem +1; h++) {
            int j = 0;
            raiz = 0;

            for (int l = 0; l < cantElem -h+1; l++) {
                j = h + 1;
                for (int k = l+1; k < j+1; k++) {
                    int peso = P[i][k-1] + P[k][j];
                    if (peso <= min) {
                        min = peso;
                        raiz = k;
                    }
                }
            }
            P[i][j] = min + W[i][j];
            R[i][j] = raiz;
        }
        
        
        //int i, j, k, kraiz, h;
        //int min, PesoSubArboles;

        
        
        
        // wij = wii+ aj + bj
        
        
        // h = 1 pij = wij + pii + pjj
        
        
        // h = 2 hasta h = n
        //kraiz = 0;
        
        /**
     *
     * @param i - 
     * @param j
     * @param Claves
     * @param elArbolBB
     */
        
    }
     
      

    
    @Override
    public void armarArbolBinario(int i, int j, String[] Claves, IArbolBB elArbolBB)
    {
        
    }

    public static void imprimirMatriz(int[][] matriz)
    {
        System.out.println();

        for (int[] matriz1 : matriz)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }

    public void printR()
    {
        imprimirMatriz(R);
    }

    public void printW()
    {
        imprimirMatriz(W);
    }

    public void printP()
    {
        imprimirMatriz(P);
    }
}
