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
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario navidad = new ArbolBinario(11);
        navidad.getRaiz().setDerecha(new NodoBinario((22)));
        navidad.getRaiz().setIzquierda(new NodoBinario((33)));
        navidad.getRaiz().getDerecha().setIzquierda(new NodoBinario((44)));
        navidad.getRaiz().getDerecha().setDerecha(new NodoBinario((55)));
        System.out.println("Verificar hoja: "+ navidad.getRaiz().getDerecha().verificarHoja());
    }
    
}
