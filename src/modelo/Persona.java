package modelo;

/*
 Clase abstracta Persona

 Esta clase se crea para representar una persona dentro del sistema.
 No se usa directamente, sino que sirve como clase base para otras
 clases como Cliente y Entrenador.

 Se declara como abstracta porque no tiene sentido crear una Persona
 sola, siempre será Cliente o Entrenador.

 Aquí se aplica herencia y abstracción, que son principios de la
 programación orientada a objetos.
 */
public abstract class Persona {

    // Nombre de la persona
    protected String nombre;

    // Identificación de la persona
    protected int id;


    /*
     Constructor de la clase Persona.

     Se utiliza para inicializar los datos básicos que tendrán
     todas las personas del sistema.
     */
    public Persona(String nombre, int id) {

        this.nombre = nombre;
        this.id = id;

    }


    /*
     Getter del nombre.

     Este método permite que otras clases puedan
     obtener el nombre de la persona.

     Se usa en la interfaz gráfica para mostrar datos.
     */
    public String getNombre() {

        return nombre;

    }


    /*
     Getter del id.

     Permite obtener la identificación desde
     otras clases como Cliente, Repositorio
     o la interfaz gráfica.
     */
    public int getId() {

        return id;

    }


    /*
     Método abstracto.

     Este método no se define aquí porque cada tipo de persona
     mostrará sus datos de forma diferente.

     Las clases que hereden de Persona están obligadas a
     implementar este método.
     */
    public abstract void mostrarDatos();

}
