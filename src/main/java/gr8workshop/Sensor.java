/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr8workshop;

import java.util.UUID;

/**
 *
 * @author asbjo
 */
public abstract class Sensor {
    private double value;
    private UUID id;
    private String name;

    public Sensor(double value, UUID id, String name) {
        this.value = value;
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public UUID getId() {
        return id;
    }

    
    
    
}
