package _8_TorresHanoi_recursividad;

public class App {
    public static void main(String[] args){
        App app = new App();
        app.torresHanoi(3,1,2,3);
        System.out.println("Juego completado");
    }

    public void torresHanoi(int discos, int torre1, int torre2, int torre3){
        if(discos == 1){ //caso base
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3 );
        }else{ //caso de dominio
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de torre " + torre1 + " a torre " + torre3 );
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
    }
}
