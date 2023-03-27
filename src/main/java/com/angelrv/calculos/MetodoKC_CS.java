/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.angelrv.calculos;

/**
 *
 * @author veneg
 */
public class MetodoKC_CS implements CaloriasRequeridas {

    @Override
    public double calculo_kc(IndicadorSalud IS) {
        double r = IS.getPeso() * 35;
        return r + (r * .20);
    }
}
