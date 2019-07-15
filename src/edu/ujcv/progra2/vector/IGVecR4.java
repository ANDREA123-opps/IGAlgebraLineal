package edu.ujcv.progra2.vector;

public class IGVecR4 {

    private double x;
    private double y;
    private double z;
    private double w;

    public IGVecR4(double z, double col2Z, double col3Z, double col4Z){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }
    public IGVecR4(double x, double y, double z ){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    public IGVecR4(IGVecR4 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
        this.w = b.w;
    }
     public IGVecR4 suma (IGVecR4 b){
         IGVecR4 col1 = null;
         IGVecR4 col2 = null;
         IGVecR4 col3 = null;
         IGVecR4 col4 = null;
         IGVecR4 retval = new IGVecR4(col1.getZ(), col2.getZ(), col3.getZ(), col4.getZ());
    retval.x = (x + b.x);
    retval.y = (y + b.y);
    retval.z = (z + b.z);
    retval.w = (w + b.w);
        return retval;
}

    public IGVecR4 resta(IGVecR4 b){
        IGVecR4 col1 = null;
        IGVecR4 col2 = null;
        IGVecR4 col3 = null;
        IGVecR4 col4 = null;
        IGVecR4 retval = new IGVecR4(col1.getZ(), col2.getZ(), col3.getZ(), col4.getZ());
        retval.x = (x - b.x);
        retval.y = (y - b.y);
        retval.z = (z - b.z);
        retval.w = (w - b.w);
        return retval;
    }

    public  IGVecR4 escalarPorVector(double alpha){
        IGVecR4 col1 = null;
        IGVecR4 col2 = null;
        IGVecR4 col3 = null;
        IGVecR4 col4 = null;
        IGVecR4 retval = new IGVecR4(col1.getZ(), col2.getZ(), col3.getZ(), col4.getZ());
        retval.x = (alpha * x);
        retval.y = (alpha * y);
        retval.z = (alpha * z);
        retval.w = (alpha * w);
        return retval;
    }

    public double productoPunto(IGVecR4 b){
        double retval;
        retval = (x * b.x) + (y * b.y) + (z * b.z) + (w * b.w);
        return retval;
    }

    public double magnitud (IGVecR4 b){
        return Math.sqrt((Math.pow(b.x,2) + Math.pow(b.y,2) + Math.pow(b.z,2) + Math.pow (b.w,2)));
    }

    public double angulo(IGVecR4 a, IGVecR4 b){
        double retval;
        retval = Math.cos(a.productoPunto(b)/(magnitud(a)* magnitud(b)));
        return Math.toDegrees(retval);
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

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}
