/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author casa
 */
public class AbsorbenteO {
    private double Venta=0/*Continene la Venta pero en precio montario*/,
                    CostoDeVenta=0/*Continene el Costo de Venta pero en precio montario*/,
                    InvInicial=0/*Continene el inventario pero en precio montario*/,
                    InvFinal=0/*Continene el inventario pero en precio montario*/,
                    CostoDeArticuloManofacturado=0,
                    UtilidadBruta=0,
                    GastoVariableDeVenta=0,
                    GastoDeVenta_Y_Administracion=0,
                    UtilidadDeOperacion=0,
                    PrecioDeVenta=0,
                    CostoFijoDeProduccion=0,
                    CostoVariableDeProduccion=0,
                    CostoFijoDeProduccionUNITARIO=0,
                    CostoVariableDeProduccionUNITARIO=0;
    
    private int INVinicialCANT=0,
                INVfinalCANT=0,
                INVproducidasCANT=0;
    public int get()
    {
        return INVfinalCANT;
    }
    
}
