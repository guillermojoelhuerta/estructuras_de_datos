package _9_ListasSimplementeEnlazadas_CreacionInsercionAlInicio;

public class Lista {
    protected Nodo inicio, fin; //Punteros para saber donde esta el inicio y final

    public Lista(){
        inicio = null;
        fin = null;
    }

    //método para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        //Creando al nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null)
        {
            fin = inicio;
        }
    }

    //Método para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
        }
    }
}
