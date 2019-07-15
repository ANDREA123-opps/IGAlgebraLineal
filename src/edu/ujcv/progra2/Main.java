package edu.ujcv.progra2;

import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int opcion;
        System.out.println("----- BIENVENIDO A LA CALCULADORA DE ALGEBRA LINEAL -----");

        do {
            System.out.println("Selecciones la operacion que desee");
            System.out.println("1- Vectores");
            System.out.println("2- Matrices");
            System.out.println("3- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int opc;
                    System.out.println("Has seleccionado la opcion 1- vectores");

                    do {
                        System.out.println("Seleccione el tipo de vector que desea calcular");
                        System.out.println("1- Vector en R2");
                        System.out.println("2- Vector en R3");
                        System.out.println("3- Vector en R4");
                        System.out.println("4- Volver atras");
                        opc = sc.nextInt();

                        switch (opc) {

                            case 1:
                                int opc1;
                                System.out.println("Selecciono vector en R2");
                                System.out.println("");
                                do {
                                    System.out.println("Seleccione el operador");
                                    System.out.println("1- suma de vectores     ");
                                    System.out.println("2- resta de vectores    ");
                                    System.out.println("3- Escalar por un vector     ");
                                    System.out.println("4- Producto punto");
                                    System.out.println("5- Angulo");
                                    System.out.println("6- Magnitud");
                                    System.out.println("7- Volver atras");
                                    opc1 = sc.nextInt();

                                    switch (opc1) {
                                        case 1:
                                            System.out.println("---Suma de vectores---");
                                            IGVecR2 a = new IGVecR2();
                                            System.out.println("Ingrese los componentes del vector x1 y y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            IGVecR2 b = new IGVecR2();
                                            System.out.println("Ingrese los componentes del vector x2 y y2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            IGVecR2 x = a.suma(b);
                                            IGVecR2 y = a.suma(b);
                                            System.out.println("La suma de los vectores X + Y = "+ x.getX()+","+y.getY() );


                                            System.out.println("");
                                            break;

                                        case 2:
                                            System.out.println("Resta de vectores");
                                            break;

                                        case 3:
                                            System.out.println("Escalar por un vector");
                                            break;

                                        case 4:
                                            System.out.println("Producto punto");
                                            break;

                                        case 5:
                                            System.out.println("Angulo");
                                            break;

                                        case 6:
                                            System.out.println("Magnitud");
                                            break;

                                        case 7:
                                            break;
                                    }
                                } while (opc1 < 3);

                                break;

                            case 2:
                                System.out.println("Selecciono vector en R3");
                                System.out.println("Rotacion en X");
                                System.out.println("Rotacion en Y");
                                System.out.println("Rotacion en Z");
                                break;

                            case 3:
                                System.out.println("Selecciono vector en R4");
                                System.out.println("Rotacion en X");
                                System.out.println("Rotacion en Y");
                                System.out.println("Rotacion en Z");
                                break;

                            case 4:
                                break;
                            default:
                                System.out.println("Solo puede teclear los numeros seleccionados");
                        }
                        try {

                        } catch (Exception ex) {
                            System.out.println("ERROR!! Solo puedes ingresar un numero");
                            ex.printStackTrace();
                        }
                    } while (opc < 3);

                case 2:
                    int opcs;
                    System.out.println("Has seleccionado la opcion 2- matrices");

                    do {
                        System.out.println("Selecciones el tipo de matriz que desea calcular");
                        System.out.println("1- Matriz en R2");
                        System.out.println("2- Matriz en R3");
                        System.out.println("3- Matriz en R4");
                        System.out.println("4- Volver atras");
                        opcs = sc.nextInt();

                        switch (opcs) {

                            case 1:
                                int opc2;
                                System.out.println("Seleciono matriz en R2");

                                do {
                                    System.out.println("Seleccione el operador");
                                    System.out.println("1- suma de matrices    ");
                                    System.out.println("     5- multipliacion de matrices ");
                                    System.out.println("2- resta de matrices   ");
                                    System.out.println("     6- rotacion de matrices");
                                    System.out.println("3- multiplicacion por un Escalar      ");
                                    System.out.println("     7- Volver atras");
                                    System.out.println("4- multilplicacion de una columna por una matriz");
                                    opc2 = sc.nextInt();

                                    switch (opc2) {
                                        case 1:
                                            System.out.println("Suma de matrices");
                                            break;
                                        case 2:
                                            System.out.println("Resta de matrices");
                                            break;
                                        case 3:
                                            System.out.println("multiplicacion por un escalar");
                                        case 4:
                                            System.out.println("multiplicacion de una columna por una matriz");
                                            break;
                                        case 5:
                                            System.out.println("multiplicacion de matrices");
                                            break;
                                        case 6:
                                            System.out.println("rotacion de matrices");
                                            break;
                                        case 7:
                                            break;
                                    }
                                } while (opc2 < 3);


                                break;

                            case 2:
                                System.out.println("Selecciono matriz en R3");
                                break;

                            case 3:
                                System.out.println("Selecciono matriz en R4");
                                break;

                            case 4:
                                break;
                            default:
                                System.out.println("Solo puede teclear los numeros seleccionados");
                        }
                        while (opcs < 3) ;
                        try {

                        } catch (Exception ex) {
                            System.out.println("ERROR!! Solo puedes ingresar un numero");
                            ex.printStackTrace();
                        }

                    } while (opcs < 3);
            }
        }while (opcion <3);
    }
    public void imprimirIGVecR2 (IGVecR2 a){
        System.out.println("(" + a.getX() +","+ a.getY()+ ")");
    }

    public void imprimirIGVecR3(IGVecR3 a){

        System.out.println("(" + a.getI() +","+ a.getJ() +","+ a.getK()+")");
    }

    public void imprimirIGVecR4 (IGVecR4 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ() +","+ a.getW()+")");
    }

    public void imprimirMatR2(IGMatR2 a){
        System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol1().getX() + "\t|");
        System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol1().getY() + "\t|");
    }

    // public void imprimirMatR3(IGMatR3 a){
       // System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol2().getX() + "  " + a.getCol3().getX() + "\t|");
       // System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol2().getY() + "  " + a.getCol3().getY() + "\t|");
       // System.out.println("|\t" + a.getCol1().getZ() + "  " + a.getCol2().getZ() + "  " + a.getCol3().getZ() + "\t|");
   //}

   // public void imprimirMatR4(IGMatR4 a){
      //  System.out.println("|\t" + a.getCol1().getX() + "  " + a.getCol2().getX() + "  " + a.getCol3().getX() + "  "+ a.getCol4().getX() + "\t|");
     //   System.out.println("|\t" + a.getCol1().getY() + "  " + a.getCol2().getY() + "  " + a.getCol3().getY() + "  "+ a.getCol4().getY() + "\t|");
      //  System.out.println("|\t" + a.getCol1().getZ() + "  " + a.getCol2().getZ() + "  " + a.getCol3().getZ() + "  "+ a.getCol4().getZ() + "\t|");
      //  System.out.println("|\t" + a.getCol1().getW() + "  " + a.getCol2().getW() + "  " + a.getCol3().getW() + "  "+ a.getCol4().getW() + "\t|");
    //}


}