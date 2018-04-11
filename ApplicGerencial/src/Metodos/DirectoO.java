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
public class DirectoO {
    private double Venta/*Continene la Venta pero en precio montario*/,
                    CostoDeVenta/*Continene el Costo de Venta pero en precio montario*/,
                    InvInicial/*Continene el inventario pero en precio montario*/,
                    InvFinal/*Continene el inventario pero en precio montario*/,
                    INVproducidas,
                    CostoDeArticuloManofacturado,
                    UtilidadBruta,
                    GastoVariableDeVenta,
                    GastoDeVenta_Y_Administracion,
                    UtilidadDeOperacion,
                    PrecioDeVenta,
                    CostoFijoDeProduccion,
                    CostoVariableDeProduccion,
                    CostoFijoDeProduccionUNITARIO,
                    CostoVariableDeProduccionUNITARIO;
    
    private int INVinicialCANT,
                INVfinalCANT,
                INVproducidasCANT,
                INVenta;
    
    public void setVentas(int INVenta,double PrecioDeventa)
    {   
        this.INVenta=INVenta;
        this.PrecioDeVenta=PrecioDeventa;
        Venta=INVenta*PrecioDeventa; 
    }
    public void setINV(int INVinicialCANT,int INVfinalCANT,int  INVproducidasCANT){
        if(INVfinalCANT+INVenta==INVinicialCANT+INVproducidasCANT||
                INVfinalCANT==(INVinicialCANT+INVproducidasCANT)-INVenta
                ||(INVfinalCANT+INVenta)-INVinicialCANT==INVproducidasCANT
                ||(INVfinalCANT+INVenta)-INVproducidasCANT==INVinicialCANT)
        {
            this.INVfinalCANT=INVfinalCANT;
            this.INVinicialCANT=INVinicialCANT;
            this.INVproducidasCANT=INVproducidasCANT;
        }
        
        
    }
    public void setCostoV()
    {
        
    }
    
}

