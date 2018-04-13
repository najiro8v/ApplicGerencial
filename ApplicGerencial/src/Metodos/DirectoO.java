 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import GerencialPrin.Base1;
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
    
    public DirectoO(){
    Venta/*Continene la Venta pero en precio montario*/=0;
                    CostoDeVenta/*Continene el Costo de Venta pero en precio montario*/=0;
                    InvInicial/*Continene el inventario pero en precio montario*/=0;
                    InvFinal/*Continene el inventario pero en precio montario*/=0;
                    INVproducidas=0;
                    CostoDeArticuloManofacturado=0;
                    UtilidadBruta=0;
                    GastoVariableDeVenta=0;
                    GastoDeVenta_Y_Administracion=0;
                    UtilidadDeOperacion=0;
                    PrecioDeVenta=0;
                    CostoFijoDeProduccion=0;
                    CostoVariableDeProduccion=0;
                    CostoFijoDeProduccionUNITARIO=0;
                    CostoVariableDeProduccionUNITARIO=0;
                    INVinicialCANT=0;
                INVfinalCANT=0;
                INVproducidasCANT=0;
                INVenta=0;
    }
    public void setVentas(int INVenta,double PrecioDeventa)
    {   
        this.INVenta=INVenta;
        this.PrecioDeVenta=PrecioDeventa;
        Venta=INVenta*PrecioDeventa; 
        System.out.println(Venta);
    }
    public void setINV(int INVinicialCANT1,int INVfinalCANT1,int  INVproducidasCANT1){
        System.out.println("Inventario incial"+INVinicialCANT1+"\ninventario final :"+INVfinalCANT1+"\n inventario producido en el "+INVproducidasCANT1);
        System.out.println("inventario de ventas"+INVenta);
        if(INVfinalCANT1+this.INVenta==INVinicialCANT1+INVproducidasCANT1)
        {   System.out.println("INVfinalCANT+this.INVenta==INVinicialCANT+INVproducidasCANT este if se ejecutop");
            this.INVfinalCANT=INVfinalCANT1;
            this.INVinicialCANT=INVinicialCANT1;
            this.INVproducidasCANT=INVproducidasCANT1;
        }else if(((INVinicialCANT1+INVproducidasCANT1)-this.INVenta)!=0&&INVfinalCANT1==0){
                 System.out.println("((INVinicialCANT+INVproducidasCANT)-this.INVenta)!=0 este if se ejecuto");
                if((INVinicialCANT1+INVproducidasCANT1)-this.INVenta<0)
                     
                    {       this.INVfinalCANT=-1*((INVinicialCANT1+INVproducidasCANT1)-this.INVenta);  }
                 else{ INVfinalCANT=(INVinicialCANT1+INVproducidasCANT1)-INVenta;} Base1.Inv_F.setText(String.valueOf(this.INVfinalCANT));
                    this.INVinicialCANT=INVinicialCANT1;
                    this.INVproducidasCANT=INVproducidasCANT1;
                 }else if((INVfinalCANT1+this.INVenta)-INVinicialCANT1!=0&&INVproducidasCANT1==0){
                            System.out.println("(INVfinalCANT+this.INVenta)-INVinicialCANT este if se ejecuto");
                              this.INVfinalCANT=INVfinalCANT1;
                              this.INVinicialCANT=INVinicialCANT1;
                              this.INVproducidasCANT=(INVfinalCANT1+this.INVenta)-INVinicialCANT1;Base1.Inv_P.setText(String.valueOf(this.INVproducidasCANT));
                         }else if((INVfinalCANT1+INVenta)-INVproducidasCANT1!=0&&INVinicialCANT1==0){
                                    System.out.println("(INVfinalCANT+INVenta)-INVproducidasCANT!=0 este if se ejecuto");
                                      this.INVfinalCANT=INVfinalCANT1;
                                     this.INVinicialCANT=(INVfinalCANT1+INVenta)-INVproducidasCANT1;Base1.Inv_I.setText(String.valueOf(this.INVinicialCANT));
                                     this.INVproducidasCANT=INVproducidasCANT1;
                                }else{
                                            JOptionPane.showMessageDialog(null,"las cuentas de inventario no coinciden segun la Ecuacion","Error En Inventarios", JOptionPane.ERROR_MESSAGE);}
        System.out.println("--------------------------------------------------------------------");
        System.out.println((INVinicialCANT+INVproducidasCANT)-INVenta);
        System.out.println("Inventario incial: "+INVinicialCANT+"\ninventario final :"+INVfinalCANT+"\n inventario producido en el "+INVproducidasCANT);
        System.out.println("inventario de ventas"+INVenta);
    }
    public void setCOSTOS(double CostoFijoDeProduccion1,double CostoVariableDeProduccion1,double CostoFijoDeProduccionUNITARIO1,double CostoVariableDeProduccionUNITARIO1)
    {
        CostoFijoDeProduccion=CostoFijoDeProduccion1;
        CostoVariableDeProduccion=CostoVariableDeProduccion1;
        CostoFijoDeProduccionUNITARIO=CostoFijoDeProduccionUNITARIO1;
        CostoVariableDeProduccionUNITARIO=CostoVariableDeProduccionUNITARIO1;
        System.out.println("CostoFijoDeProduccion= "+CostoFijoDeProduccion);
         System.out.println("CostoVariableDeProduccion= "+CostoVariableDeProduccion);
          System.out.println("CostoFijoDeProduccionUNITARIO= "+CostoFijoDeProduccionUNITARIO);
           System.out.println("CostoVariableDeProduccionUNITARIO= "+CostoVariableDeProduccionUNITARIO);
    }
    public void setCostoVVariable()
    {
        InvInicial=(INVinicialCANT*CostoVariableDeProduccionUNITARIO)+(CostoVariableDeProduccion);
        InvFinal=(INVfinalCANT*CostoVariableDeProduccion)+(CostoVariableDeProduccionUNITARIO)/*Continene el inventario pero en precio montario*/;
        INVproducidas=(INVproducidasCANT*CostoVariableDeProduccion)+(CostoVariableDeProduccionUNITARIO);
        System.out.println("InvInicial= "+InvInicial);
        System.out.println("InvFinal= "+InvFinal);
        System.out.println("INVproducidas= "+INVproducidas);
    }
    
}

