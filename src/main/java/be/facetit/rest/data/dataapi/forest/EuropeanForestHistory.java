/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facetit.rest.data.dataapi.forest;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Beheerder
 */
public class EuropeanForestHistory {
    
    private String title;
    private Map<String,EuropeForestData> history;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String,EuropeForestData> getHistory() {
        return history;
    }

    public void setHistory(Map<String,EuropeForestData> history) {
        this.history = history;
    }
    
}
