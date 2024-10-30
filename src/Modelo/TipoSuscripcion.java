/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author leo_8
 */
public class TipoSuscripcion {
    private String idTipoSuscripcion;
    private String descripcion;
    private int montoMensual;

    public TipoSuscripcion(String idTipoSuscripcion, String descripcion, int montoMensual) {
        this.idTipoSuscripcion = idTipoSuscripcion;
        this.descripcion = descripcion;
        this.montoMensual = montoMensual;
    }

    public String getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    public void setIdTipoSuscripcion(String idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(int montoMensual) {
        this.montoMensual = montoMensual;
    }
    
}
