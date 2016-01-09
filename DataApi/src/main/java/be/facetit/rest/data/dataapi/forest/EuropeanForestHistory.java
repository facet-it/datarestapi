/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facetit.rest.data.dataapi.forest;

import java.util.List;

/**
 *
 * @author Beheerder
 */
public class EuropeanForestHistory {
    
    private String title;
    private List<EuropeForestData> history;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<EuropeForestData> getHistory() {
        return history;
    }

    public void setHistory(List<EuropeForestData> history) {
        this.history = history;
    }
    
}
