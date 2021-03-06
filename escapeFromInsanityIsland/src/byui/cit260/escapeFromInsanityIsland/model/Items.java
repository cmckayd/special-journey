/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Christopher
 */

public class Items implements Serializable {
    
    private String name;
    private String description;
    private Game game;
    private Location location;
    
    //Item variable
    int numberHealthSyringes = 2;
    int healthSyringesHealAmount = 15;
    int healthSyringesDropChance = 20; //20 percent chance

    public Game getGame() {
        return game;
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public void setGame(Game game) {
        this.game = game;
    }
    
    public int getNumberHealthSyringes() {
        return numberHealthSyringes;
    }

    public void setNumberHealthSyringes(int numberHealthSyringes) {
        this.numberHealthSyringes = numberHealthSyringes;
    }

    public int getHealthSyringesHealAmount() {
        return healthSyringesHealAmount;
    }

    public void setHealthSyringesHealAmount(int healthSyringesHealAmount) {
        this.healthSyringesHealAmount = healthSyringesHealAmount;
    }

    public int getHealthSyringesDropChance() {
        return healthSyringesDropChance;
    }

    public void setHealthSyringesDropChance(int healthSyringesDropChance) {
        this.healthSyringesDropChance = healthSyringesDropChance;
    }
    
    public Items (){
        
    }
    
    public Items(String description, String name, Game game) {
        this.description = description;
        this.name = name;   
        this.game = game;        
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tool other = (Tool) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tool{" + "name=" + name + ", description=" + description + '}';
    }
    
}

