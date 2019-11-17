/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templ88ates
 * and open the template in the editor.
 */
package Modelo.Entidad;

/**
 *
 * @author Usuario
 */
public class Carro {
    private int idCarro;
    private String placa;

    private String fecha;
    private String kilometraje;
    private String cilindraje;
    private String precio;
    private String tipocaja;
    private String descripcion;
    private String disponible;
    private TipoVehiculo unTipo;
    private Marca unaMarca;
    private Ciudad unaCiudad;
    private Linea unaLinea;

    public Carro(String placa, Linea unaLinea, String fecha, String kilometraje, String cilindraje, String precio, String tipocaja, String descripcion, String disponible, TipoVehiculo unTipo, Marca unaMarca, Ciudad unaCiudad) {
        this.placa = placa;
        this.unaLinea = unaLinea;
        this.fecha = fecha;
        this.kilometraje = kilometraje;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.tipocaja = tipocaja;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.unTipo = unTipo;
        this.unaMarca = unaMarca;
        this.unaCiudad = unaCiudad;
        
    }
    public Carro(Linea unaLinea,TipoVehiculo unTipo, Marca unaMarca, Ciudad unaCiudad) {
        unaLinea = new Linea();
        unTipo = new TipoVehiculo();
        unaMarca = new Marca();
        unaCiudad = new Ciudad();
       
    }

    public Carro() {
       unaLinea = new Linea();
        unTipo = new TipoVehiculo();
        unaMarca = new Marca();
        unaCiudad = new Ciudad();
    }

    
        public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Linea getUnaLinea() {
        return unaLinea;
    }

    public void setUnaLinea(Linea unaLinea) {
        this.unaLinea = unaLinea;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipocaja() {
        return tipocaja;
    }

    public void setTipocaja(String tipocaja) {
        this.tipocaja = tipocaja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public TipoVehiculo getUnTipo() {
        return unTipo;
    }

    public void setUnTipo(TipoVehiculo unTipo) {
        this.unTipo = unTipo;
    }

    public Marca getUnaMarca() {
        return unaMarca;
    }

    public void setUnaMarca(Marca unaMarca) {
        this.unaMarca = unaMarca;
    }

    public Ciudad getUnaCiudad() {
        return unaCiudad;
    }

    public void setUnaCiudad(Ciudad unaCiudad) {
        this.unaCiudad = unaCiudad;
    }

    
    
    
}
