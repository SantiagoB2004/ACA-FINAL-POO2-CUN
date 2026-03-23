package modelo;

/*
 Clase Suplemento

 Esta clase representa un suplemento que se vende en el gimnasio.
 Por ejemplo proteína, creatina, pre-entreno, etc.

 Cada suplemento tiene un nombre y un precio.

 Esta clase no hereda de Persona porque no es una persona,
 sino un producto, por eso se crea como una clase independiente.
 */
public class Suplemento {

    // Nombre del suplemento
    private String nombre;

    // Precio del suplemento
    private double precio;


    /*
     Constructor de la clase Suplemento.

     Se usa para crear un suplemento con su nombre y precio.
     */
    public Suplemento(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;

    }


    /*
     Método para mostrar la información del suplemento.

     Se usa para imprimir los datos en consola.
     */
    public void mostrarSuplemento() {

        System.out.println(
                "Suplemento: " + nombre
                + " Precio: " + precio
        );

    }


    /*
     Método getter para obtener el precio.

     Se usa cuando otra clase necesita saber el precio,
     por ejemplo la clase Venta.
     */
    public double getPrecio() {

        return precio;

    }


    /*
     Método getter para obtener el nombre.
     */
    public String getNombre() {

        return nombre;

    }

}
