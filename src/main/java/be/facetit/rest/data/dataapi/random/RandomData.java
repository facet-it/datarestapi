package be.facetit.rest.data.dataapi.random;

import com.google.gson.Gson;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/random")
public class RandomData {

    private SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    
    @GET
    @Path("/triple")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRandomTriple() {
        
        RandomTriple triple = new RandomTriple();
        triple.setNumber(createRandomNumber());
        triple.setText(randomString());
        triple.setTime(format.format(new Date(System.currentTimeMillis())));
        
        Gson gson = new Gson();
        String randomTriple = gson.toJson(triple);
        
        return Response.ok()
                       .entity(randomTriple)
                       .header("Access-Control-Allow-Origin", "*")
                       .header("Access-Control-Allow-Methods", "GET")
                       .build();
    }
    
    private int createRandomNumber() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100);
    }
    
    private String randomString() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }
}
