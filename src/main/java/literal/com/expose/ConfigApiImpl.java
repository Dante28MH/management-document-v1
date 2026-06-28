package literal.com.expose;

import com.literal.api.ConfigApi;
import jakarta.ws.rs.core.Response;

public class ConfigApiImpl implements ConfigApi {
    @Override
    public Response configGet() {
        return Response.ok("Funciona GET").build();
    }
}
