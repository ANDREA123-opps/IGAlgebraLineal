package edu.ujcv.progra2.vector;

public class IGVecR4 {

    private double x;
    private double y;
    private double z;

    public IGVecR4(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public IGVecR4(double x, double y, double z ){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public IGVecR4(IGVecR4 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public IGVecR4 suma(IGVecR4 b){
        //TODO: implementar
        return new IGVecR4();
    }

    public IGVecR4 resta(IGVecR4 b){
        //TODO: implementar
        return new IGVecR4();
    }

    //producto.
    public  IGVecR4 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR4();
    }

    public double productoPunto(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
