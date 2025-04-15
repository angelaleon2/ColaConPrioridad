package tdaPilaConPrioridad;

public interface Pila {
    void apilar(String nombre, int prioridad);
    void desapilar();
    boolean estaVacia();
    boolean estaLlena();
    int mostrarTope();
    void mostrarTodo();

}
