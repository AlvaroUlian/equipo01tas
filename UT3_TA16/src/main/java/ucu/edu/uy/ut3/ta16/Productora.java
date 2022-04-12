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
    public ILista<Participante> listaPersonas = new Lista<>(); //lista de todas las personas.


    public void cargarDatos()
    {
        String[] altasPeliculas = ManejadorArchivosGenerico.leerArchivo(ARCHIVO_PELIS);
        //String[] altasPersonas = ManejadorArchivosGenerico.leerArchivo(ARCHIVO_PERSONAS);
        //String[] altasPersonasEnPelis = ManejadorArchivosGenerico.leerArchivo(ARCHIVO_PERSONAS_EN_PELIS);
        System.out.println("Hay "+altasPeliculas.length+" cantidad de PELICULAS leídas \n");
        
        for (int i = 0; i < altasPeliculas.length; i++){
           System.out.println("+1 pelicula listada...");
           String[] linea = altasPeliculas[i].split(",");
           Pelicula pelicula = new Pelicula(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3]), linea[4], linea[5]);
           Nodo<Pelicula> nodoPeliculas = new Nodo<>(pelicula.getId(),pelicula);
           listaPeliculas.insertar(nodoPeliculas);
         }
        
        /*
        ///ESTA FUNCIONANDO 
        
        for (int i = 0; i < altasPersonas.length; i++){
           String[] linea = altasPersonas[i].split(",");
           Participante persona = new Participante(Integer.parseInt(linea[0]), linea[1]);
           Nodo<Participante> nodoPersona = new Nodo<>(Integer.parseInt(linea[0]),persona);
           listaPersonas.insertar(nodoPersona);
         }
        
        for (int i = 0; i < altasPersonasEnPelis.length; i++){
           String[] linea = altasPersonas[i].split(",");
           
            INodo<Pelicula> nodoPelicula = listaPeliculas.buscar(Integer.parseInt(linea[1]));
            Nodo<Participante> nodoParticipante = listaPersonas.buscar(Integer.parseInt(linea[0]));
            
           if((nodoPelicula!= null) && (nodoParticipante!= null)){ //Si existe la pelicula y la persona
             Pelicula pelicula = nodoPelicula.getDato();
             pelicula.agregarParticipante(nodoParticipante);
           }
        }
        */
    }
    
    public ILista<Participante> obtenerParticipantesPelicula(Comparable idPelicula)
    {
        INodo<Pelicula> nodoPelicula = listaPeliculas.buscar(idPelicula);
        if (nodoPelicula != null){
            Pelicula pelicula = nodoPelicula.getDato();
            
            return pelicula.getListaParticipantes();
        }
        return null;
    }

    public ILista<Pelicula> obtenerPeliculasDelParticipante(Comparable idParticipante)
    {
        INodo<Pelicula> nodoPelicula = listaPeliculas.getPrimero();
        ILista<Pelicula> PeliculasParticipante = new Lista();
        
        while(nodoPelicula != null){
            Pelicula pelicula = nodoPelicula.getDato();
            INodo<Participante> nodoParticipante = pelicula.getListaParticipantes().buscar(idParticipante); //busca el pareticipante en cada pelicula
            
            if (nodoParticipante != null){
                Participante participante = nodoParticipante.getDato();
                Nodo nodoPeliculasParticipante = new Nodo(pelicula.getId(),pelicula);
                PeliculasParticipante.insertar(nodoPeliculasParticipante);
                
            }
        }
        return PeliculasParticipante;
        
    }
        
 }

    

