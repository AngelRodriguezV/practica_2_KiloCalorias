/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.modelo;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author veneg
 */
public class ActividadBH implements Actividad, Serializable {
    private static final String factorActividad[] = {"SEDENTARIO","LIGERAMENTE ACTIVO","ACTIVO","MUY ACTIVO"};
    private static final String factorDescripcion[] = {
        "Ningún ejercicio + Trabajo de escritorio",
        "Ejercicio Regular 3 veces por semana + Trabajo de escritorio",
        "Ejercicio Diario + Trabajo de pie en la mayor parte del día",
        "Ejercicio Diario Intenso + Trabajo en la construcción la mayor parte del día"
    };
    private static final double factorValor[] = {1.0, 1.2, 1.3, 1.4};
    
    private int factor;
    
    public ActividadBH(int factor) {
        this.factor = factor;
    }

    @Override
    public String getActividad() {
        return factorActividad[factor];
    }

    @Override
    public String getDescripcion() {
        return factorDescripcion[factor];
    }

    @Override
    public double getFactor() {
        return factorValor[factor];
    }
}
