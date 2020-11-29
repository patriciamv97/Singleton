package com.singleton;

/**
 * Solo una instancia
 */
public class Singleton {
    //Añadimos atributos para comprobar que siempre es el mismo objeto
    private String nombre;
    private Integer edad;

    /**
     * Constructor bloqueado con private
     */
    private Singleton(){}

    /**
     * Metdodo que permite establecer la edad de la persona
     * @param edad
     */
    public void  setEdad(Integer edad){
        this.edad=edad;
    }

    /**
     * Metodo que permite establecer el nombre de la persona
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
