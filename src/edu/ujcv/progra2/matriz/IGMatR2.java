package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

import javax.swing.*;

public class IGMatR2 {
    // TODO: implementar.


    double x1,y1;
    double x2,y2;
    private IGVecR2 f1;
    private IGVecR2 f2;
    private IGVecR2 col1;
    private IGVecR2 col2;

    //Constructor
    public IGMatR2(){
        col1 = new IGVecR2(1,0);
        col2 = new IGVecR2(0,1);
    }

    public IGVecR2 getCol1(){
        return col1;
    }

    public void setCol1(IGVecR2 col1) {
        this.col1 = col1;
    }

    public IGVecR2 getCol2(){
        return col2;
    }

    public void setCol2(IGVecR2 col2) {
        this.col2 = col2;
    }

    public IGVecR2 getF1(){
        IGVecR2 retval = new IGVecR2(col1.getX(), col2.getX());
        return retval;
    }
    public void setF1(){
        this.col1.setX(f1.getX());
        this.col2.setX(f1.getY());
    }
    public IGVecR2 getF2(){
        IGVecR2 retval = new IGVecR2(col1.getY(), col2.getY());
        return retval;
    }

    public void setF2(IGVecR2 f2) {
        this.col1.setY(f2.getX());
        this.col2.setY(f2.getY());
    }

    public IGMatR2 mul(IGMatR2 b){
      IGMatR2 retval = new IGMatR2();


    }

    public IGMatR2 colXMat(IGVecR2 col){

   }

      public IGMatR2 suma (IGMatR2 b) {

}

    public IGMatR2 resta (IGMatR2 b) {

    }

    public IGMatR2 escalarXmat(double escalar){

      ;
    }

    public static IGVecR2 rotacion (double angulo, IGVecR2 vector){


    }
}
