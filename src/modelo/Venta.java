package modelo;

/*
 Clase Venta

 Representa la compra de un suplemento
 por parte de un cliente.

 Se usa composición porque Venta tiene
 un Cliente y un Suplemento.
 */
public class Venta {

    private Cliente cliente;
    private Suplemento suplemento;
    private double total;


    /*
     Constructor
     */
    public Venta(Cliente cliente, Suplemento suplemento) {

        this.cliente = cliente;
        this.suplemento = suplemento;

        total = suplemento.getPrecio();

    }


    /*
     Mostrar venta
     */
    public void mostrarVenta() {

        System.out.println(
                cliente.getNombre()
                + " compra "
                + suplemento.getNombre()
                + " Total: "
                + total
        );

    }

}
