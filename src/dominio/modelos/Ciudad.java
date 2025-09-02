package dominio.modelos;

import java.util.UUID;

public class Ciudad {
    private UUID id;
    private String nombre;

    public Ciudad(UUID id) {
        this.id = id;
    }

    public Ciudad(UUID id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}