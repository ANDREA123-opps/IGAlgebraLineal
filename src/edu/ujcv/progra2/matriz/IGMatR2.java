package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

import javax.swing.*;

public class IGMatR2 {
    // TODO: implementar.
private int filas;
private int columnas;
private double matriz[][];
    private int num;
    private int colX;
    double x1,y1;
    double x2,y2;
    IGVecR2 f1;
    IGVecR2 f2;

    IGVecR2 col1;
    IGVecR2 col2;


    public int getColumnas() {
    return columnas;
}

public void setColumnas(int columnas){
    this.columnas = columnas;
}

public double[][] getMatriz() {

        return matriz;
}

public void setMatriz(double[][] matriz){

        this.matriz = matriz;
}

public int getFilas(){
    return filas;
}

    public void setFilas(int filas) {

        this.filas = filas;
    }
 public int getColx() {

        return colX ;
 }

 public void setColX(int colX ){
        this.colX = colX;
 }
    //Constructor
    public IGMatR2(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    matriz = new double[filas][columnas];
    }

    //Pedir datos
    public void datos(){
    int i,j;
      for (i = 0; i<filas;i++){
        for (j = 0; j<columnas; j++){
            matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
        }
      }
    }


   public IGMatR2 mul(IGMatR2 b){
        IGMatR2 matC = new IGMatR2(filas,b.columnas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<b.columnas; j++){
                int sum = 0;
                for (double k = 0; k<columnas; k++){
                    sum = (int) (matriz[i][(int) k] * b.matriz[(int) k][j]);
                }
                matC.matriz[i][j] = sum;
            }
        }
        return matC;
    }

    public IGMatR2 colXMat(IGVecR2 col){
        IGMatR2 resultado = new IGMatR2(filas, columnas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++){
                for (int k = 0; k<columnas; k++){
                   resultado.x1 = ;
                   resultado.x2 =
                }
            }
        }
        return resultado;
   }

      public IGMatR2 suma (IGMatR2 b) {
       IGMatR2 resultado = new IGMatR2(filas, columnas);
                for (int i = 0; i<filas; i++){
                    for (int j = 0; j<columnas; j++){
                        resultado.matriz[i][j] = matriz[i][j] + b.matriz[i][j];
                    }
                }
return resultado;
}

    public IGMatR2 resta (IGMatR2 b) {
        IGMatR2 resultado = new IGMatR2(filas, columnas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++){
                resultado.matriz[i][j] = matriz[i][j] +(- b.matriz[i][j]);
            }
        }
        return resultado;
    }

    public IGMatR2 escalarXmat(double escalar){
        IGMatR2 resultado = new IGMatR2(filas, columnas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++){
                resultado.matriz[i][j] = num * matriz[i][j];
                }
            }
    return resultado;
    }

    public static IGVecR2 rotacion (double angulo, IGVecR2 vector){

    return null;
    }
}
