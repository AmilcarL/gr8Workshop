/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr8workshop;

import java.util.ArrayList;

/**
 *
 * @author asbjo
 */
public class BuildingSystem {
    private ArrayList<Building> buildings;
    
    public BuildingSystem(){
        buildings= new ArrayList<>();
    }
    
    public void add(Building building){
        buildings.add(building);
    }
    
    public void remove(Building building){
        buildings.remove(building);
    }
    
    public void printOverview(){
        for(Building building: buildings){
            System.out.println(building.toString());
        }
    }

  
}
