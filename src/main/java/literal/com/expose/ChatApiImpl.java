package literal.com.expose;

import com.literal.api.ChatApi;
import jakarta.ws.rs.core.Response;

public class ChatApiImpl implements ChatApi {

    @Override
    public Response chatHistoryGet() {
        return Response.ok("Funciona GET").build();
    }

    @Override
    public Response chatHistorySessionIdDelete(String sessionId) {
        return Response.ok("Funciona DELETE").build();
    }

    @Override
    public Response chatPost() {
        return Response.ok("Funciona POST").build();
    }
}
