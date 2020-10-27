/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

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
        GrafoN miniGrafo = new GrafoN(4);
        miniGrafo.agregarArco(0, 2);
        miniGrafo.agregarArco(0, 3);
        miniGrafo.agregarArco(2, 3);
        miniGrafo.agregarArco(1, 2);
        System.out.println("Matriz de adyacencia");
        System.out.println(miniGrafo.mostrarMatriz());
        System.out.println("Lista de adyacencia");
        System.out.println(miniGrafo.mostrarListaAdyacencia());
        System.out.println("Lista de arcos");
        System.out.println(miniGrafo.mostrarArcos());
        System.out.println("Recorrido en anchura");
        miniGrafo.recorridoAnchura(0);
    }
    
}
