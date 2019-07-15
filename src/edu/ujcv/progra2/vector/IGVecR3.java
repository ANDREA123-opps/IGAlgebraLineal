package edu.ujcv.progra2.vector;

public class IGVecR3 {

    double i;
    double j;
    double k;

    public IGVecR3(){
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }
    public IGVecR3(double i, double j, double k ){
        this.i = i;
        this.j = j;
        this.k = k;

    }
    public IGVecR3(IGVecR3 b){
        this.i = b.i;
        this.j = b.j;
        this.k = b.k;
    }

    public IGVecR3 suma(IGVecR3 b){
        //TODO: implementar
        IGVecR3 retval = new IGVecR3();
        retval.i = i + b.i;
        retval.j= j + b.j;
        retval.k = k + b.k;
        return retval;
    }

    public IGVecR3 resta(IGVecR3 b) {
        //TODO: implementar
        IGVecR3 retval = new IGVecR3();
        retval.i = i - b.i;
        retval.j = j - b.j;
        retval.k = k - b.k;
        return retval;
    }

        //producto.
        public IGVecR3 escalarPorVector (double alpha){
           IGVecR3 retval = new IGVecR3();
            retval.i = (i * alpha);
            retval.j = (j * alpha);
            retval.k = (k * alpha);
            return retval;
        }

        public double productoPunto (IGVecR3 b){

            double retval;
            retval = (i * b.i) + (j * b.j) + (k * b.k);
            return retval;

        }

        public IGVecR3 productoCruz(IGVecR3 b){
            IGVecR3 retval = new IGVecR3();
            retval.i = ((j * b.k) - (k * b.j));
            retval.j =((i * b.k) - (k * b.i));
            retval.k = ((i * b.j)-(j - b.i));
            return retval;
        }

    public double magnitud(IGVecR3 b){

        return Math.sqrt((Math.pow(b.i,2)+ Math.pow(b.j,2)+ Math.pow(b.k,2)));
    }

    public double angulo (IGVecR3 a, IGVecR3 b){
        double retval;
        retval = Math.cos(a.productoPunto(b)/(magnitud(a)* magnitud(b)));
        return Math.toDegrees(retval);
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setX(int i) {

    }

    public void setY(int i) {

    }

    public void setZ(int i) {

    }

    public double getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int getZ() {
        return 0;
    }
}
