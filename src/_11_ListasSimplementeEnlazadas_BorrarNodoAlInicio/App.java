package _11_ListasSimplementeEnlazadas_BorrarNodoAlInicio;

import javax.swing.*;

public class App {
    public static void main(String[] args){
        Lista listita = new Lista();
        int opcion = 0, el;
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicio de la lista\n" +
                                "2. Agregar un elemento al final de la lista\n" +
                                "3. Mostrar los datos de la lista\n" +
                                "4. Eliminar un elemento del inicio de la lista\n" +
                                "5. Salir\n", "Menú de opciones",3));

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
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento",
                                    "Insertando al final",
                                    3));
                            //Agregando al nodo
                            listita.agregarAlFinal(el);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 3:
                        listita.mostrarLista();
                        break;
                    case 4:
                        el = listita.borrarDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + el, "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "0pción incorrecta");

                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion!=5);
    }
}
