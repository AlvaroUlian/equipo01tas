package ucu.edu.uy.tda;

public class TElementoAB<T> implements IElementoAB<T>
{

    private final Comparable etiqueta;
    private IElementoAB hijoIzq;
    private IElementoAB hijoDer;
    private T datos;
    private int costo;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    public TElementoAB(Comparable unaEtiqueta, T unosDatos)
    {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }
    public int getCosto(){
        return this.costo;
    }

    public void setCosto(int costo){
        this.costo = costo;
    }

    @Override
    public IElementoAB<T> getHijoIzq()
    {
        return hijoIzq;
    }

    @Override
    public IElementoAB<T> getHijoDer()
    {
        return hijoDer;
    }
    
    public TElementoAB clonar(){
         return new TElementoAB<>(this.etiqueta, this.datos);
    }

    /**
     * @param unElemento
     * @return
     */
    @Override
    public boolean insertar(IElementoAB<T> unElemento)
    {
        if (unElemento.getEtiqueta().compareTo(etiqueta) < 0)
        {
            if (hijoIzq != null)
            {
                return getHijoIzq().insertar(unElemento);
            }
            else
            {
                hijoIzq = unElemento;
                return true;
            }
        }
        else if (unElemento.getEtiqueta().compareTo(etiqueta) > 0)
        {
            if (hijoDer != null)
            {
                return getHijoDer().insertar(unElemento);
            }
            else
            {
                hijoDer = unElemento;
                return true;
            }
        }
        else
        {
            // ya existe un elemento con la misma etiqueta.-
            return false;
        }
    }

    /**
     * @param unaEtiqueta
     * @return
     */
    @Override
    public IElementoAB<T> buscar(Comparable unaEtiqueta)
    {

        if (unaEtiqueta.equals(etiqueta))
        {
            return this;
        }
        else if (unaEtiqueta.compareTo(etiqueta) < 0)
        {
            if (hijoIzq != null)
            {
                return getHijoIzq().buscar(unaEtiqueta);
            }
            else
            {
                return null;
            }
        }
        else if (hijoDer != null)
        {
            return getHijoDer().buscar(unaEtiqueta);
        }
        else
        {
            return null;
        }
    }

    @Override
    public void inOrden(Lista<T> unaLista)
    {
        if (hijoIzq != null)
        {
            hijoIzq.inOrden(unaLista);
        }
        Nodo<T> unNodo = new Nodo<>(this.getEtiqueta(), this.getDatos());
        unaLista.insertar(unNodo);
        if (hijoDer != null)
        {
            hijoDer.inOrden(unaLista);
        }
    }

    /**
     * @return recorrida en preOrden del subArbol que cuelga del elemento actual
     */
    @Override
    public String preOrden()
    {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(imprimir());
        if (hijoIzq != null)
        {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoIzq().preOrden());
        }
        if (hijoDer != null)
        {
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            tempStr.append(getHijoDer().preOrden());
        }
        return tempStr.toString();
    }

    /**
     * @return recorrida en postOrden del subArbol que cuelga del elemento
     * actual
     */
    @Override
    public String postOrden()
    {
        StringBuilder tempStr = new StringBuilder();
        if (hijoIzq != null)
        {
            tempStr.append(getHijoIzq().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        if (hijoDer != null)
        {
            tempStr.append(getHijoDer().postOrden());
            tempStr.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        tempStr.append(imprimir());
        return tempStr.toString();
    }

    @Override
    public Comparable getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @return
     */
    public String imprimir()
    {
        return (etiqueta.toString()+costo);
    }

    @Override
    public T getDatos()
    {
        return datos;
    }

    public void setDatos(T datos)
    {
        this.datos = datos;
    }

    @Override
    public void setHijoIzq(IElementoAB<T> elemento)
    {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(IElementoAB<T> elemento)
    {
        this.hijoDer = elemento;
    }

    @Override
    public IElementoAB<T> eliminar(Comparable unaEtiqueta)
    {
        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0)
        {
            if (this.hijoIzq != null)
            {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }

        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0)
        {
            if (this.hijoDer != null)
            {
                this.hijoDer = hijoDer.eliminar(unaEtiqueta);

            }
            return this;
        }

        return quitaElNodo();
    }

    private IElementoAB<T> quitaElNodo()
    {
        if (hijoIzq == null)
        {    // solo tiene un hijo o es hoja
            return hijoDer;
        }

        if (hijoDer == null)
        { // solo tiene un hijo o es hoja
            return hijoIzq;
        }
// tiene los dos hijos, buscamos el lexicograficamente anterior
        IElementoAB<T> elHijo = hijoIzq;
        IElementoAB<T> elPadre = this;

        while (elHijo.getHijoDer() != null)
        {
            elPadre = elHijo;
            elHijo = elHijo.getHijoDer();
        }

        if (elPadre != this)
        {
            elPadre.setHijoDer(elHijo.getHijoIzq());
            elHijo.setHijoIzq(hijoIzq);
        }

        elHijo.setHijoDer(hijoDer);
        setHijoIzq(null);  // para que no queden referencias y ayudar al collector
        setHijoDer(null);
        return elHijo;
    }

    @Override
    public int altura()
    {
        int altIzq = -1;
        int altDer = -1;
        if (this.hijoIzq != null)
        {
            altIzq = this.hijoIzq.altura();
        }

        if (this.hijoDer != null)
        {
            altDer = this.hijoDer.altura();
        }

        return Math.max(altDer, altIzq) + 1;

    }

    @Override
    public int tamanio()
    {
        int tamSubArboles = 0;
        if (this.hijoIzq != null)
        {
            tamSubArboles += this.hijoIzq.tamanio();
        }

        if (this.hijoDer != null)
        {
            tamSubArboles += this.hijoDer.tamanio();
        }
        return tamSubArboles + 1;
    }

    @Override
    public int nivel(Comparable etiqueta, int nivel)
    {
        if (this.etiqueta.compareTo(etiqueta) == 0)
        {
            return nivel;
        }
        if (etiqueta.compareTo(this.etiqueta) < 0 && this.hijoIzq != null)
        {
            return this.hijoIzq.nivel(etiqueta, nivel + 1);
        }

        if (etiqueta.compareTo(this.etiqueta) > 0 && this.hijoDer != null)
        {
            return this.hijoDer.nivel(etiqueta, nivel + 1);
        }

        return -1;
    }

    @Override
    public long calcularCosto(int[] frecExito, int[] frecNoExito, int[] indiceFE, int[] indiceFNE, int nivel)
    {
        this.setCosto(nivel);
        int costo = 0;
        if (this.hijoIzq != null) {
            costo += this.hijoIzq.calcularCosto(frecExito, frecNoExito, indiceFE, indiceFNE, nivel + 1);
        }else{
            costo += frecNoExito[indiceFNE[0]] * nivel;
            indiceFNE[0]++;

        }
        
        costo += frecExito[indiceFE[0]] * (nivel+1);
        indiceFE[0]++;
        
        if (this.hijoDer != null) {
            costo += this.hijoDer.calcularCosto(frecExito, frecNoExito, indiceFE, indiceFNE, nivel + 1);
        }else{
            costo += frecNoExito[indiceFNE[0]] * nivel;
            indiceFNE[0]++;
        }
        return costo;
    }
    
    @Override
    public void listaDatosNivelMasProfundo(int nivel, Lista claves){
        if (nivel != 1) {
            if (this.hijoIzq != null) {
                this.hijoIzq.listaDatosNivelMasProfundo(nivel -1, claves);
            }
            if (this.hijoDer != null) {
                this.hijoDer.listaDatosNivelMasProfundo(nivel -1, claves);
            }
        }else{
            claves.insertar(new Nodo(this.getEtiqueta(), this.getDatos()));
        }
    }
    
    @Override
    public int Lti(int nivel){
        
        int nivelIzq = 0;
	int nivelDer = 0;
	if (this.hijoIzq != null){
            
            nivelIzq = this.hijoIzq.Lti(nivel + 1);
            
        }
        if (this.hijoDer != null){
            
            nivelDer = this.hijoDer.Lti(nivel + 1);
            
        }
	
	return nivelIzq + nivelDer + nivel;
    }

}
