package literal.com.expose;

import com.literal.api.DocumentsApi;
import jakarta.ws.rs.core.Response;

import java.io.InputStream;

public class DocumentApiImpl implements DocumentsApi {


    @Override
    public Response documentsGet() {
        return Response.ok("Funciona GET").build();
    }

    @Override
    public Response documentsIdDelete(String id) {
        return Response.ok("Funciona delete").build();
    }

    @Override
    public Response documentsIdGet(String id) {
        return Response.ok("Funciona GET for Id").build();
    }

    @Override
    public Response documentsUploadPost(InputStream _fileInputStream) {
        return Response.ok("Funciona POST").build();
    }
}
