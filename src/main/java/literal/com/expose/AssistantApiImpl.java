package literal.com.expose;

import com.literal.api.AssistantsApi;
import jakarta.ws.rs.core.Response;

public class AssistantApiImpl implements AssistantsApi {
    @Override
    public Response assistantsGet() {
        return Response.ok("Funciona GET").build();
    }

    @Override
    public Response assistantsIdDelete(String id) {
        return Response.ok("Funciona DELETE").build();
    }

    @Override
    public Response assistantsIdGet(String id) {
        return Response.ok("Funciona GET for Id").build();
    }

    @Override
    public Response assistantsPost() {
        return Response.ok("Funciona POST").build();
    }
}
