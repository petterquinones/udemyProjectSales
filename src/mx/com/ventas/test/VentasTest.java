package mx.com.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalon", 100);

        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.mostrarOrden();

    }
}
