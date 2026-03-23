package modelo;

/*
 Interface Guardable

 Esta interfaz se usa para definir un método
 que permite guardar datos en archivo.

 Las clases que implementen esta interfaz
 estarán obligadas a tener el método guardar().
*/

public interface Guardable {

    /*
     Método guardar.

     Recibe una ruta donde se guardará el archivo.
    */
    public void guardar(String ruta);

}