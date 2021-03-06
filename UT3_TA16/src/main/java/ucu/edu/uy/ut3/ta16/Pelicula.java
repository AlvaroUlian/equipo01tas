/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut3.ta16;

import ucu.edu.uy.tda.ILista;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.Nodo;


/**
 *
 * @author nnavarro
 */
public class Pelicula
{
    private ILista<Participante> listaParticipantes = new Lista<>();
    
    private int id;
    private String nombre;
    private int anio;
    private int score;
    private String genero;
    private String idiomaOriginal;

    public Pelicula()
    {
    }

    public Pelicula(int id, String nombre, int anio, int score, String genero, String idiomaOriginal)
    {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.score = score;
        this.genero = genero;
        this.idiomaOriginal = idiomaOriginal;
    }
    
    public void agregarParticipante(Nodo<Participante> nodo){
        Nodo nuevoNodo = nodo.clonar(); //Clona el nodo que contiene la persona.
        listaParticipantes.insertar(nuevoNodo); //Insertarlo en la lista participantes de la peli.
        
    }
    public ILista<Participante> getListaParticipantes(){
       return this.listaParticipantes;
    } 
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getAnio()
    {
        return anio;
    }

    public void setAnio(int anio)
    {
        this.anio = anio;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getIdiomaOriginal()
    {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal)
    {
        this.idiomaOriginal = idiomaOriginal;
    }

    

}
