/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author pablo.alejos
 */
public class Domicilio implements Serializable{

    private String calle;
    private int numero;
    private int semana;

    public Domicilio() {

    }

    public Domicilio(String c, int num, int sem) {
        this.calle = c;
        this.numero = num;
        this.semana = sem;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSemana() {
        return semana;
    }

    public void setSemana(int semana) {
        this.semana = semana;
    }
}
