package Taller4.PRIV3;

public class Producto {
    // Propiedad privada
    private double precio;

    // Constructor
    public Producto(double precio) {
        this.precio = precio;
    }

    // Método para actualizar el precio sin validación
    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio; // No hay validación, lo que es una mala práctica
    }
}