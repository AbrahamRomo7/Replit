import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de tareas.
 */
public final class GestorTareas {

    /**
     * Lista de tareas gestionadas.
     */
    private final List<Tarea> tareas = new ArrayList<>();

    /**
     * Agrega una nueva tarea a la lista.
     *
     * @param tarea la tarea a agregar, no puede ser {@code null}.
     * @throws IllegalArgumentException si la tarea es {@code null}.
     */
    public void agregarTarea(final Tarea tarea) {
        if (tarea == null) {
            throw new IllegalArgumentException("La tarea no puede ser null.");
        }
        tareas.add(tarea);
    }

    /**
     * Obtiene el número total de tareas.
     *
     * @return el número total de tareas.
     */
    public int obtenerTotalTareas() {
        return tareas.size();
    }

    /**
     * Elimina la tarea en el índice especificado.
     *
     * @param codigo el índice de la tarea a eliminar.
     * @throws IndexOutOfBoundsException si el índice está fuera de rango.
     */
    public void eliminarTarea(final int codigo) {
        if (codigo < 0 || codigo >= tareas.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
        tareas.remove(codigo);
    }

    /**
     * Muestra un ejemplo de bucle ineficiente para comparación de tareas.
     */
    public void bucleIneficiente() {
        for (int i = 0; i < tareas.size(); i++) {
            for (int j = 0; j < tareas.size(); j++) {
                System.out.println("Comparando tareas " + i + " y " + j);
            }
        }
    }
}
