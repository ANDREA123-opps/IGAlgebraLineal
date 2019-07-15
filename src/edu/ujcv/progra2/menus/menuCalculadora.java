package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class menuCalculadora {
    menuPrincipal CL = new menuPrincipal();
    menuCalcBasc CB = new menuCalcBasc();
    public int opcion;
    public void mostrarOpciones (){
        System.out.println("\n");
        System.out.println("--- Bienvenido Usuario ---");
        System.out.println("\n 1. Calculadora de Algebra Lineal");
        System.out.println("\n 2. Calculadora Basica");
        System.out.println("\n 3. Salir");
    }
    public int leerOpciones(){
        opcion = LTV.getInteger("\n ingrese una opcion", "Usted ingreso una opcion no valida");
        return opcion;
    }

    public void Operando (int opcion){
        switch (opcion){
            case 1:
                CL.presentarOpciones();
                CL.procesarOpcion(CL.leerOpciones());
                break;

            case 2:
                CB.mostrarOpciones();
                CB.procesarOpcion(CB.leerOpciones());
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
