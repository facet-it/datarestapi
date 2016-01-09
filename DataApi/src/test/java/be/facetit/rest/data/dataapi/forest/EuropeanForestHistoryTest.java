/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facetit.rest.data.dataapi.forest;

import com.google.gson.Gson;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Beheerder
 */
public class EuropeanForestHistoryTest {
    
    public EuropeanForestHistoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class EuropeanForestHistory.
     */
    @Test
    public void testGetJson() {
        System.out.println("getTitle");
        HistoryFactory factory = new HistoryFactory();
        EuropeanForestHistory instance = factory.createBeDuFrHistory();
        
        Gson gson = new Gson();
        String result = gson.toJson(instance);
        
        System.out.println(result);
    }
    
    @Test
    public void testGetJsonForCountry() {
        
        HistoryFactory factory = new HistoryFactory();
        EuropeanForestHistory instance = factory.createBeDuFrHistory();
        
        EuropeForestData belgium = instance.getHistory().get("Belgium");
        
        Gson gson = new Gson();
        String result = gson.toJson(belgium);
        
        System.out.println(result);
    }
    
}
