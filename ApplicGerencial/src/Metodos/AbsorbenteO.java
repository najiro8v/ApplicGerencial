/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.Serializable;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author casa
 */
public class AbsorbenteO implements Serializable  {
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
    public static void main(String [] args) 
    {
        File archivo=new File("m.txt");
        FileOutputStream salida=null;
        FileInputStream entrada=null;
        ObjectInputStream writer=null;
        ObjectOutputStream reader=null;
        AbsorbenteO temop=null;
        ArrayList <AbsorbenteO> tempA=new ArrayList<>();
        try {
            archivo.createNewFile();
            salida=new FileOutputStream(archivo);
            reader=new ObjectOutputStream(salida);
            temop=new AbsorbenteO();
            reader.writeObject(temop);
        } catch (IOException ex) {
            Logger.getLogger(AbsorbenteO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(salida!=null){
            try {
                salida.close();
                if(reader!=null){
                reader.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AbsorbenteO.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        };
    }
}
