 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import GerencialPrin.Base1;
import javax.swing.JOptionPane;
import GerencialPrin.CDirecto;
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
                    InvInicialF/*Continene el inventario pero en precio montario*/,
                    InvFinalF/*Continene el inventario pero en precio montario*/,
                    INVproducidasF,
                    CostoDeArticuloManofacturado,
                    UtilidadBruta,
                    GastoVariableDeVenta,
                    GastoDeVenta_Y_Administracion,
                    UtilidadDeOperacion,
                    PrecioDeVenta,
                    CostoFijoDeProduccion,
                    CostoVariableDeProduccion,
                    CostoFijoDeProduccionUNITARIO,
                    CostoVariableDeProduccionUNITARIO,
                    GastosDeFinancieros,
                     OtrosGastos,
                    OtrosProductos,CostodeContribucion;
    
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
                InvInicialF=0/*Continene el inventario pero en precio montario*/;
                InvFinalF/*Continene el inventario pero en precio montario*/=0;
                INVproducidasF=0;
                GastosDeFinancieros=0;
                OtrosGastos=0;
                OtrosProductos=0;
                CostodeContribucion=0;
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
    public void setCostodeVVariable()
    {
        InvInicial=(INVinicialCANT*CostoVariableDeProduccionUNITARIO)+(CostoVariableDeProduccion);
        InvFinal=(INVfinalCANT*CostoVariableDeProduccion)+(CostoVariableDeProduccionUNITARIO)/*Continene el inventario pero en precio montario*/;
        INVproducidas=(INVproducidasCANT*CostoVariableDeProduccion)+(CostoVariableDeProduccionUNITARIO);
        System.out.println("InvInicial= "+InvInicial);
        System.out.println("InvFinal= "+InvFinal);
        System.out.println("INVproducidas= "+INVproducidas);
        CostoDeVenta=(InvInicial+INVproducidas)-InvFinal;
        CostodeContribucion=Venta-((InvInicial+INVproducidas)-InvFinal);
        System.out.println("CostoDeVenta= "+CostoDeVenta);
    }
   
    public void setCostodeVFijo()
    {
        if(INVinicialCANT==0)
        {InvInicialF=INVinicialCANT*(CostoFijoDeProduccionUNITARIO);}
        else{InvInicialF=INVinicialCANT*(CostoFijoDeProduccionUNITARIO+(CostoFijoDeProduccion/INVinicialCANT));}
        
        if(INVfinalCANT==0)
        {InvFinalF=INVfinalCANT*(CostoFijoDeProduccionUNITARIO)/*Continene el inventario pero en precio montario*/;}
        else{InvFinalF=INVfinalCANT*(CostoFijoDeProduccionUNITARIO+(CostoFijoDeProduccion/INVfinalCANT))/*Continene el inventario pero en precio montario*/;}
        if(INVproducidasCANT==0){
        INVproducidasF=INVproducidasCANT*(CostoFijoDeProduccionUNITARIO);}
        else{INVproducidasF=INVproducidasCANT*(CostoFijoDeProduccionUNITARIO+(CostoFijoDeProduccion/INVproducidasCANT));}
     //   System.out.println("InvInicial= "+InvInicialF);
     //   System.out.println("InvFinal= "+InvFinalF);
      //  System.out.println("INVproducidas= "+INVproducidasF);
        CostoDeArticuloManofacturado=((InvInicialF+INVproducidasF)-InvFinalF);
        
    }
    public void setUtilidad()
    {   
         UtilidadBruta=CostodeContribucion-CostoDeArticuloManofacturado;
    }
    public void CDirectoO()
    {   setUtilidad();
        CDirecto nuevo=new CDirecto();
        CDirecto.Ventas.setText(String.valueOf(Venta));
        CDirecto.Costo_Varaible_de_Inv_Inicial.setText(String.valueOf(InvInicial));
        CDirecto.Costo_Varaible_de_Inv_Produccion.setText(String.valueOf(INVproducidas));
        CDirecto.Costo_Varaible_de_Inv_Final.setText(String.valueOf(InvFinal));
       
      //  System.out.println("-------------"+InvFinal+"------------------");
        CDirecto.Costo_Variable.setText(String.valueOf(CostoDeVenta));
        CDirecto.Margen_De_Contribucion.setText(String.valueOf(CostodeContribucion));
        CDirecto.Costo_Fijo_de_Inv_Inicial.setText(String.valueOf(InvInicialF));
        CDirecto.Costo_Fijo_de_Inv_Produccion.setText(String.valueOf(INVproducidasF));
        CDirecto.Costo_Fijo_de_Inv_Final.setText(String.valueOf(InvFinalF));
        CDirecto.Costo_Fijo.setText(String.valueOf(CostoDeArticuloManofacturado));
        CDirecto.Utilidad_Neta.setText(String.valueOf(UtilidadBruta));
        
        
        
    }
  /*  public void setGastos(double GastosDeFinancieros1,double GastoVariableDeVenta1,double GastoDeVenta_Y_Administracion1,double OtrosGastos1,double OtrosProductos1)
    {
                GastosDeFinancieros=GastosDeFinancieros1;
                OtrosGastos=OtrosGastos1;
                OtrosProductos=OtrosProductos1;
                GastoVariableDeVenta=GastoVariableDeVenta1;
                GastoDeVenta_Y_Administracion= GastoDeVenta_Y_Administracion1;
        
    }*/
    /*************************Metodos Ge
     * @return t***********************************************/
    public double getVenta(){return Venta;}
    
    public double getCostoDeVenta(){return CostoDeVenta;}
    
    public double getInvInicial(){return InvInicial;}
    
    public double getInvFinal(){return InvFinal;}
    
    public double getINVproducidas(){return INVproducidas;}
    
    public double getInvInicialF(){return InvInicialF;}
    
    public double getInvFinalF(){return InvFinalF;}
    
    public double getINVproducidasF(){return INVproducidasF;}
    
    public double getCostoDeArticuloManofacturado(){return CostoDeArticuloManofacturado;}
    
    public double getUtilidadBruta(){return UtilidadBruta;}
    
    public double getGastoVariableDeVenta(){return GastoVariableDeVenta;}
    
    public double getGastoDeVenta_Y_Administracion(){return GastoDeVenta_Y_Administracion;}
    
    public double getUtilidadDeOperacion(){return UtilidadDeOperacion;}
    
    public double getPrecioDeVenta(){return PrecioDeVenta;}
    
    public double getCostoFijoDeProduccion(){return CostoFijoDeProduccion;}
    
    public double getCostoVariableDeProduccion(){return CostoVariableDeProduccion;}
    
    public double getCostoFijoDeProduccionUNITARIO(){return CostoFijoDeProduccionUNITARIO;}
    
    public double getCostoVariableDeProduccionUNITARIO(){return CostoVariableDeProduccionUNITARIO;}
    
    public double getGastosDeFinancieros(){return GastosDeFinancieros;}
                    
    public double getOtrosGastos(){return OtrosGastos;}
    
    public double getOtrosProductos(){return OtrosProductos;}
}

