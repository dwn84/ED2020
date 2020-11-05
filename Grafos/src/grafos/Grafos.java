/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author samaniw
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrafoN miniGrafo = new GrafoN(6);
        miniGrafo.agregarArco(0, 1);
        miniGrafo.agregarArco(0, 2);        
        miniGrafo.agregarArco(1, 3);
        miniGrafo.agregarArco(2, 3);
        miniGrafo.agregarArco(2, 4);
        miniGrafo.agregarArco(3, 4);
        miniGrafo.agregarArco(3, 5);
        miniGrafo.agregarArco(4, 5);
        System.out.println("Matriz de adyacencia");
        System.out.println(miniGrafo.mostrarMatriz());
        System.out.println("Lista de adyacencia");
        System.out.println(miniGrafo.mostrarListaAdyacencia());
        System.out.println("Lista de arcos");
        System.out.println(miniGrafo.mostrarArcos());
        System.out.println("Recorrido en anchura");
        miniGrafo.recorridoAnchura(0);
        System.out.println("");
        System.out.println("Recorrido en profundidad");
        miniGrafo.recorridoProfundidad(0);
        System.out.println("");
        
        //Ejemplo de mapa en Java: equivalente a diccionario en python/C# o arreglo asociativo en PHP
        double x= Double.MAX_VALUE;
        System.out.println(x);
        HashMap<String,Integer>  mapa = new HashMap<>();
        mapa.put("A",111);
        mapa.put("B",222);
        mapa.put("C",333);
        mapa.put("D",444);
        mapa.put("E",432);
        mapa.put("G",566);
        mapa.put("Y",566);
       
        
        System.out.println("Mostrar las llaves del mapa");
        System.out.println(mapa.keySet().toString());
        
        
        for(String llave:mapa.keySet()){
        
            System.out.println(llave + ": "+ mapa.get(llave));
        }
        
        PriorityQueue<Integer> cp = new PriorityQueue<>();
        cp.add(77);
        cp.add(88);
        cp.add(66);
        cp.add(55);
        cp.add(60);
        cp.remove();
        System.out.println(cp);
    }

}
