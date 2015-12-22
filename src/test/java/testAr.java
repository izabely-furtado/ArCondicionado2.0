/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ar.cdp.ArCondicionado;
import ar.cdp.sensor.MensagemMediator;
import ar.cdp.sensor.Sensor;
import ar.cdp.sensor.Sensor1;
import ar.cdp.sensor.Sensor2;
import ar.cdp.sensor.Sensor3;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author IzabelyFurtado
 */
public class testAr {
    
    public testAr() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void getTemp(){
        ArCondicionado ar = new ArCondicionado();
        assertEquals(25, ar.getTemp());
    }
    
    @Test
    public void setNovaTemp(){
        ArCondicionado ar = new ArCondicionado();
        Sensor s = new Sensor1(new MensagemMediator());
        ar.registerObserver(s);
        ar.setNovaTemp(27);
        assertEquals(27, ar.getTemp());
    }

    @Test
    public void resgisterObservers(){
        ArCondicionado ar = new ArCondicionado();
        Sensor s = new Sensor2(new MensagemMediator());
        ar.registerObserver(s);
        assertEquals(true, ar.getSensores().contains(s));
    }
    
    @Test
    public void removeObserver() { 
        ArCondicionado ar = new ArCondicionado();
        Sensor s = new Sensor3(new MensagemMediator());
        ar.registerObserver(s);
        ar.removeObserver(s);
        assertEquals(false, ar.getSensores().contains(s));
    } 
    
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
