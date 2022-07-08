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
        int i, j, k, kraiz, h;
        int min, PesoSubArboles;

        //wii = bii y pii = wii
        for (i = 0; i < cantElem + 1; i++)
        {
            W[i][i] = frecNoExito[i];
            P[i][i] = W[i][i]; // h = 0
        }

        // wij = wii+ aj + bj
        for (i = 0; i < cantElem; i++)
        {
            for (j = i + 1; j < cantElem + 1; j++)
            {
                W[i][j] = W[i][j - 1] + frecExito[j] + frecNoExito[j];
            }
        }

        // h = 1 pij = wij + pii + pjj
        for (i = 0; i < cantElem; i++)
        {
            j = i + 1;
            P[i][j] = W[i][j] + P[i][i] + P[j][j];
            R[i][j] = j;
        }

        // h = 2 hasta h = n
        kraiz = 0;
        for (h = 2; h < cantElem + 1; h++)
        {

            for (i = 0; i < cantElem - h + 1; i++)
            {
                j = i + h;
                min = Integer.MAX_VALUE;

                for (k = i + 1; k < j + 1; k++)
                {
                    PesoSubArboles = P[i][k - 1] + P[k][j];
                    if (PesoSubArboles <= min)
                    {
                        min = PesoSubArboles;
                        kraiz = k;
                    }
                }

                P[i][j] = min + W[i][j];
                R[i][j] = kraiz;
            }
        }
    }

    /**
     *
     * @param i
     * @param j
     * @param Claves
     * @param elArbolBB
     */
    @Override
    public void armarArbolBinario(int i, int j, String[] Claves, IArbolBB elArbolBB)
    {

        IElementoAB<Comparable> unNodo;
        int unaraiz;
        if (i < j)
        {
            unaraiz = R[i][j];
            unNodo = new TElementoAB(Claves[unaraiz], Claves[unaraiz]);
            elArbolBB.insertar(unNodo);
            armarArbolBinario(i, unaraiz - 1, Claves, elArbolBB);
            armarArbolBinario(unaraiz, j, Claves, elArbolBB);
        }
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
