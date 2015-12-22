/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.cdp;

import ar.cdp.sensor.Sensor;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 20121bsi0040
 */
public class ArCondicionado extends Observable{
    List<Sensor> sensores;
    private int temperatura;
    
    public ArCondicionado(){
        this.sensores = new ArrayList();
        this.temperatura = 25;
    }
    
    public List<Sensor> getSensores(){
        return this.sensores;
    }
    
    public int getTemp(){
        return this.temperatura;
    }
    
    public void setNovaTemp(int temperatura){
        this.temperatura = temperatura;
        setChanged();
        this.notifyObservers();
    }
    
    public void registerObserver(Sensor observer) { 
        this.sensores.add(observer);
    } 
    
    public void removeObserver(Sensor observer) { 
        this.sensores.remove(observer);
    } 
    
    @Override 
    public void notifyObservers() {
        // Chama o método de atualização de todos os observers disponíveis. 
        for (Sensor ob : this.sensores) { 
            System.out.println("Notificando observers!"); 
            ob.receberMensagem(" ");
            ob.update(this, this.temperatura);
        } 
    }

    
    
}
