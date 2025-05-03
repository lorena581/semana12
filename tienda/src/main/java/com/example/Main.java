package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            TiendaVirtual tienda = new TiendaVirtual();

            Producto laptop = new ProductoElectronico("Laptop Gaming", 1200.0, 5, 24);
            Producto camiseta = new ProductoRopa("Camiseta Algodón", 25.0, 10, "M");
            tienda.agregarProducto(laptop);
            tienda.agregarProducto(camiseta);

            Usuario cliente = new Usuario("Juan Pérez", "juan@email.com");
            tienda.registrarUsuario(cliente);

            tienda.mostrarInventario();

            cliente.getCarrito().agregarProducto(laptop);
            cliente.getCarrito().agregarProducto(camiseta);

            MetodoPago tarjeta = new PagoTarjeta("1234567890123456");
            tienda.realizarCompra(cliente, tarjeta);

            tienda.mostrarInventario();

        } catch (TiendaException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
