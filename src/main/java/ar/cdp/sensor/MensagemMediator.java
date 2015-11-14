/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.cdp.sensor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IzabelyFurtado
 */
public class MensagemMediator implements Mediator{
    List<Sensor> sensores;
    
    public MensagemMediator(){
        sensores = new ArrayList();
    }
    
    public void addSensor(Sensor s){
        this.sensores.add(s);
    }
    
    @Override
    public void enviar(String mensagem, Sensor sensor) {
        for (Sensor s : this.sensores) {
            if (s != sensor) {
                definirProtocolo(s);
                s.receberMensagem(mensagem);
            }
        }
    }
    
    private void definirProtocolo(Sensor sensor) {
        if (sensor instanceof Sensor1) {
            System.out.println("Protocolo Sensor1");
        } else if (sensor instanceof Sensor2) {
            System.out.println("Protocolo Sensor2");
        } else if (sensor instanceof Sensor3) {
            System.out.println("Protocolo Sensor3");
        }
        else{
            throw new UnsupportedOperationException("Sensor não suportado");
        }
    }
    
}
