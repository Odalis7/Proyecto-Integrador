/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author leo_8
 */
public class Socios {
    private String dniSocio;
    private String nombreSocio;
    private String apellidoSocio;
    private String fechaNacimiento;
    private int edad;
    private String emailSocio;
    private String telefonoSocio;
    private String direccionSocio;
    private String fechaInscripcion;
    private String idTipoSuscripcion;

    public Socios(String dniSocio, String nombreSocio, String apellidoSocio, String fechaNacimiento, int edad, String emailSocio, String telefonoSocio, String direccionSocio, String fechaInscripcion, String idTipoSuscripcion) {
        this.dniSocio = dniSocio;
        this.nombreSocio = nombreSocio;
        this.apellidoSocio = apellidoSocio;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.emailSocio = emailSocio;
        this.telefonoSocio = telefonoSocio;
        this.direccionSocio = direccionSocio;
        this.fechaInscripcion = fechaInscripcion;
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getApellidoSocio() {
        return apellidoSocio;
    }

    public void setApellidoSocio(String apellidoSocio) {
        this.apellidoSocio = apellidoSocio;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmailSocio() {
        return emailSocio;
    }

    public void setEmailSocio(String emailSocio) {
        this.emailSocio = emailSocio;
    }

    public String getTelefonoSocio() {
        return telefonoSocio;
    }

    public void setTelefonoSocio(String telefonoSocio) {
        this.telefonoSocio = telefonoSocio;
    }

    public String getDireccionSocio() {
        return direccionSocio;
    }

    public void setDireccionSocio(String direccionSocio) {
        this.direccionSocio = direccionSocio;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    public void setIdTipoSuscripcion(String idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }
    
}
