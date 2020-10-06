/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author samaniw
 */
public class ArbolBinario {
    
    private NodoBinario raiz;
    private int nodos;

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


    
    
    
    
    
    
}
