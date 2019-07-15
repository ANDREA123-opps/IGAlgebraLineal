package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class menuMatrices {
    public int opcion;
    menuMatR MDM = new menuMatR();
    LectorDeTecladoValidado LTV = LectorDeTecladoValidado.getInstance();

    public void mostrarOpciones () {
        System.out.println("\n Has seleccionado Matrices ");
        System.out.println("1. Matriz 2x2");
        System.out.println("2. Matriz 3x3");
        System.out.println("3. Matriz 4x4");
        System.out.println("4. Volver atras");
    }

    public int leerOpciones() {
        opcion = LTV.getInteger("\n Ingrese una opcion", "Ha ingresado una opcion erronea");
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
                System.out.println("\n Has vuelto al menu principal \n \n");
                break;
            default:
                System.out.println("Solo puedes ingresar los numeros seleccionados ( del 1 al 4 )");
                System.out.println("Vuelve a ingresar un numero");
        }try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
