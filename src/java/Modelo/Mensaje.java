package Modelo;

public class Mensaje {
    private int idmensaje;
    private String remitente;
    private String destinatario;
    private String fecha;
    private String mensaje;
    private String estado;

    public Mensaje() {
    }

    public Mensaje(int idmensaje, String remitente, String destinatario, String fecha, String mensaje, String estado) {
        this.idmensaje = idmensaje;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(int idmensaje) {
        this.idmensaje = idmensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
      
}
