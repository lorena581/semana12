package com.example;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Producto> productos;

    public CarritoCompra() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) throws TiendaException {
        if (producto.getStock() <= 0) {
            throw new TiendaException("No hay stock disponible para el producto: " + producto.getNombre());
        }
        productos.add(producto);
        producto.setStock(producto.getStock() - 1);
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }
}
