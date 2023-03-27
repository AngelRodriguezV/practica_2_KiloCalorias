/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author veneg
 */
public class Usuario implements Serializable{
    private String nombre;
    private char sexo;
    private LocalDate fechaRegistro;
    private String usuario;
    private String contraseña;
    private LocalDate fechaNacimiento;
    private int idUsuario;
    
    public Usuario() {}

    public Usuario(String nombre, char sexo, LocalDate fechaRegistro, String usuario, String contraseña, LocalDate fechaNacimiento, int idUsuario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaRegistro = fechaRegistro;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.idUsuario = idUsuario;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }
    
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public int getAnios() {
        return (int)ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }
}
