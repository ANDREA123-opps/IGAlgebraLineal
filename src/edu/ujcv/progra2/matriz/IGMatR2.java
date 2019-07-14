package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR2;

public class IGMatR2 {
    // TODO: implementar.

    double v[];
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
    public  IGVecR2 getF2(){
        IGVecR2 retval = new IGVecR2(col1.getY(), col2.getY());
        return retval;
    }

    public void setF2(IGVecR2 f2) {
        this.col1.setY(f2.getX());
        this.col2.setY(f2.getY());
    }

    public IGMatR2 mul(IGVecR2 b){
      IGMatR2 retval = new IGMatR2();
      retval.col1.setX(this.getF1().productoPunto(b.col1));
      retval.col1.setY(this.getF2().productoPunto(b.col1));
      retval.col2.setX(this.getF1().productoPunto(b.col2));
      retval.col2.setY(this.getF2().productoPunto(b.col2));
      return  retval;

    }

    public IGVecR2 colXMat(IGVecR2 col){
    IGVecR2 retval = new IGVecR2();
    IGMatR2 a = new IGMatR2();
    a.col1.setX(this.getF1().productoPunto(a.col1));
    a.col1.setX(this.getF2().productoPunto(a.col1));
    return retval;
   }

      public IGMatR2 suma (IGMatR2 b) {
      IGMatR2 retval = new IGMatR2();
      retval.col1.setX(this.col1.getX()+b.col1.getX());
      retval.col1.setY(this.col1.getY()+b.col1.getY());
      retval.col2.setX(this.col2.getX()+b.col2.getX());
      retval.col2.setY(this.col2.getY()+b.col2.getY());
      return retval;
    }

    public IGMatR2 resta (IGMatR2 b) {
        IGMatR2 retval = new IGMatR2();
        retval.col1.setX(this.col1.getX()-b.col1.getX());
        retval.col1.setY(this.col1.getY()-b.col1.getY());
        retval.col2.setX(this.col2.getX()-b.col2.getX());
        retval.col2.setY(this.col2.getY()-b.col2.getY());
        return retval;
    }

    public IGMatR2 escalarXmat(double escalar){
    IGMatR2 retval = new IGMatR2();
    retval.col1.setX(this.col1.getX()*escalar);
    retval.col1.setY(this.col1.getY()*escalar);
    retval.col2.setX(this.col2.getX()*escalar);
    retval.col2.setY(this.col2.getY()*escalar);
    return retval;
    }

    public static IGMatR2 rotacion (double angulo, IGVecR2 vector){
      IGMatR2 rot = new IGMatR2();
      double x;
      rot.col1.x = Math.cos(angulo);
      rot.col2.x = -Math.sin(angulo);
      rot.col1.x = Math.sin(angulo);
      rot.col2.x = Math.cos(angulo);
      return rot.mul(vector);

    }

}
