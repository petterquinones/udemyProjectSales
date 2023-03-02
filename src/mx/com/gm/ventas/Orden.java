package mx.com.gm.ventas;

public class Orden {
    private int irOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.irOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else {
            System.out.println("Ya supero el máximo de elementos que se puede agregar" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //explicacion de la lina no comentada
//            Producto producto = this.productos[i];
//            total += producto.getPrice();
            total += this.productos[i].getPrice();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("ID de la orden: "+ this.irOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
            
        }

    }
}
