package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            TiendaVirtual tienda = new TiendaVirtual();

            Producto laptop = new ProductoElectronico("Laptop ", 1200.0, 5, 24);
            Producto camiseta = new ProductoRopa("Camiseta Algodón", 25.0, 10, "M");
            tienda.agregarProducto(laptop);
            tienda.agregarProducto(camiseta);

            Usuario cliente = new Usuario("lorena", "lorena@email.com");
            tienda.registrarUsuario(cliente);

            tienda.mostrarInventario();

            cliente.getCarrito().agregarProducto(laptop);
            cliente.getCarrito().agregarProducto(camiseta);

            MetodoPago tarjeta = new PagoTarjeta("123456789012344");
            tienda.realizarCompra(cliente, tarjeta);

            tienda.mostrarInventario();

        } catch (TiendaException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
