package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;

public class menuVectores {
    public int opc2;

    menuVecR MDV = new menuVecR();
    LectorDeTecladoValidado LTV = LectorDeTecladoValidado.getInstance();

    public void presentarOpciones(){

        System.out.println("\n Has seleccionado Vectores");
        System.out.println("1. Vector en R2");
        System.out.println("2. Vector en R3");
        System.out.println("3. Vector en R4");
        System.out.println("4. Volver al menu principal");

    }

    public int leerOpciones() {
        opc2 = LTV.getInteger("\n Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opc2;
    }

    public int procesarOpcion(int opc2) {
        switch (opc2) {

            case 1:
                MDV.mostrarOpcionR2();
                MDV.operandoR2(MDV.LeeropcionR2());
                break;

            case 2:
                MDV.mostrarOpcionR3();
                MDV.operandoR3(MDV.LeeropcionR3());
                break;

            case 3:
                MDV.mostrarOpcionR4();
                MDV.operandoR4(MDV.LeeropcionR4());
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
        return opc2;
    }

}
