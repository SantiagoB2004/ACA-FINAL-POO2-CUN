package modelo;

import java.util.ArrayList;

/*
 * Clase Repositorio
 *
 * Esta clase se encarga de almacenar los datos del sistema:
 * clientes, suplementos y ventas.
 * Funciona como una base de datos en memoria.
 */
public class Repositorio {

    // Lista donde se guardan los clientes
    private ArrayList<Cliente> clientes;

    // Lista donde se guardan los suplementos
    private ArrayList<Suplemento> suplementos;

    // Lista donde se guardan las ventas
    private ArrayList<Venta> ventas;

    /*
     * Constructor de la clase Repositorio
     *
     * Inicializa todas las listas vacías para poder agregar datos
     * desde la interfaz gráfica.
     */
    public Repositorio() {
        clientes = new ArrayList<>();
        suplementos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    // ===== MÉTODOS PARA AGREGAR ELEMENTOS =====

    /*
     * Agrega un cliente a la lista de clientes
     */
    public void agregarCliente(Cliente c) {
        if (c != null) {
            clientes.add(c);
        }
    }

    /*
     * Agrega un suplemento a la lista de suplementos
     */
    public void agregarSuplemento(Suplemento s) {
        if (s != null) {
            suplementos.add(s);
        }
    }

    /*
     * Agrega una venta a la lista de ventas
     */
    public void agregarVenta(Venta v) {
        if (v != null) {
            ventas.add(v);
        }
    }

    // ===== GETTERS =====

    /*
     * Devuelve la lista de clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /*
     * Devuelve la lista de suplementos
     */
    public ArrayList<Suplemento> getSuplementos() {
        return suplementos;
    }

    /*
     * Devuelve la lista de ventas
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    // ===== MÉTODOS DE PRUEBA EN CONSOLA =====

    /*
     * Muestra todos los clientes en consola
     */
    public void mostrarClientes() {
        for (Cliente c : clientes) {
            c.mostrarDatos();
        }
    }

    /*
     * Muestra todos los suplementos en consola
     */
    public void mostrarSuplementos() {
        for (Suplemento s : suplementos) {
            s.mostrarSuplemento();
        }
    }
}
