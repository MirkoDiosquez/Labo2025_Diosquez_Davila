package ComputadorasPersonalizadas;

import java.time.LocalDateTime;

public class Venta {
    private Persona cliente;
    private Computadora computadora;
    private MetodoPago pago;

    public Venta(Persona cliente, Computadora computadora, MetodoPago pago) {
        this.cliente = cliente;
        this.computadora = computadora;
        this.pago = pago;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public MetodoPago getPago() {
        return pago;
    }

    public void setPago(MetodoPago pago) {
        this.pago = pago;
    }

    public double calcularTotalConMedioDePago() {
        double base = computadora.calcularPrecioNeto();
        return pago.precioFinal(base);
    }

    public void actualizarStock(){
        computadora.actualizarStock();
    }

    public void confirmarCompra() throws sinStockException, ComponentePrincipalFaltanteException {
        boolean tieneEntrada = false;
        boolean tieneSalida = false;
        if (computadora.getCpu() == null) {
            throw new ComponentePrincipalFaltanteException("falta la cpu");
        }
        if (computadora.getCpu().getStock() <= 0) {
            throw new sinStockException("no queda mas stock de cpu");
        }
        for (Periferico p : computadora.getPerifericos()) {
            if (p instanceof Entrada) {
                tieneEntrada = true;
                if (p.getStock() <= 0) {
                    throw new sinStockException("no hay stock del Entrada modelo " + p.getModelo());
                }
            }
            if (p instanceof Salida) {
                tieneSalida = true;
                if (p.getStock() <= 0) {
                    throw new sinStockException("no hay stock del Salida modelo " + p.getModelo());
                }
            }
        }
        if (!tieneEntrada) {
            throw new ComponentePrincipalFaltanteException("no hay stock del dispositivo de entrada");
        }
        if (!tieneSalida) {
            throw new ComponentePrincipalFaltanteException("no hay stock del salida de entrada");
        }
    }
}
