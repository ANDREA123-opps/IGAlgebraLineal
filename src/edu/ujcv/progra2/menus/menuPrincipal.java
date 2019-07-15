package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class menuPrincipal {
    menuVectores menVec = new menuVectores();
    menuMatrices menMat = new menuMatrices();
    public int opcion;

    public void mostrarOpciones (){
        System.out.println("\n");
        System.out.println("--- Bienvenido a la Calculadora de Algebra Lineal ---");
        System.out.println("\n 1. Vectores");
        System.out.println("\n 2. Matrices");
        System.out.println("\n 3. Salir");
    }
    public int leerOpciones(){
        opcion = LTV.getInteger("\n ingrese una opcion", "Usted ingreso una opcion no valida");
        return opcion;
    }

    public void Operando (int opcion){
        switch (opcion){
            case 1:
                menVec.presentarOpciones();
                menVec.procesarOpcion(menVec.leerOpciones());
                break;

            case 2:
                menMat.mostrarOpciones();
                menMat.procesarOpcion(menMat.leerOpciones());
                break;

            case 3:
                System.out.println("Gracias por hacer el intento");
                System.out.println("---VUELVA PRONTO---");
                break;
            default:
                System.out.println("Solo puedes ingresar los numeros seleccionados ( del 1 al 3 )");
                System.out.println("Vuelve a ingresar un numero");
        }try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    LectorDeTecladoValidado LTV = LectorDeTecladoValidado.getInstance();
}
