package _3_Memoria_estatica_Arrays;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class App {

    public static void main(String[] args){

        int numeros[] = new int[5];
        int numerotes[] = new int[numeros.length];
        String palabras[] = new String[5];

        for(int i=0; i<5; i++){
            numeros[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Ingresa el elemento del índice" + i)
            );
        }

        System.out.println("Los datos sin ordenar son: ");
        //mostramos los datos como los ingresamos
        for(int x = 0; x < 5; x++){
            System.out.println("["+ numeros[x] +"]");
        }

        System.out.println("\n Los datos ordenados son: ");
        Arrays.sort(numeros);
        for(int y = 0; y < 5; y++){
            System.out.println("["+ numeros[y] +"]");
        }

        Arrays.fill(palabras, "Bienvenido a la casa");
        for(int y = 0; y < 5; y++){
            System.out.println("["+ palabras[y] +"]");
        }

        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
        System.out.println("\n Elementos del arreglos numerotes: ");
        for(int y = 0; y < 5; y++){
            System.out.println("["+ numerotes[y] +"]");
        }
    }
}
