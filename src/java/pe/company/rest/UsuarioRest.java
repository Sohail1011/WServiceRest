/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package pe.company.rest;

import java.util.Collection;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Shelly
 */
@Path("version1")
public class UsuarioRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioRest
     */
    public UsuarioRest() {
    }

    /**
     * Retrieves representation of an instance of pe.company.rest.UsuarioRest
     *
     * @return an instance of java.lang.String
     */
    @Path("mensaje") //ruta URL -> /rest/version1/mensaje
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        String response = "Hello World with Web Service Rest";
        return response;
    }

    @Path("message1/{username}") //ruta URL -> /rest/version1/message1/{username}
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage1(@PathParam("username") String username) {
        String response = "Welcome " + username + "!";
        return response;
    }

    @Path("message2") //ruta URL -> /rest/version1/message2?username={username}
    @GET
    @Produces(MediaType.TEXT_HTML) //Indica que va producir información en texto HTML
    public String getMessage2(@QueryParam("username") String username) {
        String response = "<h3>Welcome " + username + "!</h3>";
        return response;
    }

    @Path("message3/{username}") //ruta URL -> /rest/version1/message3/{username}
    @GET
    @Produces(MediaType.TEXT_XML) //Indica que va producir información en texto XML
    public String getMessage3(@PathParam("username") String username) {
        String response = "<msg>Welcome " + username + "!</msg>";
        return response;
    }

}
