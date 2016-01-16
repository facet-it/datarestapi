/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facetit.rest.data.dataapi.forest;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/forest")
public class ForestRestApi {
    
    private HistoryFactory factory = new HistoryFactory();
    
    
    @GET
    @Path("/bedufr")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getfullBeDuFr(){
        EuropeanForestHistory history = factory.createBeDuFrHistory();
        Gson gson = new Gson();
        String result = gson.toJson(history);
        
        return Response.ok()
                       .entity(result)
                       .header("Access-Control-Allow-Origin", "*")
                       .header("Access-Control-Allow-Methods", "GET")
                       .build();
    }
    
    @GET
    @Path("/for/{country}")
    public Response getSpecificForestData(@PathParam("country") String country) {
        EuropeanForestHistory history = factory.createBeDuFrHistory();
        EuropeForestData countryData = null;
               
        if(history.getHistory().keySet().contains(country)){
            countryData = history.getHistory().get(country);
        }
        else {
            countryData = history.getHistory().get("Belgium");
        }
        
        Gson gson = new Gson();
        String result = gson.toJson(countryData);
        
        return Response.ok()
                       .entity(result)
                       .header("Access-Control-Allow-Origin", "*")
                       .header("Access-Control-Allow-Methods", "GET")
                       .build();
        
    }
    
}
