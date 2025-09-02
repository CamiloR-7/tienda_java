package dominio.modelos;

import java.util.UUID;

public class Categoria {
    UUID id;
    String nombre;

    public Categoria(UUID id) {
        this.id = id;
    }

    public Categoria(String nombre)

    public Categoria(UUID id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
