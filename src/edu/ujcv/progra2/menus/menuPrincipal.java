package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class menuPrincipal {
    menuVectores menVec = new menuVectores();
    menuMatrices menMat = new menuMatrices();
    public int opcion;

    public void mostrarOpciones (){

        System.out.println("--- Bienvenido a la Calculadora de Algebra Lineal ---");
        System.out.println("\n 1. Vectores");
        System.out.println("\n 2.  Matrices");
        System.out.println("\n 3. Salir");
    }
    public int leerOpciones(){
        opcion = LTV.getInteger("ingrese una opcion", "Usted ingreso una opcion no valida");
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
                System.out.println("Gracias por su consulta");
                System.out.println("---VUELVA PRONTO---");
                break;
        }

    }
    LectorDeTecladoValidado LTV = LectorDeTecladoValidado.getInstance();
}
