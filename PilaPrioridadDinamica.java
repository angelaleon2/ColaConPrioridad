package tdaPilaConPrioridad;

public class PilaPrioridadDinamica implements Pila{
    public NodoPaciente nodoPaciente;
    NodoPaciente tope = null;


    @Override

    public void apilar(String nombre, int prioridad) {
        Paciente elPaciente = new Paciente(nombre, prioridad);
        NodoPaciente nuevoNodo = new NodoPaciente(elPaciente);

        // Si la pila está vacía o el nuevo tiene mayor prioridad que el tope, se coloca en el tope
        if (tope == null || prioridad > tope.paciente.getPrioridad()) {
            nuevoNodo.siguiente = tope;
            tope = nuevoNodo;
            return;
        }

        // Buscar dónde insertar el nuevo nodo
        NodoPaciente actual = tope;
        while (actual.siguiente != null && actual.siguiente.paciente.getPrioridad() >= prioridad) {
            actual = actual.siguiente;
        }

        // Insertar el nodo en la posición correcta
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente = nuevoNodo;
    }


    @Override
    public void desapilar() {
        if (estaVacia()){
            System.out.println("No hay pacientes en espera");
            return;
        }
        NodoPaciente actual = tope;
        System.out.println("Se atiende al paciente: "+actual.paciente.toString());
        tope = tope.siguiente;

    }

    @Override
    public boolean estaVacia() {
        if (tope == null){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean estaLlena() {
        return false;
    }

    @Override
    public int mostrarTope() {
        return 0;
    }

    @Override
    public void mostrarTodo() {
        NodoPaciente actual = tope;
        System.out.println("Lista de pacientes segun prioridad");
        while (actual!= null){
            System.out.println(actual.paciente.toString());
            actual = actual.siguiente;
        }
    }
}
class NodoPaciente{
    Paciente paciente;
    NodoPaciente siguiente;

    public NodoPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }
}