package mx.com.gm.ventas;

public class Producto {
    private final int idProduct;
    private String name;
    private double price;
    private static int countProducts;

    private Producto(){
        this.idProduct = ++Producto.countProducts;
    }

    public Producto(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producto{" +
               "idProduct=" + idProduct +
               ", name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
