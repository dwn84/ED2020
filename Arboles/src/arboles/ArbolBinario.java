/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 * Arbol de búsqueda binaria
 *
 * @author samaniw
 */
public class ArbolBinario {

    private NodoBinario raiz;
    private int nodos;
    private boolean posicion;

    public ArbolBinario() {
        raiz = null;
        nodos = 0;
    }

    public ArbolBinario(int dato) {
        this.raiz = new NodoBinario(dato);
        nodos = 1;
    }

    /**
     * @return the raiz
     */
    public NodoBinario getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoBinario raiz) {
        this.raiz = raiz;
    }

    /**
     * @return the nodos
     */
    public int getNodos() {
        return nodos;
    }

    /**
     * Busca el dato
     *
     * @param dato
     * @param nodoActual
     * @return null si no lo encuentra, si lo encuentra retorna el nodo
     */
    public NodoBinario Buscar(int dato) {
        return BuscarRecursivamente(dato, raiz);
    }

    private NodoBinario BuscarRecursivamente(int dato, NodoBinario nodoActual) {
        /*https://visualgo.net/en/bst
        
      if this == null

        return null

      else if this key == search value

        return this

      else if this key < search value

        search right

      else search left
         */
        //casos base
        System.out.println("");
        if (nodoActual == null) {
            return null;
        } else if (dato == nodoActual.getDato()) {
            return nodoActual;
        } else if (dato > nodoActual.getDato()) {
            posicion = true;
            return BuscarRecursivamente(dato, nodoActual.getDerecha());
        } else {
            posicion = false;
            return BuscarRecursivamente(dato, nodoActual.getIzquierda());

        }

    }

    public void AgregarDato(int dato) {
        if (raiz == null) {
            raiz = new NodoBinario((dato));
        }//validar si el dato existe
        else if (Buscar(dato) != null) {
            System.out.println("Dato duplicado, no se permiten valores repetidos");
        } else {
            AgregarDatoRecursivamente(dato, raiz);
        }
    }

    private void AgregarDatoRecursivamente(int dato, NodoBinario nodoActual) {
        if (dato < nodoActual.getDato()) {
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(new NodoBinario((dato)));
            } else {
                AgregarDatoRecursivamente(dato, nodoActual.getIzquierda());
            }
        } else if (nodoActual.getDerecha() == null) {
            nodoActual.setDerecha(new NodoBinario((dato)));
        }else{
            AgregarDatoRecursivamente(dato,nodoActual.getDerecha());
        }
    }
}
