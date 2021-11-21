package org.vsb.project.post.entities;

import javax.persistence.Entity;

/**
 * @author Lukas Papik 17.11.2021
 */
public class Package extends Packet {
    @Override
    public void setWeight(double weight) {
        if (weight > 10){
            throw new Exception("Invalid weigth");
        }
        super.setWeight(weight);
    }
}
