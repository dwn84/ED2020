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

    public miLista() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int n) {
        Node newNode = new Node(n);
        newNode.setNextNode(head);
        head = newNode;
    }

    public String showData() {
        String data = "";
        if (isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            Node current = head;
            while (current != null) {
                data += current.getData() + " - ";
                current = current.getNextNode();
            }
        }
        return data;
    }

    public void addOrdered(int d) {
        //Crear un nodo para el nuevo dato.
        Node newNode = new Node(d);
        /*
            Si la lista esta vacía, o el valor del primer elemento 
            de la lista es mayor que el nuevo, 
            insertar el nuevo nodo en la primera posición de la lista 
            y modificar la cabecera respectivamente.
         */
        if (isEmpty() || head.getData() > newNode.getData()) {
            newNode.setNextNode(head);
            head = newNode;
        } else {
            /*
        Si no se cumple el caso anterior,
        buscar el lugar adecuado para la inserción: 
        recorrer la lista conservando el nodo actual. 
        Inicializar nodo actual con el valor de primera posición, 
        y avanzar mientras el siguiente nodo no sea nulo 
        y el dato que contiene la siguiente posición 
        sea menor o igual que el dato a insertar(nuevo nodo).
        Con esto se seña al nodo adecuado, 
        a continuación insertar el nuevo nodo a continuación de él.
             */
            Node current = head;

            while (current.getNextNode() != null 
                    && current.getNextNode().getData()<=newNode.getData()) {
                //avanzar
                current = current.getNextNode();
            }
            
            //El nuevo dato debe ir a continuación del actual (current)
            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);          
        }
    }
    
    //borrar el primer dato de la lista
    public void delete(){
        if(isEmpty()){
            System.out.println("No existen datos a borrar");
        }else{
            head = head.getNextNode();
        }
    }
    
    //borrar el último elemento
    public Node deleteLast(){
        if(isEmpty()){
            System.out.println("No existen datos a borrar");
            return null;
        //validar si existe un solo dato
        }else if(head.getNextNode()==null){
            Node temp = head;
            head = null;       
            return temp;
        }else{
            Node temp = head;
            Node current = head;
            while(current.getNextNode().getNextNode()!=null){
                current = current.getNextNode();
                temp = current;
            }
            current.setNextNode(null);
            return temp;
        }
    
    }
    
}
