package modelo;

/*
 Clase Entrenador

 Esta clase representa a un entrenador del gimnasio.

 Hereda de Persona porque también tiene
 nombre e id.

 Tiene un atributo extra llamado especialidad.
 */
public class Entrenador extends Persona {

    private String especialidad;


    /*
     Constructor
     */
    public Entrenador(String nombre, int id, String especialidad) {

        super(nombre, id);

        this.especialidad = especialidad;

    }


    /*
     Getter de especialidad
     */
    public String getEspecialidad() {

        return especialidad;

    }


    /*
     Implementación obligatoria
     */
    @Override
    public void mostrarDatos() {

        System.out.println(
                "Entrenador: " + nombre
                + " ID: " + id
                + " Especialidad: " + especialidad
        );

    }

}
