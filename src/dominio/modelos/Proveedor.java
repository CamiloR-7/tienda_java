package dominio.modelos;

import java.util.UUID;

public record Proveedor(
        UUID id,
        String nombre,
        String nit,
        String telefono,
        String email
) {
}