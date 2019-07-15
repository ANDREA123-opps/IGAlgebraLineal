package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR4;

public class IGMatR4 {

    // public static IGVecR2 rotacionZ (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionX (double angulo, IGVecR2 vector){
//
//    }

    // public static IGVecR2 rotacionY (double angulo, IGVecR2 vector){
//
//    }
    private IGVecR4 col1;
    private IGVecR4 col2;
    private IGVecR4 col3;
    private IGVecR4 col4;

    public IGMatR4(){
        col1 = new IGVecR4(1,0,0,0);
        col2 = new IGVecR4(0,1,0,0);
        col3 = new IGVecR4(0,0,1,0);
        col4 = new IGVecR4(0,0,0,1);
    }

    public IGMatR4(IGVecR4 col1, IGVecR4 col2, IGVecR4 col3, IGVecR4 col4){
        this.col1 = new IGVecR4(col1);
        this.col2 = new IGVecR4(col2);
        this.col3 = new IGVecR4(col3);
        this.col4 = new IGVecR4(col4);
    }

    public IGMatR4(IGMatR4 b){
        this.col1 = new IGVecR4(b.col1);
        this.col2 = new IGVecR4(b.col2);
        this.col3 = new IGVecR4(b.col3);
        this.col4 = new IGVecR4(b.col4);
    }
    public IGMatR4 suma (IGMatR4 b){
        IGMatR4 retval = new IGMatR4();
        retval.setCol1(this.col1.suma(b.col1));
        retval.setCol2(this.col2.suma(b.col2));
        retval.setCol3(this.col3.suma(b.col3));
        retval.setCol4(this.col4.suma(b.col4));
        return retval;
    }

    public IGMatR4 resta (IGMatR4 b){
        IGMatR4 retval = new IGMatR4();
        retval.setCol1(this.col1.resta(b.col1));
        retval.setCol2(this.col2.resta(b.col2));
        retval.setCol3(this.col3.resta(b.col3));
        retval.setCol4(this.col4.resta(b.col4));
        return retval;
    }

    public  IGMatR4 mulEscalar(double alpha){
        IGMatR4 retval = new IGMatR4();

        retval.col1.setX(this.col1.getX() * alpha);
        retval.col1.setY(this.col1.getY() * alpha);
        retval.col1.setZ(this.col1.getZ() * alpha);
        retval.col1.setW(this.col1.getW() * alpha);

        retval.col2.setX(this.col2.getX() * alpha);
        retval.col2.setY(this.col2.getY() * alpha);
        retval.col2.setZ(this.col2.getZ() * alpha);
        retval.col2.setW(this.col2.getW() * alpha);

        retval.col3.setX(this.col3.getX() * alpha);
        retval.col3.setY(this.col3.getY() * alpha);
        retval.col3.setZ(this.col3.getZ() * alpha);
        retval.col3.setW(this.col3.getW() * alpha);

        retval.col4.setX(this.col4.getX() * alpha);
        retval.col4.setY(this.col4.getY() * alpha);
        retval.col4.setZ(this.col4.getZ() * alpha);
        retval.col4.setW(this.col4.getW() * alpha);

        return  retval;
    }
    public IGVecR4 mulVector(IGVecR4 v){
        IGVecR4 retval = new IGVecR4(col1.getZ(), col2.getZ(), col3.getZ(), col4.getZ());
        retval.setX(v.productoPunto(this.getF1()));
        retval.setY(v.productoPunto(this.getF2()));
        retval.setZ(v.productoPunto(this.getF3()));
        retval.setW(v.productoPunto(this.getF4()));
        return retval;
    }

    public IGMatR4 mul (IGMatR4 b){
        IGMatR4 retval =  new IGMatR4();

        retval.setCol1(new IGVecR4(this.getF1().productoPunto(b.col1),this.getF2().productoPunto(b.col1), this.getF3().productoPunto(b.col1),this.getF4().productoPunto(b.col1)));
        retval.setCol2(new IGVecR4(this.getF1().productoPunto(b.col2),this.getF2().productoPunto(b.col2), this.getF3().productoPunto(b.col2),this.getF4().productoPunto(b.col2)));
        retval.setCol3(new IGVecR4(this.getF1().productoPunto(b.col3),this.getF2().productoPunto(b.col3), this.getF3().productoPunto(b.col3),this.getF4().productoPunto(b.col3)));
        retval.setCol4(new IGVecR4(this.getF1().productoPunto(b.col4),this.getF2().productoPunto(b.col4), this.getF3().productoPunto(b.col4),this.getF4().productoPunto(b.col4)));
        return retval;
    }

    public IGVecR4 getF1(){
        IGVecR4 retval = new IGVecR4(col1.getX(),col2.getX(), col3.getX(), col4.getX());
        return retval;
    }

    public void  setF1(IGVecR4 F1){
        this.col1.setX(F1.getX());
        this.col2.setX(F1.getY());
        this.col3.setX(F1.getZ());
        this.col4.setX(F1.getW());
    }

    public IGVecR4 getF2(){
        IGVecR4 retval = new IGVecR4(col1.getY(),col2.getY(),col3.getY(),col4.getY());
        return retval;
    }

    public void  setF2(IGVecR4 F2){
        this.col1.setY(F2.getX());
        this.col2.setY(F2.getY());
        this.col3.setY(F2.getZ());
        this.col4.setY(F2.getW());
    }

    public IGVecR4 getF3(){
        IGVecR4 retval = new IGVecR4(col1.getZ(),col2.getZ(),col3.getZ(),col4.getZ());
        return retval;
    }

    public void  setF3(IGVecR4 F3){
        this.col1.setZ(F3.getX());
        this.col2.setZ(F3.getY());
        this.col3.setZ(F3.getZ());
        this.col4.setZ(F3.getZ());
    }

    public IGVecR4 getF4(){
        IGVecR4 retval = new IGVecR4(col1.getW(),col2.getW(),col3.getW(),col4.getW());
        return retval;
    }

    public void  setF4 (IGVecR4 F4){
        this.col1.setW(F4.getX());
        this.col2.setW(F4.getY());
        this.col3.setW(F4.getZ());
        this.col4.setW(F4.getZ());
    }

    public IGVecR4 getCol1() {
        return col1;
    }

    public void setCol1(IGVecR4 col1) {
        this.col1 = col1;
    }

    public IGVecR4 getCol2() {
        return col2;
    }

    public void setCol2(IGVecR4 col2) {
        this.col2 = col2;
    }

    public IGVecR4 getCol3() {
        return col3;
    }

    public void setCol3(IGVecR4 col3) {
        this.col3 = col3;
    }

    public IGVecR4 getCol4() {
        return col4;
    }

    public void setCol4(IGVecR4 col4) {
        this.col4 = col4;
    }

    public String getX() {
        return null;
    }

    public String getY() {
        return null;
    }

    public String getZ() {
        return null;
    }

    public String getW() {
        return null;
    }

    public IGVecR4 mulVector(IGMatR4 mat8) {
        return null;
    }
}
