package edu.ujcv.progra2.vector;

public class IGVecR2 {
    public IGVecR2 col1;
    public IGVecR2 col2;
    private double x;
    private double y;
    // publico los constructores por defecto, copia, y conveniencia. recuerden a bob


    // publico accesoras y mutadoras

    //publico interfase

    //this es el vector a
    // c.x = a.x + b.x
    // c.y = a.y + b.y
    public IGVecR2 (){
        this.x = 0;
        this.y = 0;
    }

    public IGVecR2 (double x, double y){
        this.x = x;
        this.y = y;
    }

    public IGVecR2 (IGVecR2 b){
        this.x = b.x;
        this.y = b.y;
    }

    public IGVecR2 suma(IGVecR2 b){
        IGVecR2 retval = new IGVecR2();
        retval.x = (x + b.x);
        retval.y = (y + b.y);

        return retval;
    }

    public IGVecR2 resta(IGVecR2 b){
        IGVecR2 retval = new IGVecR2();
        retval.x = (x - b.x);
        retval.y = (y - b.y);
        return retval;
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        IGVecR2 retval = new IGVecR2();
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        return retval;
    }

    public double productoPunto(IGVecR2 b){
        double retval;
        retval = (x * b.x) + (y * b.y);
        return retval;
    }

    public double magnitud(IGVecR2 b){
        return Math.sqrt((Math.pow(b.x,2) + Math.pow(b.y,2)));
    }

    public double magnitud(){
        return Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
    }

    public double angulo( IGVecR2 a, IGVecR2 b){
        double retval;
        retval = Math.acos(a.productoPunto(b)/(magnitud(a) * magnitud(b)));
        return Math.toDegrees(retval);
    }

    public double getX (){
        return x;
    }

    public void setX (double x){
        this.x = x;
    }

    public double getY (){
        return y;
    }

    public void setY (double y){
        this.y = y;
    }



}
