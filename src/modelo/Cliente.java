package modelo;

/*
 Clase Cliente

 Esta clase representa a un cliente del gimnasio.

 Cliente hereda de Persona, por lo tanto
 tiene nombre e id, pero además tiene
 un atributo extra llamado membresia.

 Aquí se aplica herencia.
 */
public class Cliente extends Persona {

    // Tipo de membresía del cliente
    private String membresia;


    /*
     Constructor de Cliente.

     Recibe nombre, id y membresia.

     Se usa super() para llamar al constructor
     de la clase Persona.
     */
    public Cliente(String nombre, int id, String membresia) {

        super(nombre, id);

        this.membresia = membresia;

    }


    /*
     Getter de la membresía.

     Este método se usa en la interfaz gráfica
     para mostrar el tipo de membresía.
     */
    public String getMembresia() {

        return membresia;

    }


    /*
     Método obligatorio porque Persona es abstracta.

     Aquí se define cómo se muestran los datos
     de un cliente.
     */
    @Override
    public void mostrarDatos() {

        System.out.println(
                "Cliente: " + nombre
                + " ID: " + id
                + " Membresia: " + membresia
        );

    }

}
