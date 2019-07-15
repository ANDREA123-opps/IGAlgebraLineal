package edu.ujcv.progra2.menus;

import java.util.Scanner;

public class menuCalcBasc {
    double suma(double a, double b) {
        double retval = 0;
        retval = a + b;

        return retval;
    }

    double resta(double a, double b) {
        double retval = 0;
        retval = a - b;

        return retval;
    }

    double Multi(double a, double b) {
        double retval = 0;
        retval = a * b;

        return retval;
    }

    double division(double a, double b) {
        double retval = 0;
        retval = a / b;

        return retval;
    }

    double potencia(double a, double b) {
        double retval = 0;
        retval = Math.pow(a, b);

        return retval;
    }

    double raiz(double a) {
        double retval = 0;
        retval = Math.sqrt(a);

        return retval;
    }

    double FunSeno(double a) {
        double rad = Math.PI/180.0*a;
        double retval = Math.sin(a);

        return retval;
    }

    double FunCos(double a) {
        double rad = Math.PI/180.0*a;
        double retval = Math.cos(rad);

        return retval;
    }

    double FunTan(double a) {
        double rad = Math.PI/180.0*a;
        double retval = Math.tan(rad);

        return retval;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menuCalcBasc calculadora = new menuCalcBasc();
        menuCalcBasc Comunes = new menuCalcBasc();

        int R = 1;
        while (R == 1) {

            System.out.println("Con que operador quiere ejecutar:");
            System.out.println("1. Suma" + "                              " + "6. Raiz cuadrada");
            System.out.println("2. Resta" + "                             " + "7. Funcion Seno");
            System.out.println("3. Multiplicacion" + "                    " + "8. Funcion Coseno");
            System.out.println("4. Division" + "                          " + "9. Funcion Tangente");
            System.out.println("5. Potencia");

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el primer numero");
                    int a = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    int b = sc.nextInt();
                    System.out.println("R// " + calculadora.suma(a, b));
                    break;

                case 2:
                    System.out.println("Ingrese el primer numero");
                    a = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = sc.nextInt();
                    System.out.println("R// " + calculadora.resta(a, b));
                    break;

                case 3:
                    System.out.println("Ingrese el primer numero");
                    a = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = sc.nextInt();
                    System.out.println("R// " + calculadora.Multi(a, b));
                    break;

                case 4:
                    System.out.println("Ingrese el primer numero");
                    a = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    b = sc.nextInt();
                    System.out.println("R// " + calculadora.division(a, b));
                    break;

                case 5:
                    System.out.println("Ingrese el numero");
                    a = sc.nextInt();
                    System.out.println("Ingrese el valor de la potencia ");
                    b = sc.nextInt();
                    System.out.println("R// " + calculadora.potencia(a, b));
                    break;

                case 6:
                    System.out.println("Ingrese el numero para la raiz");
                    a = sc.nextInt();
                    System.out.println("R// " + calculadora.raiz(a));
                    break;

                case 7:

                    System.out.println("Ingrese el numero para la funcion Seno");
                    a = sc.nextInt();
                    System.out.println("R// en radianes : " + calculadora.FunSeno(a));

                    break;

                case 8:
                    System.out.println("Ingrese el numero para la funcion Coseno");
                    a = sc.nextInt();
                    System.out.println("R/ en radianes :  " + calculadora.FunCos(a));

                    break;

                case 9:
                    System.out.println("Ingrese el numero para la funcion Tangente");
                    a = sc.nextInt();
                    System.out.println("R// en radianes : " + calculadora.FunTan(a));

                    break;
                default:
                    System.out.println("Solo puedes ingresar los numeros seleccionados ( del 1 al 9 )");
                    System.out.println("Vuelve a ingresar un numero");
            }try {

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        System.out.println("... ¿Quiere volver a calcular? ...");
        System.out.println("1- si");
        System.out.println("0 - no");
        R = sc.nextInt();
    }

    public void mostrarOpciones() {
    }

    public Object leerOpciones() {
        return null;
    }

    public void procesarOpcion(Object leerOpciones) {
    }
}




