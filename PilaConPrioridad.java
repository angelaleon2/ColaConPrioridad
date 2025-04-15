package tdaPilaConPrioridad;

public class PilaConPrioridad implements Pila{
    private Persona[] laPilaConPrioridad; //[codigo,prioridad]
    private int dimension;
    private int tope;
    int posicion;
    public PilaConPrioridad(int dimension){
        this.dimension = dimension;
        laPilaConPrioridad = new Persona[dimension];
        this.tope = -1;
    }

    @Override

    public void apilar(String nombre, int prioridad) {
        Persona nuevaPersona = new Persona(nombre, prioridad);

        if (estaLlena()) {
            System.out.println("Pila llena");
            return;
        }

        // Si está vacía, se inserta directamente
        if (tope == -1) {
            tope++;
            laPilaConPrioridad[0] = nuevaPersona;
            System.out.println("Elemento agregado " + nuevaPersona.getApellido() + " con prioridad " + nuevaPersona.getPrioridad());
            return;
        }

        // Buscar posición donde insertar
        int i = tope;
        while (i >= 0 && prioridad < laPilaConPrioridad[i].getPrioridad()) {
            laPilaConPrioridad[i + 1] = laPilaConPrioridad[i]; // Desplazar
            i--;
        }

        // Insertar en la posición correcta
        laPilaConPrioridad[i + 1] = nuevaPersona;
        tope++;
        System.out.println("Elemento agregado " + nuevaPersona.getApellido() + " con prioridad " + nuevaPersona.getPrioridad());
    }


    @Override
    public void desapilar() {
        if (estaVacia()){
            System.out.println("No hay elementos en la Fila");
            return;
        }
        System.out.println("Se saca al elemento -> "+laPilaConPrioridad[tope].getApellido());
        --tope;
        System.out.println("Quedan "+(tope+1)+" elementos");
        /*System.out.println("Siguiente tope es: "+laPilaConPrioridad[tope].getApellido());*/

    }

    @Override
    public boolean estaVacia() {
        if (this.tope == -1)
            return true;
        else
            return false;
    }

    @Override
    public boolean estaLlena() {
        if (this.tope == this.dimension-1)
        return true;
        else
            return false;
    }

    @Override
    public int mostrarTope() {
        return 0;
    }

    @Override
    /*public void mostrarTodo() {
        System.out.println("Los elementos en orden de prioridad (de Mayor a Menor");
        int  i = tope-1;
        while (i>=0){
            System.out.print("lugar:"+i);
            System.out.print("- "+laPilaConPrioridad[i].getApellido());
            System.out.print(" - Prioridad: "+laPilaConPrioridad[i].getPrioridad());
            System.out.println();
            i--;
        }

    }*/
    public void mostrarTodo() {
        System.out.println("Contenido de la pila:");
        for (int i = tope; i >= 0; i--) {
            System.out.println(laPilaConPrioridad[i].getApellido() + " (" + laPilaConPrioridad[i].getPrioridad() + ")");
        }
    }



}
class Persona{
    private String apellido;
    private int prioridad;
    public Persona(String apellido, int prioridad){
        this.apellido = apellido;
        this.prioridad = prioridad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
