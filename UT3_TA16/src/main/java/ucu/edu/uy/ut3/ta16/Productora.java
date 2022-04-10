/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

import ucu.edu.uy.tda.ILista;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.ListaOrdenada;
import ucu.edu.uy.tda.Nodo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

/**
 *
 * @author nnavarro
 */
public class Productora
{

    public static final String ARCHIVO_PELIS = "peliculas.csv";
    public static final String ARCHIVO_PERSONAS = "personas.csv";
    public static final String ARCHIVO_PERSONAS_EN_PELIS = "pers_participa_peli.csv";

    public ILista<Pelicula> listaPeliculas = new Lista<>();
    public ILista<Participante> listaPersonas = new Lista<>();


    public void cargarDatos()
    {
        String[] altasPeliculas = ManejadorArchivosGenerico.leerArchivo(ARCHIVO_PELIS);
        String[] altasPersonas = ManejadorArchivosGenerico.leerArchivo(ARCHIVO_PERSONAS);
        String[] altasPersonasEnPelis = ManejadorArchivosGenerico.leerArchivo(ARCHIVO_PERSONAS_EN_PELIS);
        
        for (int i = 0; i < altasPeliculas.length; i++){
           String[] linea = altasPeliculas[i].split(",");
           Pelicula pelicula = new Pelicula(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3]), linea[4], linea[5]);
           Nodo<Pelicula> nodoPeliculas = new Nodo<>(pelicula.getId(),pelicula);
           listaPeliculas.insertar(nodoPeliculas);
         }
        for (int i = 0; i < altasPersonas.length; i++){
           String[] linea = altasPersonas[i].split(",");
           Participante persona = new Participante(Integer.parseInt(linea[0]), linea[1]);
           Nodo<Participante> nodoPersona = new Nodo<>(Integer.parseInt(linea[0]),persona);
           listaPersonas.insertar(nodoPersona);
         }
        /*
        for (int i = 0; i < altasPersonasEnPelis.length; i++){
           String[] linea = altasPersonas[i].split(",");
           pelicula = listaPeliculas.buscar(linea[1]);
           persona = listaPersonas.buscar(linea[0])
           if(pelicula && persona){
              pelicula.agregarParticipante // Agregarle una lista de nodos paticipante a cada peli ? 
           }
           
        */
         }        
        
        public ILista<Participante> obtenerParticipantesPelicula(Comparable idPelicula)
    {
        // Implementar método
        return null;
        // Implementar método
    }

    public ILista<Pelicula> obtenerPeliculasDelParticipante(Comparable idParticipante)
    {
        
        // Implementar método
        return null;
        
        // Implementar método
    }
        
 }

    

