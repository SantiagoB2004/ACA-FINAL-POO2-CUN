package modelo;

import java.io.FileWriter;
import java.io.IOException;

/*
 Clase ArchivoTexto

 Esta clase implementa la interface Guardable.

 Su función es guardar información en un archivo de texto.
 Se usa FileWriter para escribir en el archivo.

 Aquí se aplica el uso de interfaces, manejo de archivos
 y control de errores con try-catch.
 */
public class ArchivoTexto implements Guardable {


    /*
     Método guardar

     Este método sobrescribe el método definido en la interface Guardable.

     Recibe un texto y lo guarda en un archivo llamado datos.txt.
     */
    @Override
    public void guardar(String texto) {

        try {

            // Se crea el FileWriter para escribir en el archivo
            // true significa que agrega texto sin borrar lo anterior
            FileWriter writer = new FileWriter("datos.txt", true);

            // Se escribe el texto en el archivo
            writer.write(texto + "\n");

            // Se cierra el archivo
            writer.close();

        } catch (IOException e) {

            // Si ocurre un error se muestra un mensaje
            System.out.println("Error al guardar en el archivo");

        }

    }

}
