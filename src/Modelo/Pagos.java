/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author leo_8
 */
public class Pagos {
    private String codPagos;
    private int monto;
    private String mes;
    private String fechaPago;
    private String dniSocio;
    private String idUsuario;

    public Pagos(String codPagos, int monto, String mes, String fechaPago, String dniSocio, String idUsuario) {
        this.codPagos = codPagos;
        this.monto = monto;
        this.mes = mes;
        this.fechaPago = fechaPago;
        this.dniSocio = dniSocio;
        this.idUsuario = idUsuario;
    }

    public String getCodPagos() {
        return codPagos;
    }

    public void setCodPagos(String codPagos) {
        this.codPagos = codPagos;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
