public class Main {
    public static void main(String[] args) {
        // Creamos un gestor de tareas
        GestorTareas gestor = new GestorTareas();

        // Agregamos tareas
        gestor.agregarTarea("Estudiar colecciones");
        gestor.agregarTarea("Hacer ejercicio");
        gestor.agregarTarea("Leer un libro");
        gestor.agregarTarea("Estudiar colecciones"); // duplicado permitido

        // Mostramos todas las tareas
        gestor.mostrarTareas();

        // Eliminamos una tarea
        gestor.eliminarTarea("Hacer ejercicio");

        // Mostramos después de eliminar
        gestor.mostrarTareas();







    }
}
