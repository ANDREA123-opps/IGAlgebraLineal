package edu.ujcv.progra2.vector;

public class IGVecR2 {
    public IGVecR2 col1;
    public IGVecR2 col2;


    //privado los datos
    // un escalar que represente 'x' y 'y' los componentes del vector


    // publico los constructores por defecto, copia, y conveniencia. recuerden a bob


    // publico accesoras y mutadoras

    //publico interfase

    //this es el vector a


    // c.x = a.x + b.x
    // c.y = a.y + b.y
    double x1 = 0;
    double x2 = 0;
    double y1 = 0;
    double y2 = 0;

    public double x;
   private double y;

    public IGVecR2() {
        this.x = 0;
        this.y = 0;
    }
    public IGVecR2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public IGVecR2(IGVecR2 b){
        this.x = b.x;
        this.y = b.y;
    }
    public double getX(){
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

    public IGVecR2 suma(IGVecR2 b) {
        IGVecR2 retval = new IGVecR2();
        retval.x = x1 + y1;
        retval.y = x2 + y2;
        return retval;
    }


    public IGVecR2 resta(IGVecR2 b){
        //TODO: implementar
        IGVecR2 retval = new IGVecR2();
        retval.x = x1 - y1;
        retval.y = x2 - y2;
        return retval;
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        //TODO: implementar
        IGVecR2 retval = new IGVecR2();
        retval.x = x*alpha;
        retval.y = y*alpha;
        return new IGVecR2();
    }

    public  double productoPunto(IGVecR2 b){
        //TODO: implementar
       double retval;
       retval = (x1 * y1)+(x2 * y2);
       return retval;


    }


    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){

    //}


   // public double determinante(){
        //TODO: implementar
     //   return 0.0;
    //}

    public double angulo(IGVecR2 b){
        //TODO: implementar
        double retval;
        double xy = (x1 * y1)+(x2 * y2);
        double a = (Math.sqrt((x1*x1)+(x2*x2)) * Math.sqrt((y1*y1)+(y2*y2)));
        double c = Math.cos(xy / a);
        retval = Math.acos(c);
        return retval;
    }

    public double magnitud(){
       // return Math.sqrt(productoPunto(this));
        return Math.sqrt((this.x * this.x)+(this.y * this.y));
    }



}
