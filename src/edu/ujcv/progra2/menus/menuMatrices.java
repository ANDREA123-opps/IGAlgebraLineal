package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class menuMatrices {
    public int opcion;
    menuMatR MDM = new menuMatR();
    LectorDeTecladoValidado NM = LectorDeTecladoValidado.getInstance();

    public void mostrarOpciones () {
        System.out.println("  Matrices");
        System.out.println("\n Dimensiones ");
        System.out.println("\n 1. Matriz 2x2");
        System.out.println("\n 2. Matriz 3x3");
        System.out.println("\n 3. Matriz 4x4");
        System.out.println("\n 4.Regresar");
    }

    public int leerOpciones() {
        opcion = NM.getInteger("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                MDM.mostrarOpcionesMatR2();
                MDM.operandoMatR2(MDM.leerOpcionMatR2());
                break;
            case 2:
                MDM.mostrarOpcionesMatR3();
                MDM.procesarOpcionMatR3(MDM.leerOpcionesMatR3());
                break;
            case 3:
                MDM.mostrarOpcionesMatR4();
                MDM.procesarOpcionMatR4(MDM.leerOpcionesMatR4());
                break;
            case 4:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
    }
}
