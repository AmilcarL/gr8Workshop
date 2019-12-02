/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr8workshop;
/*
 *
 * @author asbjo
 */
public class TemperatureSensor extends Sensor {
    private double value;
    String name;
    
    
    public TemperatureSensor()
    {
        
    }
    
    @Override
    public double getValue()
    {
        return this.value;
    }
    
    
}
