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
      this.x1 = 0;
      this.y1 = 0;
    }
    public IGMatR2(double x1, double y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    public IGMatR2(IGMatR2 b){
        this.x1 = b.x1;
        this.y1 = b.y1;
    }

public


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
