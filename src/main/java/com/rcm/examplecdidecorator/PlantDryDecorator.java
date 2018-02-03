/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcm.examplecdidecorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

/**
 *
 * @author nuriailaia
 */
@Decorator
public class PlantDryDecorator implements IPlant {

    @Inject
    @Delegate
    private IPlant plant;

    @Override
    public String originate() {
        String result = plant.originate();
        result += "<br>Apliquem sequera en el naixement de la planta";
        return result;
    }

    @Override
    public String grow() {
        String result = "Iniciem creixement de la planta en condicions de sequera";
        result += "<br>" + plant.grow();
        result += "<br>Finalitzem creixement de la planta en condicions de sequera";
        return result;
    }

    @Override
    public String die() {
        String result = "En condicions de sequera mort la planta";
        result += "<br>" + plant.die();
        return result;
    }

}
