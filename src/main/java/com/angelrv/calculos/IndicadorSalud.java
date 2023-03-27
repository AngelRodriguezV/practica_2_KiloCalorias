/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.calculos;

import com.angelrv.modelo.Actividad;
import com.angelrv.modelo.Usuario;
import java.time.LocalDate;

/**
 *
 * @author veneg
 */
public class IndicadorSalud {
    protected double peso;
    protected double estatura;
    protected int cintura;
    protected int cadera;
    protected Actividad tipoActividad;
    protected int idIndSalud;
    protected LocalDate fecha;
    protected Usuario usuario;
    protected CaloriasRequeridas kcr;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public void setTipoActividad(Actividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public void setIdIndSalud(int idIndSalud) {
        this.idIndSalud = idIndSalud;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setKcr(CaloriasRequeridas kcr) {
        this.kcr = kcr;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getCintura() {
        return cintura;
    }

    public int getCadera() {
        return cadera;
    }

    public Actividad getTipoActividad() {
        return tipoActividad;
    }

    public int getIdIndSalud() {
        return idIndSalud;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public CaloriasRequeridas getKcr() {
        return kcr;
    }
    
    /**
     * Obtenemos el Indice de Masa Corporal
     * @return 
     */
    public double getIMC() {
        return this.peso / Math.pow(this.estatura, 2);
    }
    
    /**
     * Obtenemos el Indice Cintura Cadera (ICC)
     * @return 
     */
    public double getICC() {
        return this.cintura / this.cadera;
    }
    
    /**
     * Obtenemos el Indice de 
     * @return 
     */
    public double caloriasRequeridas() {
        return this.kcr.calculo_kc(this);
    }
    
}
