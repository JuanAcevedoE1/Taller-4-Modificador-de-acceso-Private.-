package Taller4.PRIV2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Chevrolet", "Onix", 180.0);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());

        coche.acelerar(20.0); 
        coche.acelerar(-5.0); 
    }
}