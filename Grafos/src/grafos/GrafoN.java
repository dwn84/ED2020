/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class GrafoN {
    
    private boolean MatrizAdyacencia[][];
    private LinkedList<Integer> ListaAdyacencia[];

    /**
     * Grafo estático donde se predetermina la cantidad de nodos
     * @param n representa la cantidad total de nodos en la estructura
     */
    public GrafoN(int n) {
        MatrizAdyacencia = new boolean[n][n];
        ListaAdyacencia = new LinkedList[n];
        
        for (int i = 0; i < n; i++) {
            ListaAdyacencia[i]= new LinkedList<>();
        }
    }
    
    public void agregarArco(int origen, int destino){
        MatrizAdyacencia[origen][destino] = true;
        ListaAdyacencia[origen].add(destino);
    }
    
}
