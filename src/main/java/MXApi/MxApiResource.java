package MXApi;

import com.google.gson.Gson;
import org.xbill.DNS.TextParseException;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/MxApi")
public class MxApiResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDefaultResponse() {
        MxRecordHandler recordHandler = new MxRecordHandler();

        return new Gson().toJson(recordHandler.getMxTargets("oracle.com"));
    }
}
