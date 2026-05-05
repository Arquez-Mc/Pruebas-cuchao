import java.util.ArrayList;
import java.util.List;


public class GestorTareas {
    private List<String> tareas;

//-------------------------------------
//Constructor
    public GestorTareas() {
        tareas = new ArrayList<>();
    }
//-------------------------------------
    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }
//-------------------------------------
    public void eliminarTarea(String tarea) {
        tareas.remove(tarea);
    }
//-------------------------------------
    public void mostrarTareas() {
        System.out.println("Lista de tareas:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }















    }
}
