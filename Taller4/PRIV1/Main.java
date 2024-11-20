package Taller4.PRIV1;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 20, 8.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());

        estudiante.setEdad(-5); // Esto debería mostrar un mensaje de error
        estudiante.setNotaPromedio(11); // Esto también debería mostrar un mensaje de error

        estudiante.setEdad(21);
        estudiante.setNotaPromedio(9.0);

        System.out.println("Nueva Edad: " + estudiante.getEdad());
        System.out.println("Nueva Nota Promedio: " + estudiante.getNotaPromedio());
    }
}