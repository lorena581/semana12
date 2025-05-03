package com.example;

import java.util.ArrayList;
import java.util.List;

public class TiendaVirtual {
    private List<Producto> inventario;
    private List<Usuario> usuarios;

    public TiendaVirtual() {
        this.inventario = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarCompra(Usuario usuario, MetodoPago metodoPago) throws TiendaException {
        CarritoCompra carrito = usuario.getCarrito();
        if (carrito.getProductos().isEmpty()) {
            throw new TiendaException("El carrito de compra esta vacio");
        }

        double total = carrito.calcularTotal();
        if (metodoPago.procesarPago(total)) {
            System.out.println("Compra exitosa. Total: " + total + ". Detalles de pago: " + metodoPago.obtenerDetalles());
            carrito.getProductos().clear();
        }
    }

    public void mostrarInventario() {
        System.out.println("\nInventario disponible:");
        for (Producto producto : inventario) {
            System.out.println(producto.getDetalles());
        }
    }
}

