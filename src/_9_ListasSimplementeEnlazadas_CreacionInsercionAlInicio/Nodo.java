package _9_ListasSimplementeEnlazadas_CreacionInsercionAlInicio;

public class Nodo {
    public int dato;
    public Nodo siguiente;// Puntero enlace

    //Constructor para insertar al final
    public Nodo(int d){
        this.dato = d;
    }

    // Contructor para insertar al inicio
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
    }
}
