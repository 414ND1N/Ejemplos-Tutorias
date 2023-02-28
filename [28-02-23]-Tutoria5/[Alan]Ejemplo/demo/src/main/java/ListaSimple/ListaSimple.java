package ListaSimple;

public class ListaSimple {
    // apunta la cabeza
    public Nodo head;

    // constructor
    public ListaSimple() {
        this.head = null;
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

    // insertar al inicio
    public void insertFirst(int dato) {
        Nodo newNode = new Nodo(dato);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert original
    public void insertEnd(int dato) {
        Nodo newNode = new Nodo(dato);
        if (head == null) {
            head = newNode;
        } else {
            Nodo actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newNode;
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

    // remover dato de lista
    public void remove(int dato) {
        if (head == null) {
            return;
        }
        if (head.dato == dato) {
            head = head.next;
            return;
        }
        Nodo actual = head;
        while (actual.next != null) {
            if (actual.next.dato == dato) {
                actual.next = actual.next.next;
                return;
            }
            actual = actual.next;
        }
    }

    // imprimir
    public void print() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + "  ");
            actual = actual.next;
        }
        System.out.println();
    }

    // vaciar lista
    public void vaciar() {
        this.head = null;
    }
}
