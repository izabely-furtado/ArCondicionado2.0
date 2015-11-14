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
public class Sensor3 extends Sensor{

    public Sensor3(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void receberMensagem(String mensagem){
        System.out.println("Sensor 3 recebeu: " + mensagem);
    }
}
