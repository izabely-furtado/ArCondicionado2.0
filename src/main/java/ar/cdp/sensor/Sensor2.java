/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.cdp.sensor;

/**
 *
 * @author IzabelyFurtado
 */
public class Sensor2 extends Sensor{

    public Sensor2(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void receberMensagem(String mensagem){
        System.out.println("Sensor 2 recebeu: " + mensagem);
    }
}
