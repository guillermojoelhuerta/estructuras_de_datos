package _4_Memoria_dinamica_Arraylist;

import javax.swing.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
            ArrayList<String> cadenas;
            cadenas = new ArrayList<String>();
            String frase, respuesta;
            do{
                frase = JOptionPane.showInputDialog(null, "Ingresa la frase");
                cadenas.add(frase);
                respuesta = JOptionPane.showInputDialog(null, "Deseas ingresar otra frase?");
                respuesta = respuesta.toUpperCase();
            }while(!respuesta.equals("NO"));

            for(int i=0; i < cadenas.size(); i++){
               System.out.println(cadenas.get(i));
            }
            cadenas.set(1, "skaskaskaskaska");

            for(int i=0; i < cadenas.size(); i++){
                System.out.println(cadenas.get(i));
            }
            cadenas.remove(0);
    }
}
