package Taller4.PRIV3;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan");

        // Intentar acceder a la propiedad privada directamente
        // Esto generará un error de compilación
        // System.out.println(persona.nombre); // Descomentar para ver el error

        // Crear una instancia de Producto
        Producto producto = new Producto(100.0);

        // Actualizar el precio sin validación
        producto.actualizarPrecio(-50.0); // Esto es una mala práctica
    }
}
