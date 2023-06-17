package _2_TDA_esfera;

public class App {
    public static void main(String[] args){
        TDAEsfera esfera = new TDAEsfera(3);
        System.out.println("Radio: " + esfera.getRadio());
        System.out.println("Diámetro: " + esfera.getDiametro());
        System.out.println("Circunferencia: " + esfera.getCircunferencia());
        System.out.println("Área: " + esfera.getArea());
        System.out.println("Volumen: " + esfera.getVolumen());
    }
}
