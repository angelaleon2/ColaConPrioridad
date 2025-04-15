package tdaPilaConPrioridad;

public class PruebaPilaPrioridadDinamica {
    public static void main(String[] args) {
        /*Paciente elPaciente = new Paciente("Pedro",1);*/
        PilaPrioridadDinamica laPilaPD = new PilaPrioridadDinamica();
        laPilaPD.apilar("Ana",1);
        laPilaPD.apilar("Daniel",5);
        laPilaPD.apilar("Bautista",2);
        laPilaPD.apilar("Ariel",1);
        laPilaPD.apilar("Daniela",5);
        laPilaPD.apilar("Clara",4);
        laPilaPD.mostrarTodo();
        laPilaPD.desapilar();
        laPilaPD.desapilar();
        laPilaPD.mostrarTodo();
        laPilaPD.desapilar();
        laPilaPD.desapilar();
        laPilaPD.apilar("Sofia",5);
        laPilaPD.desapilar();
        laPilaPD.desapilar();
        laPilaPD.desapilar();
    }
}
