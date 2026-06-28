package literal.com.expose;

import com.literal.api.HealthApi;
import jakarta.ws.rs.core.Response;

public class HealthApiImpl implements HealthApi {
    @Override
    public Response healthGet() {
        return Response.ok("Funciona GET").build();
    }
}
