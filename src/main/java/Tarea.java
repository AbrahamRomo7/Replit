/**
 * Clase que representa una tarea.
 */
public final class Tarea {

    /**
     * Título de la tarea.
     */
    private String titulo;

    /**
     * Establece el título de la tarea.
     *
     * @param nuevoTitulo el título de la tarea, no puede ser {@code null}.
     * @throws IllegalArgumentException si el título es {@code null}.
     */
    public void setTitulo(final String nuevoTitulo) {
        if (nuevoTitulo == null) {
            throw new IllegalArgumentException("El título no puede ser null.");
        }
        this.titulo = nuevoTitulo;
    }

    /**
     * Obtiene el título de la tarea.
     *
     * @return el título de la tarea.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método de ejemplo que no realiza ninguna acción útil.
     */
    public void metodoInutil() {
        System.out.println("Este método no hace nada.");
    }
}
