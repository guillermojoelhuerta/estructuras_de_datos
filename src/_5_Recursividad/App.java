package _5_Recursividad;

public class App {

    public int factorial(int n){
        if(n<=0){
            return 1;
        }else{
            return n*factorial(n-1);
        }       //4 * 3 * 2 * 1
    }

    public int factorialCiclos(int n){
        int factor = 1;
        if(n<0){
            return 0;
        }
        while(n!=0){
            factor = n * factor;
            n--;
        }
        return factor;
    }
    public static void main(String[] args){
        App app = new App();
        System.out.println(app.factorial(4));
        System.out.println(app.factorialCiclos(4));
    }
}
