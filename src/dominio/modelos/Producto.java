package dominio.modelos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Producto {
    UUID id;
    String codigo;
    String nombre;
    double precio;
    double costo;
    Categoria categoria;
    LocalDateTime fechaDeCreacion;
    Estado estado;

    public Producto(UUID id) {
        this.id = id;
    }

    public Producto(UUID id, String codigo, String nombre, double precio, double costo, Categoria categoria, LocalDateTime fechaDeCreacion, Estado estado) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.fechaDeCreacion = fechaDeCreacion;
        this.estado = estado;
    }

    public Producto(String codigo, String nombre, double precio, double costo, Categoria categoria, LocalDateTime fechaDeCreacion, Estado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.fechaDeCreacion = fechaDeCreacion;
        this.estado = estado;
    }

    public UUID getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCosto() {
        return costo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public Estado getEstado() {
        return estado;
    }
}
