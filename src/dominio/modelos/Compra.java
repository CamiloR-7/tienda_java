package dominio.modelos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Compra {
    private UUID id;
    private LocalDateTime fecha;
    private Proveedor proveedor;
    private Usuario usuario;
    private Sucursal sucursal;
    private double total;
    private Estado estado;

    public Compra(UUID id) {
        this.id = id;
    }

    public Compra(UUID id, LocalDateTime fecha, Proveedor proveedor, Usuario usuario, Sucursal sucursal, double total, Estado estado) {
        this.id = id;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.usuario = usuario;
        this.sucursal = sucursal;
        this.total = total;
        this.estado = estado;
    }

    public Compra(LocalDateTime fecha, Proveedor proveedor, Usuario usuario, Sucursal sucursal, double total, Estado estado) {
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.usuario = usuario;
        this.sucursal = sucursal;
        this.total = total;
        this.estado = estado;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public double getTotal() {
        return total;
    }

    public Estado getEstado() {
        return estado;
    }
}
