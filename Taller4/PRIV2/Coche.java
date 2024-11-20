package Taller4.PRIV2;

public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("El coche ha acelerado. Nueva velocidad máxima: " + velocidadMaxima);
        } else {
            System.out.println("El incremento debe ser positivo para acelerar.");
        }
    }
}