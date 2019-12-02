
package gr8workshop;

import java.util.UUID;


public class Actuator {
    private double value; 
    private UUID id;

    public UUID getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
   }
