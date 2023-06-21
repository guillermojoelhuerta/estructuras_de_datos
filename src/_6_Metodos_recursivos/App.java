package _6_Metodos_recursivos;

public class App {
    public static void main(String[] args) throws InterruptedException {
        App app = new App();
        app.bajarEscalera(20);
    }

    public void bajarEscalera(int escalones) throws InterruptedException {
        if(escalones == 0){
            System.out.println("Has terminado de bajar la escalera");
        }else{
            Thread.sleep(500);
            System.out.println("Bajando escalón " + escalones);
            bajarEscalera(escalones -1);
        }
    }
}
