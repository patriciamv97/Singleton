package com.singleton;

/**
 * Solo una instancia
 */
public class Singleton {
    //Añadimos atributos para comprobar que siempre es el mismo objeto
    private String nombre;
    private Integer edad;
    //Esta va a ser nuestra unica instancia
    private static  Singleton instance = null;

    /**
     * Constructor bloqueado con private
     */
    private Singleton(){

    }
    public static Singleton getInstance(){
        //Compruebo si ya está creada
        if (instance==null) {
            /*Como no está creada, la creo
            Desde aqui si que puedo acceder al constructor
            por que estoy en la misma clase
             */
            instance = new Singleton();
        }
        //Devuelvo la instancia
        return instance;
    }

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
