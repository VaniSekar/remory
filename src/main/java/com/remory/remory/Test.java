/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remory.remory;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Vani Sekar
 */
@Entity
public class Test {
    
    @Id 
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
