package edu.ujcv.progra2.vector;

public class IGVecR3 {

    private double x;
    private double y;
    private double z;

    public IGVecR3(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public IGVecR3(double x, double y, double z ){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public IGVecR3(IGVecR3 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }

    public IGVecR3 suma(IGVecR3 b){
        //TODO: implementar
        return new IGVecR3();
    }

    public IGVecR3 resta(IGVecR3 b){
        //TODO: implementar
        return new IGVecR3();
    }

    //producto.
    public  IGVecR3 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR3();
    }

    public double productoPunto(IGVecR3 b){
        //TODO: implementar
        return 0.0;
    }



    public IGVecR3 productoCruz(IGVecR3 b){

        return new IGVecR3();
    }


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR3 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
}
