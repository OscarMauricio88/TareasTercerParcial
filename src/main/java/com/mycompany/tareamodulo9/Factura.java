/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamodulo9;

import javax.swing.JOptionPane;

/**
 *
 * @author OscarMauricio
 */
public class Factura extends Producto{
    private double precio;
    private double cantidad;
    private double total;
    
    //Constructor
    public Factura(){}
    
    public Factura(double _precio, double _cantidad, double _total){}
    
    public void setPrecio(double _precio)
    {
        this.precio = _precio;
    }
    
    public void setCantidad(double _cantidad)
    {
        this.cantidad = _cantidad;
    }
    
    
    public double getPrecio()
    {
        return this.precio;
    }
    public double getCantidad()
    {
        return this.cantidad;
    }
    
   
    public void SetTotal(Double _precio, Double _cantidad)
    {
        total = _precio * _cantidad;
    }
     public double getTotal()
    {
        return this.total;
    }
    
}
