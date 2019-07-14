package edu.ujcv.progra2.vector;

public class IGVecR3 {

    private double i;
    private double j;
    private double k;
    private double y;
    private double x;
    double x1 = 0, x2 = 0, x3 = 0, y1 = 0, y2 = 0, y3 = 0;
    public IGVecR3(double i, double j, double k){
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }
    public IGVecR3(double x, double y, double z, double U, double V ){
        this.i = x;
        this.j = y;
        this.k = z;
        this.x = x;
        this.y = y;
    }
    public IGVecR3(IGVecR3 b){
        this.i = b.i;
        this.j = b.j;
        this.k = b.k;
        this.x = b.x;
        this.y = b.y;
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
    public double getX(){
        return x = x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y = y;
    }
    public void setY(double y){
        this.y = y;
}
    public IGVecR3 suma(IGVecR3 b){
        //TODO: implementar
        this.i = x1 + y1;
        this.j= x2 + y2;
        this.k = x3 + y3;
        IGVecR3 retval = new IGVecR3(i, j, k);
        return retval;


    }

    public IGVecR3 resta(IGVecR3 b) {
        //TODO: implementar
        this.i = x1 - y1;
        this.j = x2 - y2;
        this.k = x3 + y3;
        IGVecR3 retval = new IGVecR3(i, j, k);
        return retval;


        //producto.
        public IGVecR3 escalarPorVector(double alpha){
            //TODO: implementar
            this.i = x1 * alpha;
            this.j = x2 * alpha;
            this.k = x3 * alpha;
            retval = new IGVecR3(i, j, k);
            return retval;

        }

        public double productoPunto(IGVecR3 b){
            //TODO: implementar
            double xy = ((x1 * y1) + (x1 * y2) + (x3 * y3));

        }


        public IGVecR3 productoCruz (IGVecR3 b){

            return new IGVecR3(i, j, k);
        }


        //public double determinante(){
        //TODO: implementar
          //  return 0.0;
        //}

        public double angulo (IGVecR3 b){
            //TODO: implementar
            double xy = (x1 * y1) + (x2 * y2) + (x3 * y3);
          double a = (Math.sqrt((x1 * x1) + (x2 * x2) + (x3 * x3)) * Math.sqrt((y1 * y1) + (y2 * y2) + (x3 * x3)));
            double c = Math.cos(xy / a);
            double d = Math.acos(c);


        }

        public double magnitud () {
            return Math.sqrt(productoPunto(this.x));
        }
    }
}
