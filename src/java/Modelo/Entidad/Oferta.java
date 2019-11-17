/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Entidad;

/**
 *
 * @author Usuario
 */
public class Oferta {
    private int idOferta;
    private Carro unCarro;
    private String preciooferta;
    private String fecha;
    private String estado;

    public Oferta(Carro unCarro, String preciooferta, String fecha, String estado) {
        this.unCarro = unCarro;
        this.preciooferta = preciooferta;
        this.fecha = fecha;
        this.estado = estado;
    }
        public Oferta(Carro unCarro) {
        unCarro = new Carro();
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public Carro getUnCarro() {
        return unCarro;
    }

    public void setUnCarro(Carro unCarro) {
        this.unCarro = unCarro;
    }

    public String getPreciooferta() {
        return preciooferta;
    }

    public void setPreciooferta(String preciooferta) {
        this.preciooferta = preciooferta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
