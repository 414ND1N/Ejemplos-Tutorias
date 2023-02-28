package ListaSimple;

public class Nodo {
    //dato y sus apuntador (1 apuntador) (lista simple)
    public int dato;
    public Nodo next;

    //constructor
    public Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }
}
