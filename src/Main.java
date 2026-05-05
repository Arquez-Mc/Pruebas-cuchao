public class Main {
    public static void main(String[] args) {
        // Creamos un gestor de tareas
        GestorTareas gestor = new GestorTareas();

        //*********************************************************************
        // LIST
        gestor.agregarTareaLista("Estudiar colecciones");
        gestor.agregarTareaLista("Hacer ejercicio");
        gestor.agregarTareaLista("Leer un libro");
        gestor.agregarTareaLista("Estudiar colecciones"); // duplicado permitido

        gestor.mostrarTareasLista();

        gestor.eliminarTareaLista("Hacer ejercicio");

        gestor.mostrarTareasLista();

        //*********************************************************************
        // SET
        gestor.agregarTareaSet("Estudiar colecciones");
        gestor.agregarTareaSet("Hacer ejercicio");
        gestor.agregarTareaSet("Leer un libro");
        gestor.agregarTareaSet("Estudiar colecciones"); // duplicado eliminado automáticamente

        gestor.mostrarTareasSet();

        gestor.eliminarTareaSet("Leer un libro");

        gestor.mostrarTareasSet();

        //*********************************************************************
        // QUEUE
        gestor.agregarTareaQueue("Tarea 1");
        gestor.agregarTareaQueue("Tarea 2");
        gestor.agregarTareaQueue("Tarea 3");

        gestor.mostrarTareasQueue();

        gestor.procesarTareaQueue(); // procesa la primera
        gestor.mostrarTareasQueue();

        //*********************************************************************
        // MAP
        gestor.agregarTareaMap(1, "Estudiar colecciones");
        gestor.agregarTareaMap(2, "Hacer ejercicio");
        gestor.agregarTareaMap(3, "Leer un libro");

        gestor.mostrarTareasMap();

        gestor.eliminarTareaMap(2);

        gestor.mostrarTareasMap();
    }
}
