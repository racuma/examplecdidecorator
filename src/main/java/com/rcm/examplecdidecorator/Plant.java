/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcm.examplecdidecorator;

import javax.ejb.Stateless;

/**
 *
 * @author nuriailaia
 */
@Stateless
public class Plant implements IPlant{

    @Override
    public String originate() {
        return "Neix la planta";
    }

    @Override
    public String grow() {
        return "Creix la planta";
    }

    @Override
    public String die() {
        return "Mort la planta";
    }
    
}
