package com.mycompany.ut3_ta7;

public class Lista<T> implements ILista<T>
{

    private Nodo<T> primero;

    public Lista()
    {
        primero = null;
    }

    @Override
    public boolean insertar(Nodo<T> unNodo)
    {
        if (primero == null){
            this.primero = unNodo;
            return true;
        }
        else{
            unNodo.setSiguiente(primero);
            primero = unNodo;
            return true;
        }
    }

    @Override
    public Nodo<T> buscar(Comparable etiqueta)
    {
        if (this.primero == null){
           return null; 
        }
        else{
            Nodo<T> actual = primero;
            while (actual != null){
                
                if (actual.getEtiqueta() == etiqueta){
                    return actual;
                }
                actual = actual.getSiguiente();
            }
            return null;
        }
    }
    @Override
    public boolean eliminarCabeza() {
        
        if (primero != null){
            primero = primero.getSiguiente();
            return true;
        }
        return false;
    }
    
    
    @Override
    public boolean eliminarPorClave(Comparable clave)
    {
        if (esVacia())
        {
            return false;
        }
        if (primero.getSiguiente() == null)
        {
            if (primero.getEtiqueta().equals(clave))
            {
                primero = null;
                return true;
            }
        }
        Nodo<T> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0)
        {
            //Eliminamos el primer elemento
            Nodo<T> temp1 = aux;
            Nodo<T> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null)
        {
            if (aux.getSiguiente().getEtiqueta().equals(clave))
            {
                Nodo<T> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public void imprimir()
    {
        //String aux = "";
        if (!esVacia())
        {
            Nodo<T> temp = primero;
            while (temp != null)
            {
                temp.imprimirEtiqueta();
                temp.imprimir();
                temp = temp.getSiguiente();
            }
        }
        //return aux;
    }

    public String imprimir(String separador)
    {
        String aux = "";
        if (esVacia())
        {
            return "";
        }
        else
        {
            Nodo<T> temp = primero;
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null)
            {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    @Override
    public int cantElementos()
    {
        int contador = 0;
        if (esVacia())
        {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        }
        else
        {
            INodo aux = primero;
            while (aux != null)
            {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia()
    {
        return primero == null;
    }

    @Override
    public Nodo<T> getPrimero()
    {
        return primero;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo)
    {
        this.primero = unNodo;
    }


}
