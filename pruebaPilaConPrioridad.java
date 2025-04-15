package tdaPilaConPrioridad;

public class pruebaPilaConPrioridad {
    public static void main(String[] args) {
        PilaConPrioridad laPilaP = new PilaConPrioridad(5);
        laPilaP.apilar("A", 4);
        laPilaP.apilar("B", 5);
        laPilaP.apilar("C", 2);
        laPilaP.apilar("D", 4);
        laPilaP.apilar("E", 1);
        laPilaP.mostrarTodo();
        laPilaP.desapilar();
        laPilaP.desapilar();
        laPilaP.desapilar();
        laPilaP.desapilar();
        laPilaP.desapilar();
        laPilaP.desapilar();

    }
}
