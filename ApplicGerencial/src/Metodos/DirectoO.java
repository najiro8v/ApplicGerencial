 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import javax.swing.JOptionPane;

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
        if(INVfinalCANT+INVenta==INVinicialCANT+INVproducidasCANT
                
                )
        {
            this.INVfinalCANT=INVfinalCANT;
            this.INVinicialCANT=INVinicialCANT;
            this.INVproducidasCANT=INVproducidasCANT;
        }else if(0!=(INVinicialCANT+INVproducidasCANT)-INVenta&&INVfinalCANT==0){
                 
                    this.INVfinalCANT=(INVinicialCANT+INVproducidasCANT)-INVenta;
                    this.INVinicialCANT=INVinicialCANT;
                    this.INVproducidasCANT=INVproducidasCANT;
                 }else if((INVfinalCANT+INVenta)-INVinicialCANT!=0&&INVproducidasCANT==0){
                 
                              this.INVfinalCANT=INVfinalCANT;
                              this.INVinicialCANT=INVinicialCANT;
                              this.INVproducidasCANT=(INVfinalCANT+INVenta)-INVinicialCANT;
                         }else if((INVfinalCANT+INVenta)-INVproducidasCANT!=0&&INVinicialCANT==0){
                 
                                      this.INVfinalCANT=INVfinalCANT;
                                     this.INVinicialCANT=(INVfinalCANT+INVenta)-INVproducidasCANT;
                                     this.INVproducidasCANT=INVproducidasCANT;
                                }else{
                                            JOptionPane.showMessageDialog(null,"las cuentas de inventario no coinciden segun la Ecuacion","Error En Inventarios", JOptionPane.ERROR_MESSAGE);}
        
        
    }
    public void setCostoV()
    {
        
    }
    
}

