/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facetit.rest.data.dataapi.forest;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
    
}
