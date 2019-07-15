package edu.ujcv.progra2.menus;

import edu.ujcv.progra2.utility.LectorDeTecladoValidado;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

public class menuVecR {
    LectorDeTecladoValidado LTV = LectorDeTecladoValidado.getInstance();
    public int opcion;

    public void mostrarOpcionR2() {
        System.out.println("Has selecionado Vectores en R2 ");
        System.out.println("\n 1. Suma de vectores");
        System.out.println("\n 2. Resta de vectores");
        System.out.println("\n 3. Multiplicacion por un escalar");
        System.out.println("\n 4. Producto Punto");
        System.out.println("\n 5. Magnitud");
        System.out.println("\n 6. Angulo");
        System.out.println("\n 7. Volver atras");
    }

    public int LeeropcionR2() {
        opcion = LTV.getInteger("Ingrese una opción", "Ingreso una opción no valida. Intente de nuevo");
        return opcion;
    }

    public int operandoR2(int opcion) {
        switch (opcion) {
            case 1:

                IGVecR2 A1 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B1 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar" );
                IGVecR2 res = A1.suma(B1);

                System.out.println("El resultado de la suma de vectores es: \n");
                imprimirIGVecR2 (res);
                break;

            case 2:
                IGVecR2 A2 = LeerVectorR2( "Vector 1","Ingrese el vector 1","El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B2 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 res2 = A2.resta(B2);

                System.out.println("El resultado de la resta de vectores es; \n");
                imprimirIGVecR2(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = LTV.getDouble("Ingrese el valor del escalar", "El caracter que ingreso NO es válido. Por Favor vuelva a intentar");
                IGVecR2 A3 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 res3 = A3.escalarPorVector(alpha);

                System.out.println("El resultado de la multiplicación por un escalar es: \n");
                imprimirIGVecR2(res3);
                break;

            case 4:
                IGVecR2 A4 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR2 B4 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " + res4);
                break;

            case 5:
                IGVecR2 A5 = LeerVectorR2("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res5 = A5.magnitud(A5);

                System.out.println("El resultado de la magnitud vectorial es: " + res5);
                break;

            case 6:
                IGVecR2 A6 = LeerVectorR2("Vector 1","Ingrese el vector 1","El caracter que ingreso NO es válido. Por favor vuelva a intentar" );
                IGVecR2 B6 = LeerVectorR2("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res6 = A6.angulo(A6,B6);

                System.out.println("El resultado del angulo entre dos vectores es: " + res6);
                break;

            case 7:
                System.out.println("Has regresado al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public void mostrarOpcionR3() {
        System.out.println("\t Has salecionado Vectores en R3 ");
        System.out.println("\n 1. Suma de vectore.");
        System.out.println("\n 2. Resta de vectores.");
        System.out.println("\n 3. Multiplicacion por un escalar.");
        System.out.println("\n 4. Producto Punto.");
        System.out.println("\n 5. Magnitud.");
        System.out.println("\n 6. Angulo.");
        System.out.println("\n 7. Producto Cruz");
        System.out.println("\n 8. Volver atras.");
    }

    public int LeeropcionR3() {
        opcion = LTV.getInteger("Ingrese una opción", "Ingreso una opción no valida. Intente de nuevo");
        return opcion;
    }

    public int operandoR3(int opcion) {
        switch (opcion) {
            case 1:

                IGVecR3 A1 = LeerVectorR3("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR3 B1 = LeerVectorR3("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar" );
                IGVecR3 res = A1.suma(B1);

                System.out.println("El resultado de la suma de vectores es: \n");
                imprimirIGVecR3 (res);
                break;

            case 2:
                IGVecR3 A2 = LeerVectorR3( "Vector 1","Ingrese el vector 1","El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR3 B2 = LeerVectorR3("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR3 res2 = A2.resta(B2);

                System.out.println("El resultado de la resta de vectores es; \n");
                imprimirIGVecR3(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = LTV.getDouble("Ingrese el valor del escalar", "El caracter que ingreso NO es válido. Por Favor vuelva a intentar");
                IGVecR3 A3 = LeerVectorR3("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR3 res3 = A3.escalarPorVector(alpha);

                System.out.println("El resultado de la multiplicación por un escalar es: \n");
                imprimirIGVecR3(res3);
                break;

            case 4:
                IGVecR3 A4 = LeerVectorR3("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR3 B4 = LeerVectorR3("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " + res4);
                break;

            case 5:
                IGVecR3 A5 = LeerVectorR3("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res5 = A5.magnitud(A5);

                System.out.println("El resultado de la magnitud vectorial es: " + res5);
                break;

            case 6:
                IGVecR3 A6 = LeerVectorR3("Vector 1","Ingrese el vector 1","El caracter que ingreso NO es válido. Por favor vuelva a intentar" );
                IGVecR3 B6 = LeerVectorR3("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res6 = A6.angulo(A6,B6);

                System.out.println("El resultado del angulo entre dos vectores es: " + res6);
                break;
            case 7:
                IGVecR3 A7 = LeerVectorR3("Vector 1","Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR3 B7 = LeerVectorR3("Vector 2", "Ingrese el vector 2", "El caracter que ingreso No es valido. Por favor vuelva a intentar");
                IGVecR3 res7 = A7.productoCruz(B7);

                System.out.println("El resultado del producto cruz es: \n");
                imprimirIGVecR3(res7);
                break;

            case 8:
                System.out.println("Has vuelto al menu principal \n \n");
                break;
        }
        return opcion;
    }

    public void mostrarOpcionR4() {
        System.out.println("\t Has selecionado Vectores en R4 ");
        System.out.println("\n 1. Suma de vectores");
        System.out.println("\n 2. Resta de vectores");
        System.out.println("\n 3. Multiplicacion por un escalar");
        System.out.println("\n 4. Producto Punto");
        System.out.println("\n 5. Magnitud");
        System.out.println("\n 6. Angulo");
        System.out.println("\n 7. Regresar");
    }

    public int LeeropcionR4() {
        opcion = LTV.getInteger("Ingrese una opción", "Ingreso una opción no valida. Intente de nuevo");
        return opcion;
    }

    public int operandoR4(int opcion) {
        switch (opcion) {
            case 1:

                IGVecR4 A1 = LeerVectorR4("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 B1 = LeerVectorR4("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 res = A1.suma(B1);

                System.out.println("El resultado de la suma de vectores es: \n");
                imprimirIGVecR4(res);
                break;

            case 2:
                IGVecR4 A2 = LeerVectorR4("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 B2 = LeerVectorR4("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 res2 = A2.resta(B2);

                System.out.println("El resultado de la resta de vectores es; \n");
                imprimirIGVecR4(res2);
                break;

            case 3:
                double alpha = 0;
                alpha = LTV.getDouble("Ingrese el valor del escalar", "El caracter que ingreso NO es válido. Por Favor vuelva a intentar");
                IGVecR4 A3 = LeerVectorR4("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 res3 = A3.escalarPorVector(alpha);

                System.out.println("El resultado de la multiplicación por un escalar es: \n");
                imprimirIGVecR4(res3);
                break;

            case 4:
                IGVecR4 A4 = LeerVectorR4("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 B4 = LeerVectorR4("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res4 = A4.productoPunto(B4);

                System.out.println("El restultado del producto punto es: " + res4);
                break;

            case 5:
                IGVecR4 A5 = LeerVectorR4("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res5 = A5.magnitud(A5);

                System.out.println("El resultado de la magnitud vectorial es: " + res5);
                break;

            case 6:
                IGVecR4 A6 = LeerVectorR4("Vector 1", "Ingrese el vector 1", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                IGVecR4 B6 = LeerVectorR4("Vector 2", "Ingrese el vector 2", "El caracter que ingreso NO es válido. Por favor vuelva a intentar");
                double res6 = A6.angulo(A6, B6);

                System.out.println("El resultado del angulo entre dos vectores es: " + res6);
                break;

            case 7:
                System.out.println("Has vuelto al menu principal \n \n");
                break;
        }
        return opcion;
    }


    public IGVecR2 LeerVectorR2 (String nombreVec, String mensaje, String mensajeError) {
        IGVecR2 A = new IGVecR2(1.0, 1.1);

        A.setX(LTV.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por favor vuelva a intentar"));
        A.setY(LTV.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por favor vuelva a intentar "));

        return new IGVecR2(A);
    }
    public IGVecR3 LeerVectorR3 (String nombreVec, String mensaje, String mensajeError){
        IGVecR3 A = new IGVecR3(1.0, 1.1, 0.3);

        A.setX((int) LTV.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por Favor vueleva a intentar"));
        A.setY((int) LTV.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setZ((int) LTV.getDouble("Ingrese el tercer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar "));

        return new IGVecR3(A);
    }
    public IGVecR4 LeerVectorR4 (String nombreVec, String mensaje, String mesajeError){
        IGVecR4 A = new IGVecR4(1.0, 1.1, 0.3, 0.5);

        A.setX(LTV.getDouble("Ingrese el primer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setY(LTV.getDouble("Ingrese el segundo vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setZ(LTV.getDouble("Ingrese el tercer vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));
        A.setW(LTV.getDouble("Ingrese el cuarto vector", "El caracter que ingreso no es válido. Por Favor vuelva a intentar"));

        return new IGVecR4(A);
    }

    public void imprimirIGVecR2 (IGVecR2 a){
        System.out.println("(" + a.getX() +","+ a.getY()+ ")");
    }

    public void imprimirIGVecR3(IGVecR3 a){

        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ()+")");
    }

    public void imprimirIGVecR4 (IGVecR4 a){
        System.out.println("(" + a.getX() +","+ a.getY() +","+ a.getZ() +","+ a.getW()+")");
    }
}
