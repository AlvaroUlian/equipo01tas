package ucu.edu.uy.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManejadorArchivosGenerico
{

    /**
     * @param nombreCompletoArchivo
     * @param listaLineasArchivo lista con las lineas del archivo
     * @throws IOException
     */
    public static void escribirArchivo(String nombreCompletoArchivo,
            String[] listaLineasArchivo)
    {
        FileWriter fw;
        try
        {
            fw = new FileWriter(nombreCompletoArchivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++)
            {
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println("Error al escribir el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public static String[] leerArchivo(String nombreCompletoArchivo)
    {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<String>();
        try
        {
            fr = new FileReader(nombreCompletoArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            boolean primeraLinea = true;
            System.out.println("********Manejador comienza armar array*********");
            while (lineaActual != null) 
            {
                if (primeraLinea != true){            //No agregar primer linea
                  listaLineasArchivo.add(lineaActual);
                  lineaActual = br.readLine();  
                }
                else{lineaActual = br.readLine();    //No agregar primer linea
                    primeraLinea = false;
                }
                
            }
            
            br.close();
            fr.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error al leer el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("Error al leer el archivo "
                    + nombreCompletoArchivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");

        return listaLineasArchivo.toArray(new String[0]);
    }
}
