package edu.ujcv.progra2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int lector = 3;
        char e;
        while (lector == 3) {

            System.out.println("............Bienvenido............. ");
            System.out.println("");
            System.out.println("-- Seleccione la calculadora a utilizar --");
            System.out.println("1 - Calculadora Basica.");
            System.out.println("2 - Calculadora de Algebra Lineal.");
            System.out.println("3 - Salir.");
            System.out.println("");
            System.out.println("Escriba una de las opciones");
            lector = sc.nextInt();

            switch (lector) {
                case 1:

                    do {
                        System.out.println("Has seleccionado la calculadora basica!! ");

                    } while (lector<3);
                break;

                case 2:
                int opcion;
                    System.out.println("Has seleccionado la calculadora de algebra lineal!!");

                    do {
                        System.out.println("-- BIENVENIDO A LA CALCULADORA LINEAL --");
                        System.out.println("Selecciones la operacion que desee");
                        System.out.println("1- Vectores");
                        System.out.println("2- Matrices");
                        System.out.println("3- Volver atras");
                        opcion = sc.nextInt();

                        switch (opcion){
                            case 1:
                                int opc;
                                System.out.println("Has seleccionado la opcion 1- vectores");

                                do{
                                    System.out.println("Seleccione el tipo de vector que desea calcular");
                                    System.out.println("1- Vector en R2");
                                    System.out.println("2- Vector en R3");
                                    System.out.println("3- Vector en R4");
                                    System.out.println("4- Volver atras");
                                    opc = sc.nextInt();

                                    switch (opc){

                                        case 1:
                                            int opc1;
                                            System.out.println("Selecciono vector en R2");
                                            System.out.println("");
                                            System.out.println("Seleccione el operador");
                                            System.out.println("1- suma de vectores     ");    System.out.println("     5- Angulo");
                                            System.out.println("2- resta de vectores    ");    System.out.println("     6- Magnitud");
                                            System.out.println("3- Escalar por un vector     ");    System.out.println("     7- Volver atras");
                                            System.out.println("4- Producto punto");
                                            opc1 = sc.nextInt();

                                            switch (opc1){
                                                case 1:
                                                    System.out.println("Suma de vectores"); break;

                                                case 2:
                                                    System.out.println("Resta de vectores"); break;

                                                case 3:
                                                    System.out.println("Escalar por un vector"); break;

                                                case 4:
                                                    System.out.println("Producto punto"); break;

                                                case 5:
                                                    System.out.println("Angulo"); break;

                                                case 6:
                                                    System.out.println("Magnitud"); break;

                                                case 7:
                                                    break;

                                            }

                                            break;

                                        case 2:
                                            System.out.println("Selecciono vector en R3"); break;

                                        case 3:
                                            System.out.println("Selecciono vector en R4"); break;

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
                                } while (opc<3);

                            case 2:
                                int opcs;
                                System.out.println("Has seleccionado la opcion 2- matrices");

                                do{
                                    System.out.println("Selecciones el tipo de matriz que desea calcular");
                                    System.out.println("1- Matriz en R2");
                                    System.out.println("2- Matriz en R3");
                                    System.out.println("3- Matriz en R4");
                                    System.out.println("4- Volver atras");
                                    opcs = sc.nextInt();

                                    switch (opcs){

                                        case 1:
                                            System.out.println("Seleciono matriz en R2"); break;

                                        case 2:
                                            System.out.println("Selecciono matriz en R3"); break;

                                        case 3:
                                            System.out.println("Selecciono matriz en R4"); break;

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
                                } while (opcs<3);
                        }

                    }while (opcion<3);
                break;

                case 3:
                    System.out.println("FIN DEL PROCESO");
                break;

                default:
                    System.out.println("Solo numeros entre 1 al 3 ");
            }
            try {

            } catch (Exception ex) {
                System.out.println("Solo puedes insertar un numero");
                sc.next();
                ex.printStackTrace();
            }


        }
}
}