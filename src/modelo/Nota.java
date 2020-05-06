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
public class Nota implements Serializable{

    private Integer id;
    private String fecha;
    private String hora;
    private String calle;
    private int numero;
    private String nombre;
    private String concepto;
    private int monto;
    private int semanas;

    public Nota() {
    }

    public Nota(Integer id, String fecha, String hora, String calle, int numero, String nombre, String concepto, int monto, int semanas) {
        this.id = id;
        this.fecha = fecha;
        this.hora=hora;
        this.calle = calle;
        this.numero = numero;
        this.nombre = nombre;
        this.concepto = concepto;
        this.monto = monto;
        this.semanas = semanas;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }
}
