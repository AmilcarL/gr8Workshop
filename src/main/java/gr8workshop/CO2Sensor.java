/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr8workshop;

/**
 *
 * @author asbjo
 */
public class CO2Sensor extends Sensor {
    private double value;
    
    
    public CO2Sensor()
    {
        
    }
    
    public double getValue()
    {
        return this.value;
    }
    
    public double setValue()
    {
        value = this.value;
        return value;
    }
    
    /*public String toString()
    {
       
    }*/
    
}
