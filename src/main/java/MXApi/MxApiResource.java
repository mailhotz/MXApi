package MXApi;

import com.google.gson.Gson;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/MxApi")
public class MxApiResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDefaultResponse() {
        return new Gson().toJson(new MxRecordHandler().getMxTargets("oracle.com"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{domain}")
    public String getMxDomainResponse(@PathParam("domain") String domain){
        return new Gson().toJson(new MxRecordHandler().getMxTargets(domain));
    }
}
