package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

import javax.swing.*;

public class IGMatR2 {
    // TODO: implementar.
private int filas;
private int columnas;
private double matriz[][];
    private IGMatR2 mat;
    private int num;
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
        IGMatR2 matC = new IGMatR2(filas,mat.columnas);
        for (int i = 0; i<filas; i++){
            for (int j = 0; j<mat.columnas; j++){
                int sum = 0;
                for (double k = 0; k<columnas; k++){
                    sum = matriz[i][j] * mat.matriz[k][j];
                }
                matC.matriz[i][j] = sum;
            }
        }
        return matC;
    }

    public IGVecR2 colXMat(IGVecR2 col){

   }

      public IGMatR2 suma (IGMatR2 b) {
       IGMatR2 resultado = new IGMatR2(filas, columnas);
                for (int i = 0; i<filas; i++){
                    for (int j = 0; j<columnas; j++){
                        resultado.matriz[i][j] = matriz[i][j] + mat.matriz[i][j];
                    }
                }
return resultado;
}

    public IGMatR2 escalarXmat(double escalar){

    }

    public static IGVecR2 rotacion (double angulo, IGVecR2 vector){

    }



      }
}
