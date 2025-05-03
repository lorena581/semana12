package com.example;

public class PagoTarjeta implements MetodoPago {
    private String numeroTarjeta;

    public PagoTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta " + numeroTarjeta);
        return true;
    }

    @Override
    public String obtenerDetalles() {
        return "Tarjeta: ****" + numeroTarjeta.substring(numeroTarjeta.length() - 4);
    }
}

