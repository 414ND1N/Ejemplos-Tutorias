package tutoria;

import ListaDoble.ListaDoble;
import ListaSimple.ListaSimple;

public class App 
{
    public static void main( String[] args )
    {
        //LISTA SIMPLE
        //creacion lista simple
        ListaSimple lista_simple = new ListaSimple();
        lista_simple.insertFirst(13);
        lista_simple.insertFirst(12);
        lista_simple.insertEnd(14);
        lista_simple.insertFirst(11);

        //tamaño lista
        System.out.println(lista_simple.size());
        //imprimir
        lista_simple.print();

        //remover
        lista_simple.remove(13);

        //tamaño lista
        System.out.println(lista_simple.size());

        //busqueda
        lista_simple.busqueda(13);

        //vaciar lista
        lista_simple.vaciar();

        //tamaño lista
        System.out.println(lista_simple.size());
        

        //LISTA DOBLE ENLAZADA

        //creación lista doble
        ListaDoble lista_doble = new ListaDoble();

        //añadir datos
        lista_doble.insertEnd(5);
        lista_doble.insertFirst(4);
        lista_doble.insertFirst(4);
        lista_doble.insertFirst(2);
        lista_doble.insertFirst(1);

        //tamaño lista
        System.out.println(lista_doble.size());

        //impresion
        lista_doble.printAscendente();
        lista_doble.printDescendente();

        //remover
        lista_doble.remove(4);

        //tamaño lista
        System.out.println(lista_doble.size());

        //busqueda
        lista_doble.busqueda(4);

        //vaciar lista
        lista_doble.vaciar();

        //tamaño lista
        System.out.println(lista_doble.size());
    }
}
