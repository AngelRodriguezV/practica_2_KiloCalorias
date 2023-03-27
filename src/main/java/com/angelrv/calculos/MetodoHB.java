/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.calculos;

/**
 * Formula de Harris Benedict
 * @author veneg
 */
public class MetodoHB implements CaloriasRequeridas {
    
    public MetodoHB() {}
    
    @Override
    public double calculo_kc(IndicadorSalud IS) {
        double HB = 0;
        if (IS.usuario.getSexo() == 'M') {
            HB = 655 + (9.6 * IS.getPeso()) + (1.8 * IS.getEstatura()) - (6.8 * IS.getUsuario().getAnios());
        }
        else {
            HB = 66 + (13.7 * IS.getPeso()) + (5 * IS.getEstatura()) - (6.8 * IS.getUsuario().getAnios());
        }
        return HB * IS.getTipoActividad().getFactor();
    }
}
