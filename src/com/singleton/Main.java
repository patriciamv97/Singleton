package com.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");
        //Intento instanciar un objeto con el constructor privado
        /*esto es un error
        Singleton miUnicaInstancia= new Singleton();
        */

        //Creamos un objeto
        Singleton miUnicaInstancia= Singleton.getInstance();
        //rellenamos los atributos
        miUnicaInstancia.setEdad(20);
        miUnicaInstancia.setNombre("Pepe");
        /*
        Creamos otro objeto Singleton , como la única manera es con getInstance(), este
        método se encargará de devolvernos el objeto creado anteriormente
         */
        Singleton otraInstanciaSeraLaMisma=Singleton.getInstance();
        /*
        Podemos cambiar la edad , comprobar con el debug que los dos objetos
        miUnicaInstancia y otraInstanciaSeraLaMisma son el mismo
         */
        otraInstanciaSeraLaMisma.setEdad(34);
    }

}
