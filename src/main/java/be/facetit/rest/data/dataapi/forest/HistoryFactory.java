/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facetit.rest.data.dataapi.forest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Beheerder
 */
public class HistoryFactory {
    
    
    public EuropeanForestHistory createBeDuFrHistory() {
        EuropeanForestHistory bedufr = new EuropeanForestHistory();
        bedufr.setTitle("Amount of damaged trees in forests in %");
        Map<String, EuropeForestData> history = new HashMap<>();
        
        EuropeForestData data = new EuropeForestData();
        data.setCountry("Belgium"); 
        
        List<DamagedForestPercentage> belgium = createBelgiumHistory();
        data.setDamagedForest(belgium);
        history.put(data.getCountry(), data);
        
        data = new EuropeForestData();
        data.setCountry("Germany"); 
        
        List<DamagedForestPercentage> germany = createGermanyHistory();
        data.setDamagedForest(germany);
        history.put(data.getCountry(), data);
        
        data = new EuropeForestData();
        data.setCountry("France"); 
        
        List<DamagedForestPercentage> france = createGermanyHistory();
        data.setDamagedForest(france);
        history.put(data.getCountry(), data);
        
        bedufr.setHistory(history);
        
        return bedufr;
    }
    
    private List<DamagedForestPercentage> createBelgiumHistory() {
        List<DamagedForestPercentage> belgium = new ArrayList<>();
        
        DamagedForestPercentage percentage = new DamagedForestPercentage();
        percentage.setYear("2013");
        percentage.setPercentage("27.6");        
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2012");
        percentage.setPercentage("28.2");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2011");
        percentage.setPercentage("23.5");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2010");
        percentage.setPercentage("22.1");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2009");
        percentage.setPercentage("20.2");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2008");
        percentage.setPercentage("14.5");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2007");
        percentage.setPercentage("16.4");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2006");
        percentage.setPercentage("17.9");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2005");
        percentage.setPercentage("19.9");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2004");
        percentage.setPercentage("19.4");
        belgium.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2003");
        percentage.setPercentage("17.3");
        belgium.add(percentage);
        
        return belgium;
        
    }
    
    private List<DamagedForestPercentage> createFranceHistory() {
        List<DamagedForestPercentage> france = new ArrayList<>();
        
        DamagedForestPercentage percentage = new DamagedForestPercentage();
        percentage.setYear("2013");
        percentage.setPercentage("40.1");        
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2012");
        percentage.setPercentage("41.1");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2011");
        percentage.setPercentage("39.9");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2010");
        percentage.setPercentage("34.6");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2009");
        percentage.setPercentage("33.5");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2008");
        percentage.setPercentage("32.4");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2007");
        percentage.setPercentage("35.4");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2006");
        percentage.setPercentage("35.6");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2005");
        percentage.setPercentage("34.2");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2004");
        percentage.setPercentage("31.7");
        france.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2003");
        percentage.setPercentage("28.4");
        france.add(percentage);
        
        return france;
    }
    
    private List<DamagedForestPercentage> createGermanyHistory() {
        List<DamagedForestPercentage> germany = new ArrayList<>();
        
        DamagedForestPercentage percentage = new DamagedForestPercentage();
        percentage.setYear("2013");
        percentage.setPercentage("22.7");        
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2012");
        percentage.setPercentage("24.6");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2011");
        percentage.setPercentage("28");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2010");
        percentage.setPercentage("23.2");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2009");
        percentage.setPercentage("26.5");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2008");
        percentage.setPercentage("25.7");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2007");
        percentage.setPercentage("24.8");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2006");
        percentage.setPercentage("27.9");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2005");
        percentage.setPercentage("28.5");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2004");
        percentage.setPercentage("31.4");
        germany.add(percentage);
        
        percentage = new DamagedForestPercentage();
        percentage.setYear("2003");
        percentage.setPercentage("22.5");
        germany.add(percentage);
        
        return germany;
    }
}
