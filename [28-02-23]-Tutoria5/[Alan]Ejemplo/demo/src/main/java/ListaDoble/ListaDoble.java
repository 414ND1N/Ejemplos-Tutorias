package ListaDoble;

public class ListaDoble {
    //Nodo que apuntan a cola y a cabeza de lista
    private Nodo head;
    private Nodo tail;

    //constructor
    public ListaDoble() {
        this.head = null;
        this.tail = null;
    }

    // tamaño de la lista
    public int size() {
        int count = 0;
        Nodo actual = head;
        while (actual != null) {
            count++;
            actual = actual.next;
        }
        return count;
    }

    //insertar al inicio
    public void insertFirst(int dato) {
        Nodo newNode = new Nodo(dato);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //insertar al final
    //Si se trabaja como cola solo se utiliza este tipo de insertar
    public void insertEnd(int dato) {
        Nodo newNodo = new Nodo(dato);
        if (head == null) {
            head = newNodo;
            tail = newNodo;
        } else {
            tail.next = newNodo;
            newNodo.prev = tail;
            tail = newNodo;
        }
    }

    // buscar
    public Nodo busqueda(int dato) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.dato == dato) {
                System.out.println("dato encontrado");
                return actual;
            }
            actual = actual.next;
        }
        System.out.println("dato no encontrado");
        return null;
    }

    //remover segun valor
    public void remove(int dato) {
        if (head == null) {
            return;
        }
        if (head.dato == dato) {
            head = head.next;
            head.prev = null;
            return;
        }
        if (tail.dato == dato) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        Nodo actual = head;
        while (actual != null) {
            if (actual.dato == dato) {
                actual.prev.next = actual.next;
                actual.next.prev = actual.prev;
                return;
            }
            actual = actual.next;
        }
    }

    //imprimir en orden ascendente
    public void printAscendente() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + "  ");
            actual = actual.next;
        }
        System.out.println();
    }

    //imprimir en orden descendente
    public void printDescendente() {
        Nodo actual = tail;
        while (actual != null) {
            System.out.print(actual.dato + "  ");
            actual = actual.prev;
        }
        System.out.println();
    }

    //vaciar lista
    public void vaciar() {
        this.head = null;
        this.tail = null;
    }
}
