package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR3;

public class IGMatR3 {


    // public static IGVecR2 rotacionZ (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionX (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionY (double angulo, IGVecR2 vector){
//
//    }

    private IGVecR3 col1;
    private IGVecR3 col2;
    private IGVecR3 col3;


    public IGMatR3 (){
        col1 = new IGVecR3(1,0,0);
        col2 = new IGVecR3(0,1,0);
        col3 = new IGVecR3(0,0,1);
    }

    public IGMatR3 (IGVecR3 col1, IGVecR3 col2, IGVecR3 col3){
        this.col1 = new IGVecR3(col1);
        this.col2 = new IGVecR3(col2);
        this.col3 = new IGVecR3(col3);
    }

    public IGMatR3 (IGMatR3 b){
        this.col1 = new IGVecR3(b.col1);
        this.col2 = new IGVecR3(b.col2);
        this.col3 = new IGVecR3(b.col3);
    }

    public IGMatR3 suma (IGMatR3 b){
        IGMatR3 retval = new IGMatR3();

        retval.setCol1(this.col1.suma(b.col1));
        retval.setCol2(this.col2.suma(b.col2));
        retval.setCol3(this.col3.suma(b.col3));
        return retval;
    }
    public IGMatR3 resta (IGMatR3 b){
        IGMatR3 retval = new IGMatR3();
        retval.setCol1(this.col1.resta(b.col1));
        retval.setCol2(this.col2.resta(b.col2));
        retval.setCol3(this.col3.resta(b.col3));
        return retval;
    }

    public IGVecR3 mul (IGVecR3 v){
        IGVecR3 retval = new IGVecR3();
        retval.setX((int) v.productoPunto(this.getF1()));
        retval.setY((int) v.productoPunto(this.getF2()));
        retval.setZ((int) v.productoPunto(this.getF3()));
        return retval;
    }

    public IGMatR3 mul(IGMatR3 b){
        IGMatR3 retval = new IGMatR3();
        retval.setCol1(new IGVecR3(this.getF1().productoPunto(b.col1),this.getF2().productoPunto(b.col1),this.getF3().productoPunto(b.col1)));
        retval.setCol2(new IGVecR3(this.getF1().productoPunto(b.col2),this.getF2().productoPunto(b.col2),this.getF3().productoPunto(b.col2)));
        retval.setCol3(new IGVecR3(this.getF1().productoPunto(b.col3),this.getF2().productoPunto(b.col3),this.getF3().productoPunto(b.col3)));
        return retval;
    }

    public IGMatR3 escalarXmat(double escalar){
        IGMatR3 retval = new IGMatR3();
        retval.col1.setX((int) (this.col1.getX() * escalar));
        retval.col2.setY((int) (this.col2.getY() * escalar));
        retval.col3.setZ((int) (this.col3.getZ() * escalar));
        retval.col1.setX((int) (this.col1.getX() * escalar));
        retval.col2.setY((int) (this.col2.getY() * escalar));
        retval.col3.setZ((int) (this.col3.getZ() * escalar));
        return retval;
    }

    public IGVecR3 rotZ (double angulo, IGVecR3 vector){
        IGMatR3 rot = new IGMatR3();

        rot.getCol1().setX((int) Math.cos(angulo));
        rot.getCol1().setY((int) Math.sin(angulo));
        rot.getCol1().setZ(0);
        rot.getCol2().setX((int) -Math.sin(angulo));
        rot.getCol2().setY((int) Math.cos(angulo));
        rot.getCol2().setZ(0);
        rot.getCol3().setX(0);
        rot.getCol3().setY(0);
        rot.getCol3().setZ(1);

        return rot.multvector(vector);
    }

    public IGVecR3 rotX (double angulo, IGVecR3 vec){
        IGMatR3 rot = new IGMatR3();

        rot.getCol1().setX(1);
        rot.getCol1().setY(0);
        rot.getCol1().setZ(0);
        rot.getCol2().setX(0);
        rot.getCol2().setY((int) Math.cos(angulo));
        rot.getCol2().setZ((int) Math.sin(angulo));
        rot.getCol3().setX(0);
        rot.getCol3().setY((int) -Math.sin(angulo));
        rot.getCol3().setZ((int) Math.cos(angulo));

        return rot.multvector(vec);
    }

    private IGVecR3 multvector(IGVecR3 vec) {

        return null;
    }

    public IGVecR3 rotY (double angulo, IGVecR3 vec1){
        IGMatR3 rot = new IGMatR3();

        rot.getCol1().setX((int) Math.cos(angulo));
        rot.getCol1().setY(0);
        rot.getCol1().setZ((int) -Math.sin(angulo));
        rot.getCol2().setX(0);
        rot.getCol2().setY(1);
        rot.getCol2().setZ(0);
        rot.getCol3().setX((int) Math.sin(angulo));
        rot.getCol3().setY(0);
        rot.getCol3().setZ((int) Math.cos(angulo));

        return rot.multvector(vec1);
    }
    public IGVecR3 getF1(){
        IGVecR3 retval = new IGVecR3(col1.getX(),col2.getX(), col3.getX());
        return retval;
    }

    public void  setF1 (IGVecR3 F1){
        this.col1.setX((int) F1.getX());
        this.col2.setX(F1.getY());
        this.col3.setX(F1.getZ());
    }

    public IGVecR3 getF2(){
        IGVecR3 retval = new IGVecR3(col1.getY(),col2.getY(),col3.getY());
        return retval;
    }

    public void  setF2(IGVecR3 F2){
        this.col1.setY((int) F2.getX());
        this.col2.setY(F2.getY());
        this.col3.setY(F2.getZ());
    }

    public IGVecR3 getF3(){
        IGVecR3 retval = new IGVecR3(col1.getZ(),col2.getZ(),col3.getZ());
        return retval;
    }

    public void  setF3(IGVecR3 F3){
        this.col1.setZ((int) F3.getX());
        this.col2.setZ(F3.getY());
        this.col3.setZ(F3.getZ());
    }

    public IGVecR3 getCol1() {
        return col1;
    }

    public void setCol1 (IGVecR3 colX) {
        this.col1 = col1;
    }

    public IGVecR3 getCol2() {
        return col2;
    }

    public void setCol2 (IGVecR3 col2) {
        this.col2 = col2;
    }

    public IGVecR3 getCol3() {
        return col3;
    }

    public void setCol3(IGVecR3 col3) {
        this.col3 = col3;
    }
}
