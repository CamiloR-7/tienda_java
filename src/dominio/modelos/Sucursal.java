package dominio.modelos;

import java.util.UUID;

public class Sucursal {
    UUID id;
    String nombre;
    Ciudad ciudad;
    String direccion;
    String telefono;

    public Sucursal(UUID id, String nombre, Ciudad ciudad, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}