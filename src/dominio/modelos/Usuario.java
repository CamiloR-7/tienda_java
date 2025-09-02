package dominio.modelos;

import java.util.UUID;

public class Usuario {
    private UUID id;
    private int documento;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private Rol rol;
    private Sucursal sucursal;

    public Usuario(UUID id) {
        this.id = id;
    }

    public Usuario(int documento) {
        this.documento = documento;
    }

    public Usuario(UUID id, int documento, String nombre, String apellido, String email, String contrasena, Rol rol, Sucursal sucursal) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
        this.sucursal = sucursal;
    }

    public UUID getId() {
        return id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}