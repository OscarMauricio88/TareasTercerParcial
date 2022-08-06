/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamodulo9;

/**
 *
 * @author OscarMauricio
 */
public class Producto {
   private String  codigo;
   private String nombre;
   //PrecioCantidad
    
   //Constructor
   public Producto()
   {
       this.setCodigo(codigo);
       this.setNombre(nombre);
       
   }
   
   public Producto(String _codigo, String _nombre)
   {}
   
   public void setCodigo(String _codigo)
   {
       this.codigo = _codigo;
   }
   public void setNombre(String _nombre)
   {
       this.nombre = _nombre;
   }
   
   public String getCodigo()
     {  
       return this.codigo;   
     }
   
   public String getNombre()
   {
       return this.nombre;
   }
}
