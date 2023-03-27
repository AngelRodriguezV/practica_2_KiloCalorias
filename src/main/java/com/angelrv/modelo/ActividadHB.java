/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.modelo;

import java.io.Serializable;

/**
 *
 * @author veneg
 */
public class ActividadHB implements Actividad, Serializable {
    private static final String factorActividad[] = {"SEDENTARIO","ACTIVIDAD LIGERA","ACTIVIDAD MODERADA","ACTIVIDAD ALTA"};
    private static final String factorDescripcion[] = {
        "Eres una persona sedentaria",
        "Haces deporte de 1 a 3 veces por cemana",
        "Haces deporte de 3 a 5 veces por semana",
        "Haces deporte de 6 a 7 veces por semana"
    };
    private static final double factorValor[] = {1.2, 1.375, 1.55, 1.725};
    
    private int factor;

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
