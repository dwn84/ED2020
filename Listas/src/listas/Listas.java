/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author samaniw
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ListaDoble lista2 = new ListaDoble();
        lista2.addLast(55);
        lista2.addLast(66);
        lista2.addLast(77);
        lista2.addLast(88);
        lista2.addLast(99);
//        lista2.add(55);
//        lista2.add(66);
//        lista2.add(77);
//        lista2.add(88);
//        lista2.add(33);
        System.out.println("Datos de la lista doble asc: " + lista2.showData());
        System.out.println("Datos de la lista doble desc: " + lista2.showDataDesc());

        lista2.delete();

        lista2.delete();
        System.out.println("Datos de la lista doble: " + lista2.showData());

//        ArrayList<String> data = new ArrayList<>();
//        ArrayList<Integer> edades = new ArrayList<>();
//        ArrayList<Double> notas = new ArrayList<>();
//        ArrayList<Node> misNodos = new ArrayList<>();
//        miLista listica = new miLista();
//       listica.add(55);
//       listica.add(66);
//       listica.add(77);
//       listica.add(88);
//       listica.add(99);
//       listica.add(101);
//       listica.add(111);
//       listica.add(121);
//       listica.add(131);
//       listica.add(8);
//        listica.addOrdered(11);
//        listica.addOrdered(8);
//        listica.addOrdered(6);
//        listica.addOrdered(13);
//        listica.addOrdered(9);
//
//        System.out.println(listica.showData());
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        listica.delete();
//        System.out.println("");
//
//        System.out.println(listica.showData());
    }

}
