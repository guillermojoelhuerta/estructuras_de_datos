package _7_SucesionFibonacci_recursividad;

public class App {

    public int fibonacciRecursivo(int n){
        if(n==1 || n==2){
            return  1;
        }
        return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
    }

    public int fibonacciCiclo(int n){
        int fibo = 0, primero = 1, segundo = 0;
        while(n > 0){
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        } //n=4-1=3-1=2-1=1-1=0 fibo=0=1=1=2=3 primero=1=0=1=2 segundo=0=1=1=3
        return fibo;
    }
    public static void main(String[] args){
        App app = new App();
        System.out.println(app.fibonacciRecursivo(12));
        System.out.println(app.fibonacciCiclo(12));
    }
}
