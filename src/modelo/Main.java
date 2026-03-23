package modelo;

/*
 Clase Main

 Esta clase contiene el método principal del programa.

 Aquí se crean objetos de las diferentes clases
 para probar que el sistema funciona correctamente.

 Se crean clientes, suplementos, ventas y se usa
 el repositorio para almacenar los datos.

 También se prueba la clase ArchivoTexto para
 guardar información en un archivo.
 */
public class Main {

    public static void main(String[] args) {

        // Se crea un cliente
        Cliente c1 = new Cliente("Juan", 1, "Premium");

        // Se crea un suplemento
        Suplemento s1 = new Suplemento("Proteina", 120000);

        // Se crea una venta usando el cliente y el suplemento
        Venta v1 = new Venta(c1, s1);

        // Se crea el repositorio para guardar datos
        Repositorio repo = new Repositorio();

        // Se agregan datos al repositorio
        repo.agregarCliente(c1);
        repo.agregarSuplemento(s1);

        // Se muestran los datos guardados
        repo.mostrarClientes();
        repo.mostrarSuplementos();

        // Se muestra la venta realizada
        v1.mostrarVenta();

        // Se crea el objeto para guardar en archivo
        ArchivoTexto archivo = new ArchivoTexto();

        // Se guarda información en el archivo txt
        archivo.guardar("Venta realizada correctamente");

    }

}
