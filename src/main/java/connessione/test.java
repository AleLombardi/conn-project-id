package connessione;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.client.Entity;
import javax.persistence.EntityManager;



public class test {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    	
    	//Persona  prova = new Persona("al","lom"); 
        
    	
    	
    	
    	Client client = ClientBuilder.newBuilder().build();
        WebTarget target = client.target("http://localhost:8080/pw-lombardi/resources");
        Response response = target.request().get();
        String users = response.readEntity(String.class);
        //System.out.println(users);
       
        
        
        
        
        
        
        
        String resp = target.path("users")
        		.resolveTemplate(users, args)
                .request().accept(MediaType.APPLICATION_JSON)
                
                .get(String.class);
                
        System.out.println(resp);
        //System.out.println(addr.getAddresses("id"));
       
    }

}