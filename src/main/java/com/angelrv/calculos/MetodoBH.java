/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.calculos;

import java.util.HashMap;

/**
 * Fórmula de Brian Haycock
 * @author veneg
 */
public class MetodoBH implements CaloriasRequeridas {
    
    public MetodoBH() {}
    
    @Override
    public double calculo_kc(IndicadorSalud IS) {
        double BMR = IS.getIMC() * 24;
        if (IS.getUsuario().getSexo() == 'M') {
            BMR = BMR * 0.9;
        }
        return BMR * IS.getTipoActividad().getFactor();
    }
}
