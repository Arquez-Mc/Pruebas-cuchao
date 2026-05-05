import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

//*********************************************************************
// CLASE GESTORTAREAS
public class GestorTareas {
    // LIST
    private List<String> tareas;

    // SET
    private Set<String> tareasUnicas;

    // QUEUE
    private Queue<String> colaTareas;

    // MAP
    private Map<Integer, String> mapaTareas;

    //-------------------------------------
// Constructor
    public GestorTareas() {
        tareas = new ArrayList<>();
        tareasUnicas = new HashSet<>();
        colaTareas = new LinkedList<>();
        mapaTareas = new HashMap<>();
    }

    //*********************************************************************
// PARTE LIST
    public void agregarTareaLista(String tarea) {
        tareas.add(tarea);
    }

    public void eliminarTareaLista(String tarea) {
        tareas.remove(tarea);
    }

    public void mostrarTareasLista() {
        System.out.println("Lista de tareas (con duplicados):");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }

    //*********************************************************************
// PARTE SET
    public void agregarTareaSet(String tarea) {
        tareasUnicas.add(tarea);
    }

    public void eliminarTareaSet(String tarea) {
        tareasUnicas.remove(tarea);
    }

    public void mostrarTareasSet() {
        System.out.println("Tareas únicas (sin duplicados):");
        for (String tarea : tareasUnicas) {
            System.out.println("- " + tarea);
        }
    }

    //*********************************************************************
// PARTE QUEUE
    public void agregarTareaQueue(String tarea) {
        colaTareas.add(tarea);
    }

    public void procesarTareaQueue() {
        String tarea = colaTareas.poll();
        if (tarea != null) {
            System.out.println("Procesando tarea: " + tarea);
        } else {
            System.out.println("No hay tareas en la cola.");
        }
    }

    public void mostrarTareasQueue() {
        System.out.println("Cola de tareas (FIFO):");
        for (String tarea : colaTareas) {
            System.out.println("- " + tarea);
        }
    }

    //*********************************************************************
// PARTE MAP
    public void agregarTareaMap(int id, String tarea) {
        mapaTareas.put(id, tarea);
    }

    public void eliminarTareaMap(int id) {
        mapaTareas.remove(id);
    }

    public void mostrarTareasMap() {
        System.out.println("Mapa de tareas (ID → Nombre):");
        for (Map.Entry<Integer, String> entry : mapaTareas.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
