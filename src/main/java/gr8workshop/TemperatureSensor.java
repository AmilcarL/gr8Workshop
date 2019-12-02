/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr8workshop;

import java.util.UUID;
/*
 *
 * @author asbjo
 */
public class TemperatureSensor extends Sensor {
    private double value;
    
    
    public TemperatureSensor(double value, UUID id )
    {
    }
    
    public double getValue()
    {
        return this.value;
    }
    
    public void setVale()
    {
        value = this.value;
    }
}
