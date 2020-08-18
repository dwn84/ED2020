/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

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
       miLista listica = new miLista();
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
       listica.addOrdered(11);
       listica.addOrdered(8);
       listica.addOrdered(6);
       listica.addOrdered(13);
       listica.addOrdered(9);
       
        System.out.println(listica.showData());
    }
    
}
