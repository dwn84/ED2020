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
public class Recursividad {
    
    public int sumatoria(int n){
        System.out.println("");
        if(n==1){
            return 1;
        }else{
            System.out.println("");
            return n + sumatoria(n-1);
        }
    }   
}
