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

        //*********************************************************************
        // HILOS

        System.out.println("AQUI VAN LOS HILOS" + " \n ");

        Thread hilo1 = new Thread(
                () -> {
            try {
                System.out.println("\n[Hilo1] Esperando 5 segundos...");
                Thread.sleep(5000); // pausa 5 segundos
                gestor.agregarTareaLista("Tarea agregada por hilo1");
                System.out.println("[Hilo1] Agregó una tarea a la lista.");
            }
            catch (InterruptedException e) {
                System.out.println("[Hilo1] Fue interrumpido.");}
        }
        );

        Thread hilo2 = new Thread(() -> {
            try {
                System.out.println("\n[Hilo2] Esperando 3 segundos...");
                Thread.sleep(3000); // pausa 3 segundos
                gestor.agregarTareaSet("Tarea única agregada por hilo2");
                System.out.println("[Hilo2] Agregó una tarea al set.");
            } catch (InterruptedException e) {
                System.out.println("[Hilo2] Fue interrumpido.");
            }
        });

        // Iniciamos ambos hilos
        hilo1.start();
        hilo2.start();

        // Esperamos a que terminen antes de mostrar resultados
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostramos las tareas después de que ambos hilos trabajaron
        System.out.println("\n--- Resultados después de los hilos ---");
        gestor.mostrarTareasLista();
        gestor.mostrarTareasSet();
    }
}
