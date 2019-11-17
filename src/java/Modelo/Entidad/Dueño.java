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
public class Dueño {
    private int idDueño;
    private Carro unCarro;
    private Persona unaPersona;

    public Dueño(Carro unCarro, Persona unaPersona) {
        this.unCarro = unCarro;
        this.unaPersona = unaPersona;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

    public Carro getUnCarro() {
        return unCarro;
    }

    public void setUnCarro(Carro unCarro) {
        this.unCarro = unCarro;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }
    
}
