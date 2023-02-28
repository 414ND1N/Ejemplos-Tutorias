package ListaDoble;

public class Nodo {
    //dato y sus 2 apuntadores (lista doble)
    public int dato;
    public Nodo prev;
    public Nodo next;

    //constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.prev = null;
        this.next = null;
    }

}
