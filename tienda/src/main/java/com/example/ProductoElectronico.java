package com.example;

public class ProductoElectronico extends Producto {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int stock, int garantiaMeses) {
        super(nombre, precio, stock);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getDetalles() {
        return String.format("Producto: %s, Precio: %.2f, Stock: %d, Garantía: %d meses",
                getNombre(),
                getPrecio(),
                getStock(),
                garantiaMeses);
    }
}
