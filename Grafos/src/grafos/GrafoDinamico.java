/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author samaniw
 */
public class GrafoDinamico {

    private HashMap<String, LinkedList<NodoPeso>> listaAdyacencia;

    public GrafoDinamico() {
        listaAdyacencia = new HashMap<>();
    }

    public void agregarNodo(String nombreNodo) {
        listaAdyacencia.putIfAbsent(nombreNodo, new LinkedList<NodoPeso>());
    }

    public void agregarArco(String origen, String destino, int peso) {
        listaAdyacencia.get(origen).add(new NodoPeso(destino, peso));
    }

    private String vecinos(String origen) {
        LinkedList<NodoPeso> datos;
        datos = listaAdyacencia.get(origen);
        String v = "";
        for (NodoPeso n : datos) {
            v += n.getNodo() + n.getPeso() + " ";
        }
        return v;
    }

    public String mostrarListaAdyacencia() {
        String datos = "";
        for (String nodo : listaAdyacencia.keySet()) {
            datos += nodo + ": " + vecinos(nodo);
            datos += "\n";
        }
        return datos;
    }
    
    public HashMap<String, NodoPeso> Dijkstra(String origen){
    /*
        Crear un mapa de recorrido, considerando vértice de destino, peso total y vértice de origen donde el peso desde el origen es cero, los demás son infinitos(desconocidos).
    */
        HashMap<String, NodoPeso> mapa = new HashMap<>();
        NodoPeso dato;
        for (String nodo : listaAdyacencia.keySet()) {
            if(nodo.equals(origen)){
                dato = new NodoPeso(null, 0);
            }else{
                dato = new NodoPeso(null, Integer.MAX_VALUE);
            }
            mapa.putIfAbsent(nodo, dato);
        }
        
    /*
        Crear una cola priorizada donde se almacenan vértices a donde llegar y su respectivo peso.						
    */
        
        PriorityQueue<NodoPeso> colaPriorizada = new PriorityQueue<>();
    /*
        Definir un punto de referencia (vértice actual y peso actual: cero) y agregarlo a la cola priorizada. 
    */    
       int pesoActual = 0, pesoRecorrido;
       colaPriorizada.add(new NodoPeso(origen, pesoActual));
       
    /*
       Generar un arreglo de vértices visitados.						
    */
    
        LinkedList<String> visitados = new LinkedList<>();
        
    /*
        Mientras la cola priorizada no esté vacía:						
    */
        while(!colaPriorizada.isEmpty()){
        
        }
        
        return mapa;
    }
}
