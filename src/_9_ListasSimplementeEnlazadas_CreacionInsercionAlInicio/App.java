package _9_ListasSimplementeEnlazadas_CreacionInsercionAlInicio;

import javax.swing.*;

public class App {
    public static void main(String[] args){
        Lista listita = new Lista();
        int opcion = 0, el;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al iniicio de la lista\n" +
                                "2. Mostrar los datos de la lista\n" +
                                "3. Salir\n", "Menú de opciones",3));

                switch(opcion){
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento",
                                    "Insertando al inicio",
                                    3));
                            //Agregando al nodo
                            listita.agregarAlInicio(el);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 2:
                        listita.mostrarLista();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "0pción incorrecta");

                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion!=3);
    }
}
