package edu.ujcv.progra2.menus;

public class EjecutarCodigo {
    private int opcion;

    public void CorrerProgram() {

        EjecutarCodigo menu = new EjecutarCodigo();

        do {
            menu.mostrarOpciones();
            menu.Operando(menu.leerOpciones());
        }while (menu.opcion != 3);
    }

    private void Operando(Object leerOpciones) {
    }

    private Object leerOpciones() {
        return null;
    }

    private void mostrarOpciones() {
    }
}
