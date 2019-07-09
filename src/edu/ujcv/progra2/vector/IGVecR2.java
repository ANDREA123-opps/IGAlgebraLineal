package edu.ujcv.progra2.vector;

public class IGVecR2 {

    //privado los datos
    // un escalar que represente 'x' y 'y' los componentes del vector


    // publico los constructores por defecto, copia, y conveniencia. recuerden a bob


    // publico accesoras y mutadoras

    //publico interfase

    //this es el vector a


    // c.x = a.x + b.x
    // c.y = a.y + b.y

   private double x;
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

    public IGVecR2 suma(IGVecR2 b){
       IGVecR2  retval = new IGVecR2();
      retval.x = x + b.x;
      retval.y = y + b.y;

return retval;
    }

    public IGVecR2 resta(IGVecR2 b){
        //TODO: implementar
        return new IGVecR2();
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR2();
    }

    public double productoPunto(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){

    //}


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }


}
