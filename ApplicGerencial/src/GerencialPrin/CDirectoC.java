/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerencialPrin;
import GerencialPrin.Base1;
import GerencialPrin.CDirecto;
/**
 *
 * @author Yasser Velasquez
 */
public class CDirectoC {
    double VentasNe/*Ventas netas*/,
            Inventario_I,
            Inventario_If/*inciail fijo*/,
            Inventario_Ff/*inventario final fijo*/,
            Inventario_F,
            Inventario_P
           ,Inventario_Pf
            ,CAManufacturado
            ,Costo_Ventas;
    CDirecto nuevo;
    public CDirectoC()
    {CDirecto.Ventas.setText(String.valueOf(VentasN()));
     CDirecto.Costo_Varaible_de_Inv_Inicial.setText(String.valueOf(Inv_I()+Inv_I_Fijo()+Inv_Iu()+Inv_I_Fijo_u()));
     CDirecto.Costo_Varaible_de_Inv_Produccion.setText(String.valueOf(
                                  Inv_P_F_u()/*titulo mal escrito, costo de produccion variable*/+Inv_Pu()));
     CDirecto.Costo_Varaible_de_Inv_Final.setText(String.valueOf(Inv_F()+Inv_F_Fijo()+Inv_F_Fijo_u()+Inv_Fu()));
     CDirecto.Costo_Variable.setText(String.valueOf(CAM1()));
     CDirecto.Margen_De_Contribucion.setText(String.valueOf(CAM()));
     CDirecto.Costo_Fijo_de_Inv_Inicial.setText(String.valueOf(Inv_P_Fijo_u()+Inv_P_Fijo()));
     CDirecto.Costo_Fijo_de_Inv_Final.setText(String.valueOf(UN()));
     CDirecto.Costo_Fijo_de_Inv_Produccion.setText(String.valueOf(Inv_P_Fijo_u()+Inv_P_Fijo()));
     
     
    }
    
    public double VentasN()
    {
        double tempVunds/*Precio de Unidades Vendidas */=Double.parseDouble(Base1.PrecioV.getText()),/*casteo de jtextField a double*/
                tempUndsV/*Unidades Vendidas*/=Double.parseDouble(Base1.UndsV.getText());
                
        return tempUndsV*tempVunds;
    }
    public double Inv_I()/*Cosot del inventario Inicial Variable*/
    {   if(Base1.Inv_I.getText().length()!=0&&Base1.Costo_V_P.getText().length()!=0)/*si tengo inv_I y tengo precio de produccion Varibale*/
                {double tempCost_V=Double.parseDouble(Base1.Costo_V_P.getText())/*retornar la multiplicacion de estos dos elementos*/
                ,tempInv_I=Double.parseDouble(Base1.Inv_I.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=(tempCost_V/tempInv_P)*tempInv_I;
                }
         return Inventario_I=0;
    }
    public double Inv_F()/*costo del inventario final variable */
    {   if(Base1.Costo_V_P.getText().length()!=0&&Base1.Inv_F.getText().length()!=0)/*||   ||   ||   ||   ||   ||   ||   ||   ||   ||   || */
                {double tempCost_V=Double.parseDouble(Base1.Costo_V_P.getText())
                ,tempInv_F=Double.parseDouble(Base1.Inv_F.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return (tempCost_V/tempInv_P)*tempInv_F;
                }
         return Inventario_F=0;
    }
    
    public double Inv_Iu()/*Cosot del inventario Inicial Variable unitario*/
    {   if(Base1.Inv_I.getText().length()!=0&&Base1.Cost_V_P_u.getText().length()!=0)/*si tengo inv_I y tengo precio de produccion Varibale*/
                {double tempCost_V=Double.parseDouble(Base1.Cost_V_P_u.getText())/*retornar la multiplicacion de estos dos elementos*/
                ,tempInv_I=Double.parseDouble(Base1.Inv_I.getText());
                return tempCost_V*tempInv_I;
                }
         return Inventario_I=0;
    }
    public double Inv_Fu()/*costo del inventario final variable unitaro*/
    {   if(Base1.Costo_V_P.getText().length()!=0&&Base1.Inv_F.getText().length()!=0)/*||   ||   ||   ||   ||   ||   ||   ||   ||   ||   || */
                {double tempCost_V=Double.parseDouble(Base1.Cost_V_P_u.getText())
                ,tempInv_F=Double.parseDouble(Base1.Inv_F.getText());
                return Inventario_F=tempCost_V*tempInv_F;
                }
         return Inventario_F=0;
    }
    /***********************************************************************************/
        public double Inv_I_Fijo()/*Cosot del inventario Inicial fijo*/
    {   if(Base1.Inv_I.getText().length()!=0&&Base1.Cost_F_P.getText().length()!=0)/*si tengo inv_I y tengo precio de produccion Varibale*/
                {double tempCost_F=Double.parseDouble(Base1.Cost_F_P.getText())/*retornar la multiplicacion de estos dos elementos*/
                ,tempInv_I=Double.parseDouble(Base1.Inv_I.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=(tempCost_F/tempInv_P)*tempInv_I;
                }
         return Inventario_If=0;
    }
    public double Inv_F_Fijo()/*costo del inventario final fijo*/
    {   if(Base1.Cost_F_P.getText().length()!=0&&Base1.Inv_F.getText().length()!=0)/*||   ||   ||   ||   ||   ||   ||   ||   ||   ||   || */
                {double tempCost_F=Double.parseDouble(Base1.Cost_F_P.getText())
                ,tempInv_F=Double.parseDouble(Base1.Inv_F.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=(tempCost_F/tempInv_P)*tempInv_F;
                }
         return Inventario_Ff=0;
    }
     public double Inv_I_Fijo_u()/*Cosot del inventario Inicial fijo unitario*/
    {   if(Base1.Inv_I.getText().length()!=0&&Base1.Cost_F_P_u.getText().length()!=0)/*si tengo inv_I y tengo precio de produccion Varibale*/
                {double tempCost_V=Double.parseDouble(Base1.Cost_F_P_u.getText())/*retornar la multiplicacion de estos dos elementos*/
                ,tempInv_I=Double.parseDouble(Base1.Inv_I.getText());
                return Inventario_I=tempCost_V*tempInv_I;
                }
         return Inventario_If=0;
    }
    public double Inv_F_Fijo_u()/*costo del inventario final fijo unitario*/
    {   if(Base1.Cost_F_P_u.getText().length()!=0&&Base1.Inv_F.getText().length()!=0)/*||   ||   ||   ||   ||   ||   ||   ||   ||   ||   || */
                {double tempCost_V=Double.parseDouble(Base1.Cost_F_P_u.getText())
                ,tempInv_F=Double.parseDouble(Base1.Inv_F.getText());
                return Inventario_F=tempCost_V*tempInv_F;
                }
         return Inventario_Ff=0;
    }
    
    /*****************************************************************************************/
    public double Inv_P_Fijo()/*costo del inventario final fijo*/
    {   if(Base1.Cost_F_P.getText().length()!=0&&Base1.Inv_P.getText().length()!=0)/*||   ||   ||   ||   ||   ||   ||   ||   ||   ||   || */
                {double tempCost_F=Double.parseDouble(Base1.Cost_F_P.getText())
                ,tempInv_F=Double.parseDouble(Base1.Inv_P.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=(tempCost_F/tempInv_P)*tempInv_F;
                }
         return Inventario_Ff=0;
    }
     public double Inv_P_Fijo_u()/*Cosot del inventario Inicial fijo unitario*/
    {   if(Base1.Inv_P.getText().length()!=0&&Base1.Cost_F_P_u.getText().length()!=0)/*si tengo inv_I y tengo precio de produccion Varibale*/
                {double tempCost_V=Double.parseDouble(Base1.Cost_F_P_u.getText())/*retornar la multiplicacion de estos dos elementos*/
                ,tempInv_I=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=tempCost_V*tempInv_I;
                }
         return Inventario_If=0;
    }
     public double Inv_Pu()/*Cosot del inventario Inicial Variable unitario*/
    {   if(Base1.Inv_P.getText().length()!=0&&Base1.Cost_V_P_u.getText().length()!=0)/*si tengo inv_I y tengo precio de produccion Varibale*/
                {double tempCost_V=Double.parseDouble(Base1.Cost_V_P_u.getText())/*retornar la multiplicacion de estos dos elementos*/
                ,tempInv_I=Double.parseDouble(Base1.Inv_P.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=(tempCost_V)*tempInv_P;
                }
         return Inventario_P=0;
    }
    public double Inv_P_F_u()/*costo del inventario final variable unitaro*/
    {   if(Base1.Cost_F_P.getText().length()!=0&&Base1.Inv_P.getText().length()!=0)/*||   ||   ||   ||   ||   ||   ||   ||   ||   ||   || */
                {double tempCost_V=Double.parseDouble(Base1.Costo_V_P.getText())
                ,tempInv_F=Double.parseDouble(Base1.Inv_P.getText())
                ,tempInv_P=Double.parseDouble(Base1.Inv_P.getText());
                return Inventario_I=(tempCost_V/tempInv_P)*tempInv_F;
                }
     return Inventario_Pf=0;
    }
    /*****************************************************************************************/
    public double CAM()
    {
         CAManufacturado=-(VentasN())
                 +((Inv_I()+Inv_Iu()+Inv_I_Fijo()+Inv_I_Fijo_u())
                 +(Inv_P_F_u()/*titulo mal escrito, costo de produccion variable*/+Inv_Pu())/*+Inventario_Pf*/)
                 -(Inv_F()+Inv_F_Fijo()+Inv_F_Fijo_u()+Inv_Fu());
         if(CAManufacturado<0)
         {  CAManufacturado*=-1;
             return CAManufacturado;
         }
         return CAManufacturado;
    }
    
    public double CAM1()
    {
         CAManufacturado=
                 +((Inv_I()+Inv_Iu()+Inv_I_Fijo()+Inv_I_Fijo_u())
                 +(Inv_P_F_u()/*titulo mal escrito, costo de produccion variable*/+Inv_Pu())/*+Inventario_Pf*/)
                 -(Inv_F()+Inv_F_Fijo()+Inv_F_Fijo_u()+Inv_Fu());
         if(CAManufacturado<0)
         {  CAManufacturado*=-1;
             return CAManufacturado;
         }
         return CAManufacturado;
    }
/****************************************************************************************/
public double Costo_venta()
{
return Costo_Ventas=VentasN()-CAM();
}
public double UN()/*utilidad neta*/{
    return Costo_venta()-(Inv_P_Fijo_u()+Inv_P_Fijo());
}
}