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
public class miLista {
    private Node head;
    
    public miLista(){
        head = null;
    } 
    
    private boolean isEmpty(){
        return head==null;
    }
    
    public void add(int n){
        Node newNode = new Node(n);
        newNode.setNextNode(head);
        head = newNode;
    }
    
    public String showData(){
        String data="";
        if(isEmpty()){
            System.out.println("Lista vacia");
        }else{
            Node current = head;
            while(current!=null){
                data += current.getData() + " - ";
                current = current.getNextNode();
            }
        }
        return data;
    }
    
}
