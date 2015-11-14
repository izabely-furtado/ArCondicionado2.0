/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.app;

import ar.cdp.ArCondicionado;
import ar.cdp.sensor.*;

/**
 *
 * @author IzabelyFurtado
 */
public class ControlAr {
    
    public static void inicializaControle(int novaTemperatura){
        //criando mediador
        MensagemMediator mediador = new MensagemMediator();
 
        //cria sensores
        Sensor s1 = new Sensor1(mediador);
        Sensor s2 = new Sensor2(mediador);
        Sensor s3 = new Sensor3(mediador);
        
        //adicionando sensores ao mediador
        mediador.addSensor(s1);
        mediador.addSensor(s2);
        mediador.addSensor(s3);
        
        //cria ar condicionado
        ArCondicionado arCond = new ArCondicionado(); 
        //add sensores
        arCond.registerObserver(s1); 
        arCond.registerObserver(s2); 
        arCond.registerObserver(s3); 
        //seta nova temparatura
        arCond.setNovaTemp(novaTemperatura);
    }
}
