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
public class EuropeForestData {
    private String country;
    private List<DamagedForestPercentage> damagedForest;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<DamagedForestPercentage> getDamagedForest() {
        return damagedForest;
    }

    public void setDamagedForest(List<DamagedForestPercentage> damagedForest) {
        this.damagedForest = damagedForest;
    }
    
    
}
