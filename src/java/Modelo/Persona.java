package Modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private int dni;
    private int cantidad_sugerencia;
    private String direccion;
    private String estado;

    public Persona() {
    }

    public Persona(int idpersona, String nombre, int dni, int cantidad_sugerencia, String direccion, String estado) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.dni = dni;
        this.cantidad_sugerencia = cantidad_sugerencia;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidad_sugerencia() {
        return cantidad_sugerencia;
    }

    public void setCantidad_sugerencia(int cantidad_sugerencia) {
        this.cantidad_sugerencia = cantidad_sugerencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
